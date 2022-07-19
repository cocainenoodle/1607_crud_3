import java.sql.*;

public class DBlogic {

      String DB = "jdbc:mysql://127.0.0.1:3306/07_crud";
      String USER = "root";
      String PASS = "biskviits";

      //insert
    public void insert() {

        try{

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();


            String sql = "INSERT INTO users (email, name) VALUES ('m@m.lv', 'Madars')";

            stmt.executeUpdate(sql);

            System.out.println("dati ir ievaditi");


        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    //delete
    public void delete() {

        try{

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();


            String sql = "DELETE FROM users WHERE id = 1";

            stmt.executeUpdate(sql);

            System.out.println("dati ir izdzesti");


        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    //update
    public void update() {

        try{

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();


            String sql = "UPDATE users SET email = 'hey@hey.lv' WHERE id = 3";

            stmt.executeUpdate(sql);

            System.out.println("dati ir atjaunoti");


        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    //select
    public void select() {

        try{

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT id, email, name FROM users ");

            String sql = "UPDATE users SET email = 'hey@hey.lv' WHERE id = 3";

           while(rs.next()) {

               System.out.println("id: " + rs.getInt("id"));
               System.out.println("e-mail: " + rs.getString("email"));
               System.out.println("name: " + rs.getString("name"));
               System.out.println(" ");
           }


        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
