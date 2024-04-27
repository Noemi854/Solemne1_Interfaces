import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseSingleton {
    // URL de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/VeterinariaS3";
    private static final String USER = "admin";
    private static final String PASSWORD = "123456";

    // Instancia única de la conexión
    private static Connection connection;

    // Método para obtener la instancia única de la conexión (Singleton)
    public static Connection getConnection() {
        if (connection == null) {
            // Si la conexión aún no está establecida, la creamos
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace(); // Maneja la excepción adecuadamente en tu aplicación
            }
        }
        return connection;
    }

    // Método para cerrar la conexión
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Maneja la excepción adecuadamente en tu aplicación
            }
        }
    }
}
