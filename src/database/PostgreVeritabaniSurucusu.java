package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreVeritabaniSurucusu implements IVeritabaniSurucusu{

    private Connection connect() {
        Connection conn = null;
        try {
            //Get.class();
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/akillicihazdatabase", "postgres", "furkan");
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    @Override
    public boolean giris(String kullaniciAdi, String sifre) {
        
        Connection myConnection = connect();
                
        return false;
    }
    
}
