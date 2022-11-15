/**
 *
 * @author SMARTPHONE
 */
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
public class ProgramInsert {
    public static void main(String[] args) {
    Connection koneksi = KoneksiDatabase.getKoneksi();
    Statement statement = null;
    try{
        statement= koneksi.createStatement();
        System.out.println("Statement berhasil dibuat");
    String url = "INSERT INTO barang(kode_barang,nama_barang,jumlah,harga)VALUES('F1','AKI',5,500000)";
    statement.executeUpdate(url);
    }catch(SQLException ex){
        System.out.println("Statement gagal dibuat");
        System.out.println("Pesan : " + ex.getMessage());        
   }finally{
    if(statement != null){
    try{
       statement.close();
       System.out.println("Statement Berhasil Ditutup");
    }catch(SQLException ex){
     System.out.println("Statement Gagal Ditutup");   
     System.out.println("Pesan : " + ex.getMessage());  
    }
   }    
  } 
 }   
}
