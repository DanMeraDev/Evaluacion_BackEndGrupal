package Dao;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {
    private static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS ODONTOS; " +
            "CREATE TABLE ODONTOS (ID INT AUTO_INCREMENT, MATRICULA INT NOT NULL, NOMBRE VARCHAR(100), APELLIDO VARCHAR(100))";
    private static final Logger logger = Logger.getLogger(BD.class);

    public static void crearTablas() {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            logger.info("Tabla creada con éxito");
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
    }

    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection("jdbc:h2:~/Evaluacion_BackEnd", "sa", "sa");
    }
}
