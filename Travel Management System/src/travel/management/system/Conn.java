package travel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;
    Conn() {
        try{

        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/TravelAndTourismManagementSystem","root","Madhuri@100");
        statement=connection.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
