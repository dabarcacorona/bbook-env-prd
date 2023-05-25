package cl.corona.bbookenvprd.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

@Repository
public class bbookSpInvoke {

    private static final Logger LOG = LoggerFactory.getLogger(bbookSpInvoke.class);

    public static String  statusSpOut;

    public static String descErrorSpOut;

    private EntityManager entityManager;

    public bbookSpInvoke(EntityManager entityManager) {
        this.entityManager = entityManager;
    } // end constructor injection


    public void CallSp(long in_num_proc_x) throws Exception {

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("BBOOK_CARGA_PRD");

        // Registrar los parámetros de entrada y salida
        storedProcedureQuery.registerStoredProcedureParameter("in_num_proc", long.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ou_Status_Proc", long.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter("ou_Desc_Error", String.class, ParameterMode.OUT);


        // Configuramos el valor de entrada
        storedProcedureQuery.setParameter("in_num_proc", in_num_proc_x);

        // Realizamos la llamada al procedimiento
        try {
            storedProcedureQuery.execute();
            LOG.debug("El Proceso Almacenado BBOOK CARGA OC fue ejecutado con exito");
        } catch (Exception e) {
            LOG.error("{} Ocurrio un error gatillando el Proceso Almacenado BBOOK CARGA OC ", e);
        }

        //storedProcedureQuery.execute();
        // Obtenemos los valores de salida
        final String statusSpReturn = storedProcedureQuery.getOutputParameterValue("ou_Status_Proc").toString();
        final String descSpReturn = storedProcedureQuery.getOutputParameterValue("ou_Desc_Error").toString();

        statusSpOut = statusSpReturn;
        descErrorSpOut = descSpReturn;
    }

}
