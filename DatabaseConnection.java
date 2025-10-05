import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/college_admission";
    private static final String USER = "root";   // apna MySQL username daalo
    private static final String PASSWORD = "root"; // apna MySQL password daalo

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}