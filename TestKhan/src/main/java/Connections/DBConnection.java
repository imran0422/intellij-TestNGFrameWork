package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Connection co = DriverManager.getConnection("http://127.0.0.1:8080/apex/f?p=4550:11:2458092923769774::NO:::", "system", "password");
            /*
             * Statement stmt = co.createStatement(); String S = "select * from employees";
             * ResultSet rs = stmt.executeQuery(S);
             *
             * while(rs.next()) { String firstName = rs.getString("first_name");
             * System.out.println(firstName); }
             */
            System.out.println("connection success");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
