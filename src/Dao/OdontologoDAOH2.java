package Dao;

import Model.Odontologo;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements iDao<Odontologo> {
    private static final Logger logger= Logger.getLogger(OdontologoDAOH2.class);
    private static final String SQL_INSERT = "INSERT INTO ODONTOS (MATRICULA, NOMBRE, APELLIDO) VALUES(?,?,?)";
    private static final String SQL_SELECT = "SELECT * FROM ODONTOS";



    @Override
    public Odontologo guardar(Odontologo odontologo) {
        logger.info("Iniciando el guardado");
        Connection connection = null;
        try {
            connection = BD.getConnection();
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            psInsert.setInt(1, odontologo.getMatricula());
            psInsert.setString(2, odontologo.getNombre());
            psInsert.setString(3, odontologo.getApellido());
            psInsert.execute();
            logger.info("Datos insertados correctamente");
            ResultSet rs = psInsert.getGeneratedKeys();
            while (rs.next()) {
                odontologo.setId(rs.getInt(1));
            }

        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
        return odontologo;
    }

    @Test
    @Override
    public void buscarTodos() {
        logger.info("Iniciando la busqueda");
        Connection connection = null;
        try {
            connection = BD.getConnection();
            PreparedStatement psSelect = connection.prepareStatement(SQL_SELECT);
            psSelect.executeQuery();
            logger.info("Query ejecutado");
            ResultSet rs = psSelect.executeQuery();
            while (rs.next()){
                int id = rs.getInt("ID");
                int matricula = rs.getInt("MATRICULA");
                String nombre = rs.getString("NOMBRE");
                String apellido = rs.getString("APELLIDO");

                System.out.println("ID: " + id + ", Matrícula: " + matricula + ", Nombre: " + nombre + ", Apellido: " + apellido);
            }


        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
    }



}
