package Dao;

import Model.Odontologo;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;

public class OdontologoDAOList {
    private static final Logger logger= Logger.getLogger(OdontologoDAOList.class);
    private ArrayList<Odontologo> odontologos = new ArrayList<>();

    public void guardarOdontologo(Odontologo odontologo) {
        odontologos.add(odontologo);
        logger.info("Odontólogo guardado en memoria: " + odontologo);
    }

    public ArrayList<Odontologo> listarOdontologos() {
        logger.info("Listado de odontólogos en memoria obtenido.");
        return new ArrayList<>(odontologos);
    }
}
