/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author hp
 */
public class Program {
    public static void main(String[] args) {
    try{ 
      Driver driver = new Driver();
      DriverManager.registerDriver(driver);
        System.out.println("Berhasil Register Driver");
    }catch(SQLException ex){
        System.out.println("Gagal Registrasi Driver");
        System.out.println("Pesan : " + ex.getMessage());        
    }
    try{
       String url="jdbc:mysql://localhost:3306/db_toko";
       String user="root";
       String pass="";
       Connection koneksi = DriverManager.getConnection(url, user, pass);
          System.out.println("Berhasil Terhubung ke Database");  
    }catch(SQLException ex){
         System.out.println("Gagal Terhubung ke Database");
         System.out.println("Pesan:"+ex.getMessage());
    }
    }   
}
