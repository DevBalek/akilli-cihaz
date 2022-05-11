package database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreVeritabaniSurucusu implements IVeritabaniSurucusu {

    private Connection connect() {
        Connection conn = null;

        try {
            // Get.class();
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/akillicihazdatabase", "postgres",
                    "furkan");
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    @Override
    public boolean giris(String kullaniciAdi, String sifre) {

        try {
            boolean girisDurumu;

            Connection connection = this.connect(); // Veritabanı bağlantısı yapılır

            // Konsoldan girilen bilgilere uygun kişiyi veritabanından seçmek için gerekli
            // SQL sorgusu yazılır
            String sql = "SELECT *  FROM \"_User\" WHERE \"userName\"='" + kullaniciAdi + "' and \"password\"='" + sifre
                    + "'";

            // Sorgu çalıştırılır
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Veritabanı bağlantısı sonlandırılır
            connection.close();

            Thread.sleep(500);
            if (!rs.next()) { // Veritabanından dönen ResultSet boş ise böyle bir kullanıcı yoktur
                System.out.println("Kullanici bulunamadi");
                girisDurumu = false;
            } else { // ResultSet boş değilse giriş başarılıdır
                System.out.println("Giris Basarili");
                girisDurumu = true;
            }

            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();

            return girisDurumu;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
