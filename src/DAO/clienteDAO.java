
package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

public class clienteDAO extends ExecuteSQL{

    public clienteDAO(Connection con) {
        super(con);
    }
   public String Inserir_Cliente(Cliente a) throws SQLException{
       String sql = "insert into cliente values(0,?,?,?,?,?,?,?,?,?,?)";
       try{
           PreparedStatement ps = getCon().prepareStatement(sql);
           
           ps.setString(1, a.getNome());
           ps.setString(2, a.getNascimento());
           ps.setString(3, a.getRG());
           ps.setString(4, a.getCPF());
           ps.setString(5, a.getEmail());
           ps.setString(6, a.getTelefone());
           ps.setString(7, a.getBairro());
           ps.setString(8, a.getRua());
           ps.setInt(9, a.getNumero());
           ps.setString(10, a.getCEP());
           
           
           if (ps.executeUpdate() > 0){
               return "inserido com sucesso";
           } else {
               return "Erro ao inserir";
           }
       } catch (SQLException e){
           return e.getMessage();
       }
   } 
 public List<Cliente> ListarCliente(){ 
     String sql = "select idcliente,nome,rg,cpf,telefone,email from cliente";
        List<Cliente> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Cliente a = new Cliente();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setRG(rs.getString(3));
                    a.setCPF(rs.getString(4));
                    a.setTelefone(rs.getString(5));
                    a.setEmail(rs.getString(6));
                    
                    lista.add(a);
                }
                return lista;
            }else{
            return null;
            }
            
        }catch(SQLException e) {
            return null;
        }    
 }
 
}

