/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.satu;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
import java.sql.*;
public class KONEKSI {
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/penjualan_barang";
    static final String USER = "root";
    static final String UPASS = "";
    static Connection conn;
    static Statement stat;
    
    public static void konek() {
        try{
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(URL, USER, UPASS);
        stat =conn.createStatement();
            System.out.println("berhasil");
        } catch(Exception e){
            System.out.println("koneksi gagal ");
        }
    }
    public static void main (String[] args) {
        konek ();
    }  
}