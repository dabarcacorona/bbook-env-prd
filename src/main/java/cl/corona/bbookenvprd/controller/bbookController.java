package cl.corona.bbookenvprd.controller;

import cl.corona.bbookenvprd.model.bbookJsonPrd;
import cl.corona.bbookenvprd.repository.*;
import cl.corona.bbookenvprd.service.bbookGeneralService;
import cl.corona.bbookenvprd.service.bbookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.math.BigDecimal;

@RestController
@RequestMapping("/api/CreaPRD")
public class bbookController {


    private static final Logger LOG = LoggerFactory.getLogger(bbookController.class);

    @Value("${tokken}")
    private String tokken;


    @Autowired
    private bbookService bbookservice;

    @Autowired
    private bbookSpInvoke bbookspinvoke;

    @Autowired
    private bbookGeneralService bbookgeneralservice;

    @Autowired
    private bbookSdiprcediRepository bbooksdiprcedirepository;

    @Autowired
    private bbookSdiprcehiRepository bbooksdiprcehirepository;

    @Autowired
    private bbookSdiprdatiRepository bbooksdiprdatirepository;

    @Autowired
    private bbookSdiprddsiRepository bbooksdiprddsirepository;

    @Autowired
    private bbookSdiprddssRepository bbooksdiprddssrepository;

    @Autowired
    private bbookSdiprdmsiRepository bbooksdiprdmsirepository;

    @Autowired
    private bbookSdivpccsiRepository bbooksdivpccsirepository;

    @Autowired
    private bbookMtcsdivpcpvrRepository bbookmtcsdivpcpvrrepository;

    @Autowired
    private EntityManager entityManager;


    @PostMapping()
    @ResponseBody
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    //public Optional<BbookJson> guardarJsob(@RequestBody String StrBbookJson, @RequestHeader(value="Authorization") String token) throws IOException{
    public String  guardarJsob(@RequestBody String StrBbookJson, @RequestHeader(value="Authorization") String token) throws IOException {
        String response;
        if(token == null) {

            return "{\"status\":\"Err\",\"statusCode\":401,\"internalCode\":\"00\",\"message\":\"Unauthorized\",\"alert\":\"Llamada sin token \"}";
        }

        if(token.equals(tokken)) {

            BigDecimal id_bk = (BigDecimal) entityManager.createNativeQuery("select bbook_number.nextval from dual").getSingleResult();
            bbookJsonPrd bbookjson = new bbookJsonPrd(id_bk.longValue(),StrBbookJson, null);

            try {
                bbookservice.guardarJsob(bbookjson);
            }catch (Exception e) {
                LOG.debug("{} Err al guardar json ", e);
                return "{\"status\":\"Err\",\"statusCode\":000,\"internalCode\":\"01\",\"message\":\"Error al guardar json\",\"alert\":\"Error al guardar json\"}";
            }

            try {
                bbookspinvoke.CallSp(id_bk.longValue());
            }catch (Exception e) {
                LOG.debug("{} El Proceso Almacenado BBOOK CARGA PRD con error", e);
                return "{\"status\":\"Err\",\"statusCode\":000,\"internalCode\":\"02\",\"message\":\"Error sp carga prd\",\"alert\":\"Error sp carga prd\"}";
            }

            try {
                bbookgeneralservice.llamadaGeneral(id_bk.longValue());

            } catch (InvalidDataAccessResourceUsageException e) {
                LOG.error("{}: Ocurrio un error al momento de enviar las PRD: ", e );
                return "{\"status\":\"Err\",\"statusCode\":000,\"internalCode\":\"03\",\"message\":\"Error al enviar prd a pmm\",\"alert\":\"Error al enviar prd a pmm\"}";
            }

            bbooksdiprcedirepository.updSdiprcedi(id_bk.longValue());
            bbooksdiprcehirepository.updSdiprcehi(id_bk.longValue());
            bbooksdiprdatirepository.updSdiprdati(id_bk.longValue());
            bbooksdiprddsirepository.updSdiprddsi(id_bk.longValue());
            bbooksdiprddssrepository.updSdiprddss(id_bk.longValue());
            bbooksdiprdmsirepository.updSdiprdmsi(id_bk.longValue());
            bbooksdivpccsirepository.updSdivpccsi(id_bk.longValue());
            bbookmtcsdivpcpvrrepository.updMtcSdivpcpvr(id_bk.longValue());


            return "{\"status\":\"OK\",\"statusCode\":201,\"internalCode\":\"00\",\"message\":\"Created\",\"alert\":\"Solicitud de producto creada\"}";

        } else {

            return "{\"status\":\"Err\",\"statusCode\":403,\"internalCode\":\"00\",\"message\":\"Forbidden\",\"alert\":\"Llamada con token invalido\"}";
        }

    }
}
