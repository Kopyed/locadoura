package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Funcionario;

public class FuncionarioDAO extends ExecuteSQL {

    public FuncionarioDAO(Connection con){
    super(con);
    }
    public boolean Logar (String login, String senha){
        boolean finalResult = false;
    try{
        String consulta = "select login, senha from funcionario "
        +"where login = '"+login+"' and senha = '"+senha+"'";
        PreparedStatement ps = getCon().prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();
        
         if(rs != null){
             while (rs.next()){
                  Funcionario a = new Funcionario();
                  a.setLogin(rs.getString(1));
                  a.setSenha(rs.getString(2));
                  finalResult = true;
             }
             
         } 
        
    }catch(SQLException ex){
    
        ex.getMessage();
        
    }return finalResult;
    
    }
    
    public String Inserir_Funcionario(Funcionario a) throws SQLException{
       String sql = "insert into funcionario values(0,?,?,?)";
       try{
           PreparedStatement ps = getCon().prepareStatement(sql);
           
           ps.setString(1, a.getNome());
           ps.setString(2, a.getLogin());
           ps.setString(3, a.getSenha());
           if (ps.executeUpdate() > 0){
               return "inserido com sucesso";
           } else {
               return "Erro ao inserir";
           }
       } catch (SQLException e){
           return e.getMessage();
       }
   } 
 public List<Funcionario> ListarFuncionario(){ 
     String sql = "select idfuncionario,nome,login,senha from funcionario";
        List<Funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
           
                while(rs.next()){
                    Funcionario a = new Funcionario();
                    a.setCod(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setLogin(rs.getString(3));
                    a.setSenha(rs.getString(4));
                   
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
 
  public List<Funcionario> Pesquisar_Cod_Cliente(int cod){
      String sql
              = "select idcliente, Nome , RG, CPF, Telefone, Email"
              +" from cliente where idcliente = '"+cod+"'";
        return null;
  }
  
  public boolean Testar_Cliente(int cod){
      boolean Resultado = false;
      try{
      
      String sql = "select * from cliente where idcliente ="+cod+"";
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
  
  public List<Funcionario> CapturarFuncionario(int cod){
      String sql = "select * from Funcionario where idfuncionario ="+ cod +"";
      List<Funcionario> lista = new ArrayList();
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          if(rs != null){
              while(rs.next()){
                  Funcionario a = new Funcionario();
                  a.setCod(rs.getInt(1));
                  a.setNome(rs.getString(2));
                  a.setLogin(rs.getString(3));
                  a.setSenha(rs.getString(4));
               
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
  public String Alterar_Funcionario(Funcionario a){
      String sql = "update cliente set nome = ? ,data_nasc = ? ,rg = ? "
                    + ",cpf = ? ,email = ? ,telefone = ? ,bairro = ?,rua = ?"
                    +",numero = ?,cep = ? where idcliente = ?";
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ps.setInt(1, a.getCod());
          ps.setString(2, a.getNome());
          ps.setString(3, a.getLogin());
          ps.setString(4, a.getSenha());
         
 
          if (ps.executeUpdate() > 0){
              return "Atualizado com sucesso.";
          }else{
              return "Erro ao atualizar";
          }
      }catch (SQLException e){
          return e.getMessage();
      }
  }
  

  public List<Funcionario> ListarComboFuncionario(){
      
      
      String sql = "select nome from funcionario order by nome";
      List<Funcionario> lista = new ArrayList<>();
      try{
          PreparedStatement ps =  getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
          if(rs != null){
              while (rs.next()){
                  
                  Funcionario a = new Funcionario();
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
  
  
  public List<Funcionario> ConsultaCodigoCliente(String nome){
      
      String sql = "select idcliente from cliente where nome = '"+nome+"'";
      List<Funcionario> lista = new ArrayList<>();
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ResultSet rs = ps.executeQuery();
          
          if(rs != null){
              while(rs.next()){
              
                  Funcionario a = new Funcionario();
                  a.setCod(rs.getInt(1));
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
  
  public String Excluir_Funcionario(Funcionario a){
      String sql = "delete from cliente where idcliente = ? and nome = ?";
      
      try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          ps.setInt(1, a.getCod());
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