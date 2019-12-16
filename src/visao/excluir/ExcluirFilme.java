/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao.excluir;

import DAO.FilmeDAO;
import DAO.conexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Filme;

/**
 *
 * @author paulo
 */
public class ExcluirFilme extends javax.swing.JFrame {

   private void AtualizaCombo(){
        Connection con = conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        lista = sql.ListarComboFilme();
        jCB_Nome.addItem("");
        
        for (Filme b: lista){
            jCB_Nome.addItem(b.getTitulo());
        }
        conexao.FecharConexao(con);
    }
    
    public ExcluirFilme() {
        initComponents();
        setTitle("Video Locadora");
        AtualizaCombo();
        setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btExcluir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblcadastro = new javax.swing.JLabel();
        jTF_codigo = new javax.swing.JTextField();
        jCB_Nome = new javax.swing.JComboBox<>();
        btExcluir1 = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblcadastro1 = new javax.swing.JLabel();
        jTF_codigo1 = new javax.swing.JTextField();
        jCB_Nome1 = new javax.swing.JComboBox<>();

        btExcluir.setText("ok");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblcadastro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblcadastro.setText("Excluir Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcadastro)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblcadastro)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jCB_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_NomeActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btExcluir1.setText("ok");
        btExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluir1ActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblcadastro1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblcadastro1.setText("Excluir Filme");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(lblcadastro1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblcadastro1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jCB_Nome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_Nome1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTF_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCB_Nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_codigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB_Nome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir1)
                    .addComponent(btCancelar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String codigo = jTF_codigo1.getText();
        String nome = jCB_Nome1.getSelectedItem().toString();

        Connection con = conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        Filme a = new Filme();
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"Nenhum nome selecionado",
                "Video Locadora",JOptionPane.WARNING_MESSAGE);
        }else{

            int b = JOptionPane.showConfirmDialog(null,"Deseja realmente Excluir"
                +"\n ("+ codigo +") ("+ nome +")", "Video Locadora",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

            if(b == 0){
                int cod = Integer.parseInt(codigo);
                a.setTitulo(nome);
                a.setCodigo(cod);
                sql.Excluir_Filme(a);
                conexao.FecharConexao(con);

            }

        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jCB_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_NomeActionPerformed
        Connection con = conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        String nome = jCB_Nome.getSelectedItem().toString();

        lista = sql.ConsultaCodigoFilme(nome);

        for(Filme b : lista){
            int a = b.getCodigo();
            jTF_codigo.setText(""+a);
        }
        conexao.FecharConexao(con);
    }//GEN-LAST:event_jCB_NomeActionPerformed

    private void btExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluir1ActionPerformed
        String codigo = jTF_codigo.getText();
        String nome = jCB_Nome.getSelectedItem().toString();

        Connection con = conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        Filme a = new Filme();
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"Nenhum nome selecionado",
                "Video Locadora",JOptionPane.WARNING_MESSAGE);
        }else{

            int b = JOptionPane.showConfirmDialog(null,"Deseja realmente Excluir"
                +"\n ("+ codigo +") ("+ nome +")", "Video Locadora",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

            if(b == 0){
                int cod = Integer.parseInt(codigo);
                a.setTitulo(nome);
                a.setCodigo(cod);
                sql.Excluir_Filme(a);
                conexao.FecharConexao(con);

            }

        }
    }//GEN-LAST:event_btExcluir1ActionPerformed

    private void jCB_Nome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_Nome1ActionPerformed
        AtualizaCombo();
        Connection con = conexao.AbrirConexao();
        FilmeDAO sql = new FilmeDAO(con);
        List<Filme> lista = new ArrayList<>();
        String nome = jCB_Nome.getSelectedItem().toString();

        lista = sql.ConsultaCodigoFilme(nome);

        for(Filme b : lista){
            int a = b.getCodigo();
            jTF_codigo.setText(""+a);
        }
        conexao.FecharConexao(con);
    }//GEN-LAST:event_jCB_Nome1ActionPerformed

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
            java.util.logging.Logger.getLogger(ExcluirFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btExcluir1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCB_Nome;
    private javax.swing.JComboBox<String> jCB_Nome1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTF_codigo;
    private javax.swing.JTextField jTF_codigo1;
    private javax.swing.JLabel lblcadastro;
    private javax.swing.JLabel lblcadastro1;
    // End of variables declaration//GEN-END:variables
}
