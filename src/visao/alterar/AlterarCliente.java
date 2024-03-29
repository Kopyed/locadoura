package visao.alterar;

import principal.Menu;
import DAO.clienteDAO;
import DAO.conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;

/**
 * @author paulo
 */

public class AlterarCliente extends javax.swing.JFrame {
   
    public AlterarCliente() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblcadastro = new javax.swing.JLabel();
        lblcadastro4 = new javax.swing.JLabel();
        jTF_cod = new javax.swing.JTextField();
        btOK = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblcadastro5 = new javax.swing.JLabel();
        jTF_Codigo = new javax.swing.JTextField();
        lblcadastro6 = new javax.swing.JLabel();
        jTF_Nome = new javax.swing.JTextField();
        lblcadastro7 = new javax.swing.JLabel();
        lblcadastro8 = new javax.swing.JLabel();
        jTF_RG = new javax.swing.JFormattedTextField();
        jTF_CPF = new javax.swing.JFormattedTextField();
        lblcadastro9 = new javax.swing.JLabel();
        jTF_Telefone = new javax.swing.JFormattedTextField();
        lblcadastro10 = new javax.swing.JLabel();
        jTF_Nascimento = new javax.swing.JFormattedTextField();
        lblcadastro11 = new javax.swing.JLabel();
        jTF_Rua = new javax.swing.JTextField();
        lblcadastro12 = new javax.swing.JLabel();
        jTF_Numero = new javax.swing.JTextField();
        lblcadastro13 = new javax.swing.JLabel();
        jTF_Bairro = new javax.swing.JTextField();
        lblcadastro14 = new javax.swing.JLabel();
        jTF_CEP = new javax.swing.JTextField();
        lblcadastro15 = new javax.swing.JLabel();
        jTF_Email = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblcadastro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblcadastro.setText("Alterar Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblcadastro)
                .addGap(203, 203, 203))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblcadastro)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblcadastro4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro4.setText("Digite o Código:");

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
        lblcadastro5.setText("Nº do cliente:");

        lblcadastro6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro6.setText("RG:");

        lblcadastro7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro7.setText("Nome:");

        lblcadastro8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro8.setText("CPF:");

        lblcadastro9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro9.setText("Telefone:");

        lblcadastro10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro10.setText("Data de Nascimento:");

        jTF_Nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_NascimentoActionPerformed(evt);
            }
        });

        lblcadastro11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro11.setText("Rua:");

        lblcadastro12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro12.setText("Nº");

        lblcadastro13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro13.setText("Bairro:");

        lblcadastro14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro14.setText("CEP:");

        lblcadastro15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblcadastro15.setText("Email:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblcadastro15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTF_Email))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblcadastro13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblcadastro14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lblcadastro5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblcadastro7)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(lblcadastro6)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jTF_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblcadastro8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTF_CPF))
                                        .addComponent(jTF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblcadastro11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTF_Rua))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblcadastro9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblcadastro10)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTF_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lblcadastro12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTF_Numero)))))))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcadastro5)
                    .addComponent(jTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcadastro7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcadastro6)
                            .addComponent(lblcadastro8)
                            .addComponent(jTF_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcadastro9)
                    .addComponent(jTF_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcadastro10)
                    .addComponent(jTF_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcadastro11)
                    .addComponent(jTF_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcadastro12)
                    .addComponent(jTF_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcadastro13)
                    .addComponent(jTF_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcadastro14)
                    .addComponent(jTF_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcadastro15)
                    .addComponent(jTF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblcadastro4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTF_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton2)
                        .addGap(65, 65, 65)
                        .addComponent(btAlterar)
                        .addGap(65, 65, 65)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcadastro4)
                    .addComponent(btOK))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btAlterar)
                    .addComponent(jButton4))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void InserirDados(int cod){
        
        Connection con = conexao.AbrirConexao();
        clienteDAO sql = new clienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        lista = sql.CapturarCliente(cod);
        
        for (Cliente a : lista){
        
                jTF_Codigo.setText("" + a.getCodigo());
                jTF_Nome.setText(a.getNome());
                jTF_CEP.setText(a.getCEP());
                jTF_Numero.setText("" + a.getNumero());
                jTF_Bairro.setText(a.getBairro());
                jTF_Email.setText(a.getEmail());
                jTF_Telefone.setText(a.getTelefone());
                jTF_Rua.setText(a.getRua());
                jTF_Nascimento.setText(a.getNascimento());
                jTF_RG.setText(a.getRG());
                jTF_CPF.setText(a.getCPF());
                
        }
        conexao.FecharConexao(con);
    }
    
    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed

        String codigo = jTF_cod.getText();
        Connection con = conexao.AbrirConexao();
        clienteDAO sql = new clienteDAO(con);
        int cod = Integer.parseInt(codigo);
        if(sql.Testar_Cliente(cod) == false){
            JOptionPane.showMessageDialog(null,"Código não encontrado no banco",
                    "Video locadora", JOptionPane.ERROR_MESSAGE);
            conexao.FecharConexao(con);
        }
        if (codigo.equals("")){
            JOptionPane.showMessageDialog(null,"Digite um codigo para atualizar",
                    "video locadora", JOptionPane.WARNING_MESSAGE);
        }
        jTF_Codigo.setText("");
        jTF_Nome.setText("");
        jTF_CEP.setText("");
        jTF_Numero.setText("");
        jTF_Bairro.setText("");
        jTF_Email.setText("");
        jTF_Telefone.setText("");
        jTF_Rua.setText("");
        jTF_Nascimento.setText("");
        jTF_RG.setText("");
        jTF_CPF.setText("");
        
        InserirDados(cod);
        jTF_cod.setText("");
    }//GEN-LAST:event_btOKActionPerformed

    private void jTF_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_codActionPerformed
    }//GEN-LAST:event_jTF_codActionPerformed

    private void jTF_NascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_NascimentoActionPerformed
    }//GEN-LAST:event_jTF_NascimentoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        String codigo = jTF_Codigo.getText();
        String nome = jTF_Nome.getText();
        String nascimento = jTF_Nascimento.getText();
        String cep = jTF_CEP.getText();
        String rua = jTF_Rua.getText();
        String numero = jTF_Numero.getText();
        String bairro = jTF_Bairro.getText();
        String email = jTF_Email.getText();
        String fone = jTF_Telefone.getText();
        String cpf = jTF_CPF.getText();
        String rg = jTF_RG.getText();
        
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null,"nenhum campo pode estar vazio"
            ,"Video Locadora",JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = conexao.AbrirConexao();
            clienteDAO sql = new clienteDAO(con);
            int num =  Integer.parseInt(numero);
            int cod =  Integer.parseInt(codigo);
            Cliente a = new Cliente();
            
            a.setCodigo(cod);
            a.setNome(nome);
            a.setNascimento(nascimento);
            a.setRG(rg);
            a.setCPF(cpf);
            a.setNumero(num);
            a.setBairro(bairro);
            a.setCEP(cep);
            a.setRua(rua);
            a.setEmail(email);
            a.setTelefone(fone);
            
            sql.Alterar_Cliente(a);
            conexao.FecharConexao(con);
            
            jTF_Codigo.setText("");            
            jTF_Nome.setText("");
            jTF_CEP.setText("");
            jTF_Numero.setText("");
            jTF_Bairro.setText("");
            jTF_Email.setText("");
            jTF_Telefone.setText("");
            jTF_Rua.setText("");
            jTF_Nascimento.setText("");
            jTF_RG.setText("");
            jTF_CPF.setText("");
            JOptionPane.showMessageDialog(null,"Atualizado com Sucesso",
                     "Video Locadora", JOptionPane.INFORMATION_MESSAGE);
            new Menu().setVisible(true);
            dispose();
        }
        
        
    }//GEN-LAST:event_btAlterarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            jTF_cod.setText("");            
            jTF_Codigo.setText("");            
            jTF_Nome.setText("");
            jTF_CEP.setText("");
            jTF_Numero.setText("");
            jTF_Bairro.setText("");
            jTF_Email.setText("");
            jTF_Telefone.setText("");
            jTF_Rua.setText("");
            jTF_Nascimento.setText("");
            jTF_RG.setText("");
            jTF_CPF.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btOK;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTF_Bairro;
    private javax.swing.JTextField jTF_CEP;
    private javax.swing.JFormattedTextField jTF_CPF;
    private javax.swing.JTextField jTF_Codigo;
    private javax.swing.JTextField jTF_Email;
    private javax.swing.JFormattedTextField jTF_Nascimento;
    private javax.swing.JTextField jTF_Nome;
    private javax.swing.JTextField jTF_Numero;
    private javax.swing.JFormattedTextField jTF_RG;
    private javax.swing.JTextField jTF_Rua;
    private javax.swing.JFormattedTextField jTF_Telefone;
    private javax.swing.JTextField jTF_cod;
    private javax.swing.JLabel lblcadastro;
    private javax.swing.JLabel lblcadastro10;
    private javax.swing.JLabel lblcadastro11;
    private javax.swing.JLabel lblcadastro12;
    private javax.swing.JLabel lblcadastro13;
    private javax.swing.JLabel lblcadastro14;
    private javax.swing.JLabel lblcadastro15;
    private javax.swing.JLabel lblcadastro4;
    private javax.swing.JLabel lblcadastro5;
    private javax.swing.JLabel lblcadastro6;
    private javax.swing.JLabel lblcadastro7;
    private javax.swing.JLabel lblcadastro8;
    private javax.swing.JLabel lblcadastro9;
    // End of variables declaration//GEN-END:variables
}
