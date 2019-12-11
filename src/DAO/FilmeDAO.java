/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Filme;
import java.sql.*;

/**
 *
 * @author paulo
 */
public class FilmeDAO extends ExecuteSQL{

    public FilmeDAO(Connection con) {
        super(con);
    }
    
     public List<Filme> Pesquisar_Cod_Filme(int cod){
    String sql = "select idfilme,titulo,ano,duracao,idcategoria,idclassificacao,"
            +"capa from filme whhere idfilme = '" + cod + "'";
        List<Filme> lista = new ArrayList<>();
        try{
           PreparedStatement ps = getCon().prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           if(rs != null){
            while (rs.next()){
                Filme a = new Filme();
                a.setCodigo(rs.getInt(1));
                a.setTitulo(rs.getString(2));
                a.setAno(rs.getInt(3));
                a.setDuracao(rs.getString(4));
                a.setCod_categoria(rs.getInt(5));
                a.setCod_classificao(rs.getInt(6));
                a.setCapa(rs.getString(7));
                lista.add(a);
                }
            return lista;
            }else{
               return null;
                  }
        } catch (SQLException e){
            return null;
        }
        }
}
