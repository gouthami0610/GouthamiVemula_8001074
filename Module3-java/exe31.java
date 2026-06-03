// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;

// public class exe31 {
//      public static void main(String[] args) {

//         String url = "jdbc:mysql://localhost:3306/studentdb";
//         String user = "root";
//         String password = "root";

//         try {
//             Connection con = DriverManager.getConnection(url, user, password);

//             Statement st = con.createStatement();

//             ResultSet rs = st.executeQuery("SELECT * FROM students");

//             while(rs.next()) {
//                 System.out.println(
//                     rs.getInt("id") + " " +
//                     rs.getString("name")
//                 );
//             }
//               con.close();

//         } catch(Exception e) {
//             e.printStackTrace();
//         }
//     }
// }


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
 import java.sql.ResultSet;


public class exe31{

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM students");

            System.out.println("ID\tNAME\tAGE");

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getInt("age")
                );
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
