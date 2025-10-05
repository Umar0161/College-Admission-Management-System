import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {
    public void registerStudent(Student student) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO Students (name, email, marks) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getEmail());
            stmt.setInt(3, student.getMarks());
            stmt.executeUpdate();
            System.out.println("🎉 Student registered successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}