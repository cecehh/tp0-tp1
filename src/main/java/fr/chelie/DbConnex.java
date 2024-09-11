package fr.chelie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnex {

    public static Connection connection(){
        try{
                return DriverManager.getConnection("jdbc:mysql://localhost:3306/notes_db","root","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
