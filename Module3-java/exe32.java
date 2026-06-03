import java.sql.Connection;
import java.sql.PreparedStatement;

public class exe32 {
    //class StudentDAO {

    Connection con;

    StudentDAO(Connection con) {
        this.con = con;
    }

    void insertStudent(int id, String name) throws Exception {
        String sql = "INSERT INTO students VALUES (?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.setString(2, name);
          ps.executeUpdate();
    }

    void updateStudent(int id, String name) throws Exception {
        String sql = "UPDATE students SET name=? WHERE id=?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setInt(2, id);

        ps.executeUpdate();
    }
}
