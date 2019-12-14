package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Classificacao;

public class classificacaoDAO extends ExecuteSQL {
    
    public classificacaoDAO(Connection con) {
        super(con);
    }
    
    public String Inserir_Classificacao(Classificacao a) throws SQLException{
       String sql = "insert into classificacao values(?,?,?)";
       try{
           PreparedStatement ps = getCon().prepareStatement(sql);
           
           ps.setInt(1, a.getCodigo());
           ps.setString(2, a.getNome());
           ps.setDouble(3, a.getPreco());
          
           
           
           if (ps.executeUpdate() > 0){
               return "inserido com sucesso";
           } else {
               return "Erro ao inserir";
           }
       } catch (SQLException e){
           return e.getMessage();
       }
   } 
 public List<Classificacao> ListarClassificacao(){ 
     String sql = "select idcliente,nome, from classificacao";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
           
                while(rs.next()){
                    Classificacao a = new Classificacao();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setPreco(rs.getInt(3));
      
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
 
  public List<Classificacao> Pesquisar_Cod_Classificacao(int cod){
      String sql
              = "select idclassificao,Codigo,preco"
              +" from classificacao where idclassificacao = '"+cod+"'";
        return null;
  }
  
  public boolean Testar_Classificacao(int cod){
      boolean Resultado = false;
      try{
      
      String sql = "select * from classificacao where idclassificacao ="+cod+"";
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
  
  public List<Classificacao> CapturarClassificacao(int cod){
      String sql = "select * from classificacao where idclassificacao ="+ cod +"";
      List<Classificacao> lista = new ArrayList();
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          if(rs != null){
              while(rs.next()){
                  Classificacao a = new Classificacao();
                  a.setCodigo(rs.getInt(1));
                  a.setNome(rs.getString(2));
                  a.setPreco(rs.getInt(3));
       
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
  public String Alterar_Classificacao(Classificacao a){
      String sql = "update classificacao set idclassificacao = ? ,set nome = ? , set preco = ? "
                    +", where idclassificacao = ? ";
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ps.setString(1, a.getNome());
          ps.setInt(2, a.getCodigo());
          ps.setDouble(3, a.getPreco());

 
          if (ps.executeUpdate() > 0){
              return "Atualizado com sucesso.";
          }else{
              return "Erro ao atualizar";
          }
      }catch (SQLException e){
          return e.getMessage();
      }
  }
  

  public List<Classificacao> ListarComboClassificacao(){
      
      
      String sql = "select classificacao from classificacao order by nome";
      List<Classificacao> lista = new ArrayList<>();
      try{
          PreparedStatement ps =  getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
          if(rs != null){
              while (rs.next()){
                  
                  Classificacao a = new Classificacao();
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
  
  
  public List<Classificacao> ConsultaCodigoCliente(String nome){
      
      String sql = "select idclassificacao from classificacao where nome = '"+nome+"'";
      List<Classificacao> lista = new ArrayList<>();
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
          if(rs != null){
              while(rs.next()){
              
                  Classificacao a = new Classificacao();
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
  
  public String Excluir_Classificacao(Classificacao a){
      String sql = "delete from classificacao where idclassificacao = ?";
      
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
