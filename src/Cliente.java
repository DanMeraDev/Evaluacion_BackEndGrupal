import Dao.BD;
import Dao.OdontologoDAOH2;
import Dao.OdontologoDAOList;
import Model.Odontologo;
import Service.OdontologoService;

import java.util.ArrayList;

public class Cliente {
    public static void main(String[] args) {
        //
        BD.crearTablas();
        Odontologo odontologo = new Odontologo(1234, "Jose", "Perez");
        Odontologo odontologo1 = new Odontologo(1232344, "Jorge", "Peldanyos");
        Odontologo odontologo2 = new Odontologo(122342334, "Jonathan", "Pereira");
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.guardarOdontolo(odontologo);
        odontologoService.guardarOdontolo(odontologo1);
        odontologoService.guardarOdontolo(odontologo2);
        OdontologoDAOH2 odontologoDAOH2 = new OdontologoDAOH2();
        System.out.println("----------------------");
        System.out.println("Lista de Odontologos: ");
        odontologoDAOH2.buscarTodos();
        System.out.println("----------------------");

        OdontologoDAOList odontologoDAOList = new OdontologoDAOList();
        odontologoDAOList.guardarOdontologo(odontologo1);
        ArrayList<Odontologo> lista =  odontologoDAOList.listarOdontologos();
        for (Odontologo odontologoActual : lista) {
            System.out.println(odontologoActual);
        }
    }
}
