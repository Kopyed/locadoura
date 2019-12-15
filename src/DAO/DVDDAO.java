package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.DVD;
import modelo.Filme;

public class DVDDAO extends ExecuteSQL {

    public DVDDAO(Connection con) {
        super(con);
    }
      
     public String Inserir_DVD(DVD a) {
    String sql = "insert into dvd values(0,?,?,?,?)";
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        
        ps.setInt(1, a.getCod_filme());
        ps.setDouble(2, a.getPreco());
        ps.setString(3, a.getData_compra());
        ps.setString(4, a.getSituacao());
        
        if (ps.executeUpdate() > 0) {
            return "Inserido com Sucesso.";
        }
        else{
            return "Erro ao Inserir";
        }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
     public boolean Testar_DVD(int cod){
      boolean teste = false;
      try{
      
      String sql = "select iddvd from dvd where iddvd ="+cod+"";
      PreparedStatement ps = getCon().prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      
      if(rs != null){
          while(rs.next()){
              teste = true;
          }
          
      }
      
      }catch(SQLException ex){
          
      }
      
        return teste;
      
  }
 
  public boolean Testar_Situacao(int cod){
      boolean teste = false;
      try{
      
      String sql = "select iddvd from dvd where iddvd ="+cod+""+
              "and situacao = 'disponivel' ";
      PreparedStatement ps = getCon().prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      
      if(rs != null){
          while(rs.next()){
              teste = true;
          }
          
      }
      
      }catch(SQLException ex){
          
      }
      
        return teste;      
  }     
     
    
    
 public List<DVD> ListarDVD(){ 
     String sql = "select iddvd,idfilme,preco_compra,data_compra,situacao from dvd";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
           
                while(rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setSituacao(rs.getString(3));
                    a.setPreco(rs.getDouble(4));
                    a.setData_compra(rs.getString(5));
                    
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
 
  public List<DVD> Pesquisar_Cod_DVD(int cod){
      String sql
              = "select iddvd, idfilme , preco_compra , data_compra, "
              +" from dvd where iddvd = '"+cod+"'";
        return null;
  }
  
  
        public List<DVD> Pesquisar_Cod_Filme(int cod) {
        String sql = "select iddvd, idfilme, preco_compra, data_compra, situacao from dvd where idfilme like '%" + cod + "%'";
           List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null) {
                while (rs.next()){
                    DVD a= new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setPreco(rs.getInt(3));
                    a.setData_compra(rs.getString(4));                   
                    a.setSituacao(rs.getString(5));
                    lista.add(a);
                  }
                return lista;
            }else{
                return null;
                
            }
        } catch (SQLException e) {
            return null;
        }
   
}
  
  public List<DVD> CapturarDVD(int cod){
      String sql = "select * from dvd where iddvd ="+ cod +"";
      List<DVD> lista = new ArrayList();
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          if(rs != null){
              while(rs.next()){
                  DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setSituacao(rs.getString(3));
                    a.setPreco(rs.getDouble(4));
                    a.setData_compra(rs.getString(5));
                    
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
  public String Alterar_DVD(DVD a){
      String sql = "update dvd set iddvd = 0 ,idfilme = ? ,preco_compra = ? "
                    + ",data_compra = ? ,situacao = ? where iddvd = ?";
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1,a.getCodigo());
            ps.setInt(2,a.getCod_filme());
            ps.setString(3,a.getSituacao());
            ps.setDouble(4,a.getPreco());
            ps.setString(5,a.getData_compra());
            
                    
 
          if (ps.executeUpdate() > 0){
              return "Atualizado com sucesso.";
          }else{
              return "Erro ao atualizar";
          }
      }catch (SQLException e){
          return e.getMessage();
      }
  }
  

  public List<DVD> ListarComboDVD(){
      
      
      String sql = "select nome from dvd order by situacao";
      List<DVD> lista = new ArrayList<>();
      try{
          PreparedStatement ps =  getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
          if(rs != null){
              while (rs.next()){
                  
                  DVD a = new DVD();
                  a.setCodigo(rs.getInt(1));
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
  
  
  public List<DVD> ConsultaCodigoDVD(String Situacao){
      
      String sql = "select idcliente from cliente where nome = '"+Situacao+"'";
      List<DVD> lista = new ArrayList<>();
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
          if(rs != null){
              while(rs.next()){
              
                  DVD a = new DVD();
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
  
  public String Excluir_DVD(DVD a){
      String sql = "delete from dvd where iddvd = ? " ;
      
    try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ps.setInt(1, a.getCodigo());
          ps.setInt(2,a.getCod_filme());
          ps.setString(3,a.getSituacao());
          ps.setDouble(4,a.getPreco());
          ps.setString(5,a.getData_compra());;
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
