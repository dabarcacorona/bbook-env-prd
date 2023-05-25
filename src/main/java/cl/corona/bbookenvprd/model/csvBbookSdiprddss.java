package cl.corona.bbookenvprd.model;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class csvBbookSdiprddss {
    private String[] csvLine;

    private csvBbookSdiprddss() {
    }

    public csvBbookSdiprddss(bbookSdiprddss bbooksdiprddss) {

        setCsvLine(bbooksdiprddss);
    } // fin CsvDetalleCuadraturaRcvWm(CuadraturaRcvWms cuadraturaRcvWms)

    public String[] getCsvLine() {
        return csvLine;
    } // fin String[] getCsvLine()

    private void setCsvLine(Object entityObjectWithProtectedFields) {

        List<String> result = new ArrayList<>();

        List<Field> protectedFields = Arrays.stream(entityObjectWithProtectedFields.getClass().getDeclaredFields())
                .filter(f -> Modifier.isProtected(f.getModifiers()))
                .collect(Collectors.toList());

        if (protectedFields!=null) {
            for(Field f : protectedFields) {

                final String name = f.getName();
                String value = "";
                try {
                    value = f.get(entityObjectWithProtectedFields).toString();
                    String dummy = "";
                } catch (NullPointerException e) {
                    value = "";
                } catch (Exception e) {
                    final String toDoSth = "";
                }

                result.add(value);
            } // fin iteracion campos tipo protected
        }

        csvLine = result.toArray(new String[0]);
    } // fin void setCsvLine(

    /**
     * Metodo utilitario para retornar los nombres de los miembros protected de la clase padre (los campos del csv requeridos)
     *
     * @return Arreglo de Strings con el nombre de todos los encabezados
     */
    public static String[] getHeader() { // getProtectedFieldsFromSuperClass() {

        return csvBbookSdiprddss.getProtectedFieldsFromClass(bbookSdiprddss.class);

    } // fin static String[] getMembersName()

    /**
     *
     * @param pageNumber
     * @param pageSize
     * @return PageRequest.of(pageNumber, pageSize, Sort.by("fechaProceso"));
     */
    public static Pageable pageToRequestDetail(int pageNumber, int pageSize) {

        return PageRequest.of(pageNumber, pageSize, Sort.by("id")); // TODO: Parametrizar ordenamiento
    } // Pageable pageToRequestDetail(int pageNumber, int pageSize)


    public static String[] getProtectedFieldsFromClass(Class clazz) {

        List<String> result = new ArrayList<>();

        List<Field> protectedFields = Arrays.stream(clazz.getDeclaredFields())
                .filter(f -> Modifier.isProtected(f.getModifiers()))
                .collect(Collectors.toList());

        if (protectedFields!=null) {
            for(Field f : protectedFields) {

                result.add(f.getName());
            }
        }

        return result.toArray(new String[0]);
    }
}
