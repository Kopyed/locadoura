/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Cliente;


public class categoriaDAO extends ExecuteSQL {
    public categoriaDAO(Connection con) {
        super(con);
    }
   public String Inserir_Categoria(Cliente a) throws SQLException{
       String sql = "insert into categoria values(0,?)";
       try{
           PreparedStatement ps = getCon().prepareStatement(sql);
           
           ps.setString(1, a.getNome());
           
           
           if (ps.executeUpdate() > 0){
               return "inserido com sucesso";
           } else {
               return "Erro ao inserir";
           }
       } catch (SQLException e){
           return e.getMessage();
       }
   } 
 public List<Cliente> ListarCategoria(){ 
     String sql = "select idcategoria, nome from categoria";
        List<Cliente> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
           
                while(rs.next()){
                    Cliente a = new Cliente();
                    
                    a.setNome(rs.getString(1));
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
 
  public List<Cliente> Pesquisar_Cod_Categoria(int cod){
      String sql
              = "select idcategoria, Nome  from categoria where idcategoria = '"+cod+"'";
        return null;
  }
  
  public boolean Testar_Categoria(int cod){
      boolean Resultado = false;
      try{
      
      String sql = "select * from categoria where idcliente ="+cod+"";
      PreparedStatement ps = getCon().prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      
      if(rs != null){
          while(rs.next()){
              Resultado = true;
          }
          
      }
      
      }catch(SQLException ex){
          ex.getMessage();
      }
      
        return Resultado;
      
  }
  
  public List<Categoria> CapturarCategoria(int cod){
      String sql = "select * from categoria where idcategoria ="+ cod +"";
      List<Categoria> lista = new ArrayList();
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          if(rs != null){
              while(rs.next()){
                  Categoria a = new Categoria();
                  a.setCodigo(rs.getInt(1));
                  a.setNome(rs.getString(2));
                  lista.add(a);
              }
              return lista;
          }else{
              return null;
          }
      }catch(SQLException e){
          return null;
          
      }
  }
  public String Alterar_Categoria(Cliente a){
      String sql = "update categoria set nome = ? "
                    +" where idcategoria = ?";
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ps.setString(1, a.getNome());
          ps.setInt(11, a.getCodigo());
 
          if (ps.executeUpdate() > 0){
              return "Atualizado com sucesso.";
          }else{
              return "Erro ao atualizar";
          }
      }catch (SQLException e){
          return e.getMessage();
      }
  }
  

  public List<Categoria> ListarComboCategoria(){
      
      
      String sql = "select nome from categoria order by nome";
      List<Categoria> lista = new ArrayList<>();
      try{
          PreparedStatement ps =  getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
          if(rs != null){
              while (rs.next()){
                  
                  Categoria a = new Categoria();
                  a.setNome(rs.getString(1));
                  lista.add(a);
              }
              return lista;
          }else{
              return null;
          }
      }catch(Exception e){
          return null;
      }
  }
  
  
  public List<Categoria> ConsultaCodigoCategoria(String nome){
      
      String sql = "select idcategoria from categoria where nome = '"+nome+"'";
      List<Categoria> lista = new ArrayList<>();
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
          if(rs != null){
              while(rs.next()){
              
                  Categoria a = new Categoria();
                  a.setCodigo(rs.getInt(1));
                  lista.add(a);
              }
              return lista;
          }else{
              return null;
          }
      } catch(Exception e){
          return null;
  
      }
  }
  
  public String Excluir_Categoria(Cliente a){
      String sql = "delete from categoria where idcategoria = ? and nome = ?";
      
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ps.setInt(1, a.getCodigo());
          ps.setString(2, a.getNome());
          if (ps.executeUpdate() > 0){
              return "Excluido com Sucesso.";
          }else{
              return "Erro ao excluir.";
          }
      }catch (SQLException e){
          return e.getMessage();
      }
  }
}
