
package visao.alterar;

import DAO.FilmeDAO;
import DAO.categoriaDAO;
import DAO.classificacaoDAO;
import DAO.conexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Classificacao;
import modelo.Filme;
import principal.Menu;
import DAO.*;
import Modelo.*;
import java.io.File;
import java.sql.*;
import java.util.*;
import javax.swing.*;



public class AlterarFilme extends javax.swing.JFrame {

     private void AtualizaComboClassificacao(){
        Connection con = conexao.AbrirConexao();
        classificacaoDAO sql = new classificacaoDAO(con);
        List<Classificacao> lista = new ArrayList<>();
        lista = sql.ListarClassificacao();
     
        jCB_Classificacao.addItem("");
        jTF_Classificacao.setText("");
         
        for (Classificacao b: lista){
            jCB_Classificacao.addItem(b.getNome());
            
       }
        conexao.FecharConexao(con);
    }
    private void AtualizaComboCategoria(){
        Connection con = conexao.AbrirConexao();
        categoriaDAO sql = new categoriaDAO(con);
        List<Categoria> lista = new ArrayList<>();
        lista = sql.ListarComboCategoria();
        
        jCB_Categoria.addItem("");
        jTF_Classificacao.setText("");
        
        for (Categoria b: lista){
            jCB_Categoria.addItem(b.getNome());
        }
        conexao.FecharConexao(con);
    }
    
    public AlterarFilme() {
        initComponents();
        AtualizaComboClassificacao();
        AtualizaComboCategoria();
        setLocationRelativeTo(this);
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblcadastro = new javax.swing.JLabel();
        jTF_cod = new javax.swing.JTextField();
        btOK = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblcadastro5 = new javax.swing.JLabel();
        jTF_Codigo = new javax.swing.JTextField();
        jTF_Titulo = new javax.swing.JTextField();
        lblcadastro7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTF_Categoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_Ano = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTF_Duracao = new javax.swing.JTextField();
        jCB_Categoria = new javax.swing.JComboBox<>();
        jTF_Classificacao = new javax.swing.JTextField();
        jCB_Classificacao = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTF_Capa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lB_Foto = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblcadastro4 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblcadastro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblcadastro.setText("Alterar Filme");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcadastro)
                .addGap(359, 359, 359))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblcadastro)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTF_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_codActionPerformed(evt);
            }
        });

        btOK.setText("ok");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblcadastro5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro5.setText("Nº do Filme:");

        jTF_Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_TituloActionPerformed(evt);
            }
        });

        lblcadastro7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro7.setText("Titulo:");

        jLabel1.setText("Categoria:");

        jLabel3.setText("Ano:");

        jTF_Ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_AnoActionPerformed(evt);
            }
        });

        jLabel4.setText("Classificação:");

        jLabel2.setText("Duração:");

        jLabel5.setText("Capa:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lB_Foto.setText("DVD Video");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblcadastro5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcadastro7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF_Titulo)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTF_Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCB_Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTF_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCB_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTF_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTF_Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTF_Capa, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                        .addComponent(lB_Foto)
                        .addGap(157, 157, 157))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcadastro5)
                    .addComponent(jTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcadastro7)
                    .addComponent(jTF_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTF_Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTF_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lB_Foto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTF_Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB_Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTF_Capa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(16, 16, 16))
        );

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpar");

        lblcadastro4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro4.setText("Digite o Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton2)
                        .addGap(130, 130, 130)
                        .addComponent(btAlterar)
                        .addGap(134, 134, 134)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblcadastro4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcadastro4)
                    .addComponent(btOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void InserirDados(int cod){
        
        Connection con = conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        lista = sql.CapturarFilme(cod);
        
        for (Filme a : lista){
        
                jTF_Codigo.setText("" + a.getCodigo());
                jTF_Titulo.setText(""+a.getTitulo());
                jTF_Ano.setText(""+a.getAno());
                jTF_Duracao.setText(""+a.getDuracao());
                jTF_Categoria.setText(""+a.getCod_categoria());
                jTF_Classificacao.setText(""+a.getCod_classificao());
                jTF_Capa.setText(""+a.getCapa());
        }
        conexao.FecharConexao(con);
    }
    
    private void jTF_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_codActionPerformed

    }//GEN-LAST:event_jTF_codActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed

      String codigo = jTF_cod.getText();
        Connection con = conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        int cod = Integer.parseInt(codigo);
        
        if (sql .Testar_Filme(cod) == false) {
            JOptionPane.showMessageDialog(null, "Codigo não Encontrado no Banco",
                    "Video Locadora", JOptionPane.WARNING_MESSAGE);
            conexao.FecharConexao(con);
        }
        if (codigo.equals("")) {
        
        JOptionPane.showMessageDialog(null, "Digite um codigo para Atualizar",
                "Video Locadora", JOptionPane.WARNING_MESSAGE);
        }
        
        jTF_Codigo.setText("");
        jTF_Titulo.setText("");
        jTF_Ano.setText("");
        jTF_Duracao.setText("");
        jTF_Categoria.setText("");
        jTF_Classificacao.setText("");
        jTF_Capa.setText("");
        
        InserirDados(cod);
        jTF_cod.setText("");

    }//GEN-LAST:event_btOKActionPerformed

    private void jTF_AnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_AnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_AnoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        String codigo = jTF_Codigo.getText();
        String titulo = jTF_Titulo.getText();

        if(titulo.equals("")){
            JOptionPane.showMessageDialog(null,"nenhum campo pode estar vazio"
                ,"Video Locadora",JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = conexao.AbrirConexao();
            FilmeDAO sql = new FilmeDAO(con);
            int cod =  Integer.parseInt(codigo);
            Filme a = new Filme();

            a.setCodigo(cod);
            a.setTitulo(titulo);

            sql.Alterar_Filme(a);
            conexao.FecharConexao(con);

            jTF_Codigo.setText("");
            jTF_Titulo.setText("");

            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso",
                "Video Locadora", JOptionPane.INFORMATION_MESSAGE);
            new Menu().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Menu().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTF_TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_TituloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{         
        JFileChooser foto = new JFileChooser();
        foto.setCurrentDirectory(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Projeto_Locadora\\src\\Imagens"));
        foto.setDialogTitle("Carregr Capa");
        foto.showOpenDialog(this);
        String a = "" + foto.getSelectedFile().getName();
        jTF_Capa.setText (a);
        lB_Foto.setIcon(new ImageIcon
        (""+ jTF_Capa.getText () + "/"));
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, "Não foi possivel carregar capa");
    }//GEN-LAST:event_jButton1ActionPerformed
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btOK;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jCB_Categoria;
    private javax.swing.JComboBox<String> jCB_Classificacao;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTF_Ano;
    private javax.swing.JTextField jTF_Capa;
    private javax.swing.JTextField jTF_Categoria;
    private javax.swing.JTextField jTF_Classificacao;
    private javax.swing.JTextField jTF_Codigo;
    private javax.swing.JTextField jTF_Duracao;
    private javax.swing.JTextField jTF_Titulo;
    private javax.swing.JTextField jTF_cod;
    private javax.swing.JLabel lB_Foto;
    private javax.swing.JLabel lblcadastro;
    private javax.swing.JLabel lblcadastro4;
    private javax.swing.JLabel lblcadastro5;
    private javax.swing.JLabel lblcadastro7;
    // End of variables declaration//GEN-END:variables
}
