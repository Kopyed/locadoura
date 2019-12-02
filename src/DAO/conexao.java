package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexao {
    
    public static Connection AbrirConexao() {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/locadora";
            con = DriverManager.getConnection(url, "root", "");    
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Erro de conexão com o banco",
                   "video Locadora", JOptionPane.ERROR_MESSAGE);
           e.getMessage();
                     }
                     return con;   
    }
    
    public static void FechatConexão (Connection con){
        
        try {
         con.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
