package Service;

import Dao.OdontologoDAOH2;
import Dao.iDao;
import Model.Odontologo;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoiDao = new OdontologoDAOH2();
    }
    public Odontologo guardarOdontolo(Odontologo odontologo) {
        return odontologoiDao.guardar(odontologo);
    }

}
