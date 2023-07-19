package cl.corona.bbookenvprd.service;


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import cl.corona.bbookenvprd.model.bbookSdiprdmsi;
import cl.corona.bbookenvprd.model.csvBbookSdiprdmsi;
import cl.corona.bbookenvprd.repository.bbookSdiprdmsiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.ICSVWriter;

@Service
@Transactional
public class bbookSdiprdmsiService {

    @Autowired
    bbookSdiprdmsiRepository bbooksdiprdmsirepository;

    private static final Logger LOG = LoggerFactory.getLogger(bbookSdiprdmsiService.class);

    public  List<bbookSdiprdmsi> writeToCsvDetailCsv(String archivo, String ruta, long idn) {
        final String pathCompletoArchivoResultanteDescarga = ruta+archivo;
        final String ColumnasCsv= ";";
        List<bbookSdiprdmsi> ResultsToWriteIntoCsv=null;

        // Streams para escribir csv
        FileWriter fileWriter = null;
        ICSVWriter csvWriter = null;

        int linesWrittenIntoCsv = 0;

        try {

            // Streams para leer y escribir csv
            //fileWriter = new FileWriter(pathCompletoArchivoResultanteDescarga);
            //csvWriter = new CSVWriterBuilder(fileWriter)
            FileOutputStream fos = new FileOutputStream(pathCompletoArchivoResultanteDescarga);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.ISO_8859_1);
            csvWriter = new CSVWriterBuilder(osw)
                    .withLineEnd(CSVWriter.DEFAULT_LINE_END)
                    .withQuoteChar(CSVWriter.NO_QUOTE_CHARACTER)
                    .withSeparator(ColumnasCsv.charAt(0))
                    .build();

            // Escribiendo el encabezado del archivo resultante.
            // Orden esta definido en metodo estatico utilitario de CsvDetalleCuadraturaRcvWms
            // y corresponde a como se declararon los miembros, del tipo "protected", en clase CuadraturaRcvWms
            final String[] fieldNamesToWriteIntoCsv = csvBbookSdiprdmsi.getHeader();
            csvWriter.writeNext(fieldNamesToWriteIntoCsv);
            linesWrittenIntoCsv++;

            ResultsToWriteIntoCsv = new ArrayList<>();

            try {
                ResultsToWriteIntoCsv=bbooksdiprdmsirepository.findByDownloadDate1IsNullAndBatchNum(idn);
                //totreg = ResultsToWriteIntoCsv.size();
            } catch (Exception e) {

                LOG.error("Error al {}",  e);

            }
            for(bbookSdiprdmsi row : ResultsToWriteIntoCsv) {

                final String[] fieldValuesToWriteIntoCsv  = new csvBbookSdiprdmsi(row).getCsvLine();
                csvWriter.writeNext(fieldValuesToWriteIntoCsv);
                csvWriter.flush();
                linesWrittenIntoCsv++;
            } // fin iteracion resultados pagina

        } catch (Exception e) {

            LOG.error("Error al escribir archivo CSV en  Archivo {}", pathCompletoArchivoResultanteDescarga, e);

        } // fin validacion paginas iteradas corresponde al total existente en la BD

        finally {

            // Asegurandose de cerrar los potenciales streams abiertos

            if (csvWriter!=null) {
                try {
                    csvWriter.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                    LOG.error("Error al cerrar stream csvWriter", e);
                }
            } // fin cierre csvWriter

            if (fileWriter!=null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    //e.printStackTrace();
                    LOG.error("Error al cerrar stream fileWriter ", e);
                }
            } // fin cierre fileWriter
        } // fin finally

        return ResultsToWriteIntoCsv;
    }

}
