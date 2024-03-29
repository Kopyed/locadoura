package locacao;

import DAO.*;
import java.sql.*;
import DAO.conexao;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;
import modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class Cadastrodelocacao extends javax.swing.JFrame {


    
    public Cadastrodelocacao() {
        initComponents();
        AtualizaDate();
        AtualizaCombo();
        AtualizaTable();
    }
private void InserirDados(int cod) {
        
        Connection con = conexao.AbrirConexao();
        DVDDAO dvd = new DVDDAO(con);
        FilmeDAO filme = new FilmeDAO(con);
        List<DVD> listaDVD = new ArrayList<>();
        List<Filme> listaFIL = new ArrayList<>();
        listaDVD = dvd.Listar_Cod_Filme(cod);
        
        for (DVD a : listaDVD) {
            int codigo = a.getCod_filme();
            listaFIL = filme.Pesquisar_Cod_Filme(codigo);
        }
        
        for (Filme a : listaFIL) {
            jTF_Titulo.setText(a.getTitulo());
            jTF_Categoria.setText("" + a.getCod_categoria());
            jTF_Classificacao.setText("" + a.getCod_classificao());
            jLbFoto.setIcon(new ImageIcon 
        ("/C:/Documents/NetBeansProjects/Locadora/src/imagens/"+ a.getCapa() + "/"));
        }
        classificacaoDAO cla = new classificacaoDAO(con);
        List<Classificacao> listaCLA = new ArrayList<>();
        String b = jTF_Classificacao.getText();
        int codigo = Integer.parseInt(b);
        listaCLA = cla.ListarPrecoClassificacao(codigo);
        for (Classificacao a : listaCLA) {
            double preco = a.getPreco();
            jTF_Valor.setText("" + preco + "0");
        }
        
        conexao.FecharConexao(con);
    }
    
    private void AtualizaCombo() {
        Connection con = conexao.AbrirConexao();
        clienteDAO sql = new clienteDAO(con);
        List<Cliente> lista = new ArrayList<>();
        lista = sql.ListarComboCliente();
        jCB_Cliente.addItem("");

        for (Cliente b : lista) {

            jCB_Cliente.addItem(b.getNome());
        }
        conexao.FecharConexao(con);
    }
    
    
    private void AtualizaTable() {
        
        Connection con = conexao.AbrirConexao();
        AluguelDAO bd = new AluguelDAO(con);
        List<Aluguel> lista = new ArrayList<>();
        lista = bd.ListarAluguel();
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        while (tbm.getRowCount() > 0){
            tbm.removeRow(0);
        }
        int i = 0;
        for (Aluguel tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getCod(), i, 0);
            jTable.setValueAt(tab.getCoddvd(), i, 1);
            jTable.setValueAt(tab.getCodcliente(), i, 2);
            jTable.setValueAt(tab.getHorario(), i, 3);
            jTable.setValueAt(tab.getData_aluguel(), i, 4);
            jTable.setValueAt(tab.getData_devolucao(), i, 5);
            i++;
        }
        conexao.FecharConexao(con);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_CodDVD = new javax.swing.JTextField();
        btOK = new javax.swing.JButton();
        jTF_Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTF_Horas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_Titulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_Categoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTF_Classificacao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTF_Valor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTF_CodCliente = new javax.swing.JTextField();
        jCB_Cliente = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTF_DataLocacao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLbFoto = new javax.swing.JLabel();
        jDateDevolucao = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("codigo do DVD:");

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        jLabel2.setText("Horas:");

        jTF_Horas.setEditable(false);
        jTF_Horas.setText("10:51");

        jLabel3.setText("Titulo:");

        jLabel4.setText("Categoria:");

        jLabel5.setText("Classificação:");

        jLabel6.setText("Valor aluguel:");

        jLabel7.setText("Cliente:");

        jLabel8.setText("Data de locação:");

        jTF_DataLocacao.setText("27/11/2019");

        jLabel9.setText("Data de devolução");

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jButton3.setText("Limpar");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jButton20.setText("Cancelar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jButton3)
                .addGap(96, 96, 96)
                .addComponent(btCadastrar)
                .addGap(87, 87, 87)
                .addComponent(jButton20)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(jButton3)
                    .addComponent(jButton20))
                .addContainerGap())
        );

        jLbFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/DVD_VIDEO_logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTF_CodDVD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btOK)
                        .addGap(94, 94, 94)
                        .addComponent(jTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jTF_CodCliente))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_Valor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCB_Cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_DataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addComponent(jLbFoto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTF_CodDVD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btOK)
                            .addComponent(jTF_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTF_Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTF_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTF_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jTF_Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTF_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTF_CodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCB_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jTF_DataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(jDateDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jLabel10.setText("pesquisa por código:");

        jButton21.setText("Lupa");

        jLabel11.setText("Pesquisa por DVD:");

        jButton22.setText("Lupa");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel12.setText("Pesquisa por Cliente:");

        jButton23.setText("Lupa");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton5.setText("TODOS");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "DVD", "Cliente", "Horario", "Locação", "Devolução"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(371, 377, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22)
                            .addComponent(jButton23))
                        .addGap(53, 53, 53)
                        .addComponent(jButton5)))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Consultar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    public void con(){
                  Connection con = conexao.AbrirConexao();
    }
    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    
    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        String pesquisa = jTF_CodDVD.getText();
        Connection con = conexao.AbrirConexao();
        if (pesquisa.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o codigo do DVD",
                    "Video Locadora", JOptionPane.WARNING_MESSAGE);
        } else {
        
            DVDDAO sql = new DVDDAO(con);
            int cod = Integer.parseInt(pesquisa);
            if (sql.Testar_DVD(cod) == false) {
            JOptionPane.showMessageDialog(null, "Codigo do DVD não Encontrado", 
                    "Video Locadora", JOptionPane.ERROR_MESSAGE);
                jTF_CodDVD.setText("");
                jTF_Titulo.setText("");
                jTF_Valor.setText("");
                jTF_Categoria.setText("");
                jTF_Classificacao.setText("");
                jLbFoto.setIcon(new ImageIcon(""));
                jTF_Codigo.setText("");
                
            }else
            if (sql.Testar_Situacao(cod) == false) {
                JOptionPane.showMessageDialog(null, "o DVD de codigo ( "+cod+" )"
                + " está Emprestado", "Video Locadora", JOptionPane.INFORMATION_MESSAGE);
                jTF_CodDVD.setText("");
                jTF_Titulo.setText("");
                jTF_Valor.setText("");
                jTF_Categoria.setText("");
                jTF_Classificacao.setText("");
                jLbFoto.setIcon(new ImageIcon(""));
                jTF_Codigo.setText("");
            } else {
            
                InserirDados(cod);
                jTF_Codigo.setText(pesquisa);
                jTF_CodDVD.setText("");
            }
            
        }
        conexao.FecharConexao(con);

    }//GEN-LAST:event_btOKActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        String dvd = jTF_Codigo.getText();
        String cliente = jTF_CodCliente.getText();
        String horario = jTF_Horas.getText();
        String aluguel = jTF_DataLocacao.getText();
        
        if(dvd.equals("") || cliente.equals("") || jDateDevolucao.equals("") ){
            JOptionPane.showInputDialog(null,"Nenhum campo pode estar vazio"
                    + "Video Locadora",JOptionPane.WARNING_MESSAGE);
                
        }else{
        String devolucao = new SimpleDateFormat("dd/MM/yyyy").format(jDateDevolucao.getDate());    
            Connection con = conexao.AbrirConexao();
            AluguelDAO sql = new AluguelDAO(con);
            int coddvd = Integer.parseInt(dvd);
            int codcli = Integer.parseInt(cliente);
            Aluguel a = new Aluguel();
            a.setCoddvd(coddvd);
            a.setCodcliente(codcli);
            a.setHorario(horario);
            a.setData_aluguel(aluguel);
            a.setData_devolucao(devolucao);
            try {
                sql.Inserir_Aluguel(a);
            } catch (SQLException ex) {

            }
            String situacao = "emprestado" ;
            sql.Atualizar_Situacao(situacao, coddvd);
            conexao.FecharConexao(con);
            
            JOptionPane.showMessageDialog(null,"Cadastro Realizado com Sucesso"
                    ,"Video Locadora",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    public void AtualizaDate(){
        Date date = new Date();
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat hora = new SimpleDateFormat("hh:mm");
        jTF_DataLocacao.setText(data.format(date));
        jTF_Horas.setText(hora.format(date));
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
            java.util.logging.Logger.getLogger(Cadastrodelocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrodelocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrodelocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrodelocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrodelocacao().setVisible(true);
            }
        });
    }
    
    public List<DVD> ListarCodFilme(int cod){
          String sql = "select idfilme from dvd where iddvd = " + cod + "";  
          List<DVD> lista = new ArrayList<>();
          
          
          try{
              Connection con = conexao.AbrirConexao();
              PreparedStatement ps = getcon().prepareStatement(sql);
              ResultSet rs = ps.executeQuery();
          
              if(rs != null){
                    while(rs.next()){
                        DVD a = new DVD();    
                        a.setCod_filme(rs.getInt(1));
                        
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btOK;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jCB_Cliente;
    private com.toedter.calendar.JDateChooser jDateDevolucao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTF_Categoria;
    private javax.swing.JTextField jTF_Classificacao;
    private javax.swing.JTextField jTF_CodCliente;
    private javax.swing.JTextField jTF_CodDVD;
    private javax.swing.JTextField jTF_Codigo;
    private javax.swing.JTextField jTF_DataLocacao;
    private javax.swing.JTextField jTF_Horas;
    private javax.swing.JTextField jTF_Titulo;
    private javax.swing.JTextField jTF_Valor;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    // End of variables declaration//GEN-END:variables
}
