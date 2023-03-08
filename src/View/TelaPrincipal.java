package View;
//Imports abaixo

import Model.Funcionario;
import Model.Tarefas;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

//Classe da Tela principal
public class TelaPrincipal extends javax.swing.JFrame {

    //Atributos
    private Tarefas objtarefa;

    //Contrutor
    public TelaPrincipal() {
        initComponents();
        this.objtarefa = new Tarefas();
        this.carregaTabelaadd();
        this.checkBoxMostrar.setVisible(false);
        this.lblMostrarPainel.setVisible(false);

    }

    //Carrega tabela de tarefa 
    public void carregaTabelaadd() {

        DefaultTableModel modelo = (DefaultTableModel) this.TabelaTarefa.getModel();
        modelo.setNumRows(0);

        ArrayList<Tarefas> minhalista = new ArrayList<>();
        minhalista = objtarefa.getMinhaTarefa();

        for (Tarefas a : minhalista) {
            modelo.addRow(new Object[]{
                a.getNumerotarefa(),
                a.getNome(),
                a.getTarefa(),
                a.getDescricaotarefa(),
                a.getStatus()
            });
        }
    }

    //Método teste de puxar dados
    public Model.Tarefas puxarItens(int id) {
        //ArrayList
        ArrayList<Tarefas> minhalista = new ArrayList<>();
        minhalista = objtarefa.getMinhaTarefa();
        for (int cont = 0; cont == id; cont++) {
            objtarefa = minhalista.get(id);
            System.out.println(objtarefa);
        }
        return objtarefa;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        checkBoxMostrar = new javax.swing.JCheckBox();
        lblTabelaTarefa = new javax.swing.JLabel();
        painelDeTarefa = new javax.swing.JPanel();
        checkboxOcultar = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaTarefa = new javax.swing.JTable();
        NovaTarefa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblMostrarPainel = new javax.swing.JLabel();
        imagemDeFundo = new javax.swing.JLabel();
        barraDeMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        c_novoFuncionario = new javax.swing.JMenuItem();
        c_gerenciarFuncionario = new javax.swing.JMenuItem();
        c_logout = new javax.swing.JMenuItem();
        c_sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        sobreIntegrantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(1070, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/unisulPequena.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 460, 200, 59);

        checkBoxMostrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkBoxMostrar.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxMostrar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        checkBoxMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(checkBoxMostrar);
        checkBoxMostrar.setBounds(870, 30, 15, 15);

        lblTabelaTarefa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTabelaTarefa.setForeground(new java.awt.Color(0, 0, 0));
        lblTabelaTarefa.setText("Tabela de tarefa");
        getContentPane().add(lblTabelaTarefa);
        lblTabelaTarefa.setBounds(590, 20, 193, 32);

        painelDeTarefa.setOpaque(false);

        checkboxOcultar.setBackground(new java.awt.Color(102, 102, 102));
        checkboxOcultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkboxOcultar.setForeground(new java.awt.Color(0, 0, 0));
        checkboxOcultar.setBorder(null);
        checkboxOcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxOcultarActionPerformed(evt);
            }
        });

        TabelaTarefa.setBackground(new java.awt.Color(153, 153, 153));
        TabelaTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TabelaTarefa.setForeground(new java.awt.Color(0, 0, 0));
        TabelaTarefa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº tarefa", "Atribuido para:", "Tarefa", "Descrição tarefa", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaTarefa.setToolTipText("Click duas vezes para abrir a tarefa");
        TabelaTarefa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelaTarefa.setOpaque(false);
        TabelaTarefa.getTableHeader().setReorderingAllowed(false);
        TabelaTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaTarefaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaTarefa);
        if (TabelaTarefa.getColumnModel().getColumnCount() > 0) {
            TabelaTarefa.getColumnModel().getColumn(0).setMinWidth(50);
            TabelaTarefa.getColumnModel().getColumn(0).setMaxWidth(80);
            TabelaTarefa.getColumnModel().getColumn(4).setMinWidth(100);
            TabelaTarefa.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        NovaTarefa.setBackground(new java.awt.Color(102, 102, 102));
        NovaTarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NovaTarefa.setForeground(new java.awt.Color(0, 0, 0));
        NovaTarefa.setText("Nova Tarefa");
        NovaTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovaTarefaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ocultar tabela de tarefa.");

        javax.swing.GroupLayout painelDeTarefaLayout = new javax.swing.GroupLayout(painelDeTarefa);
        painelDeTarefa.setLayout(painelDeTarefaLayout);
        painelDeTarefaLayout.setHorizontalGroup(
            painelDeTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDeTarefaLayout.createSequentialGroup()
                .addGroup(painelDeTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addGroup(painelDeTarefaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(checkboxOcultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NovaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelDeTarefaLayout.setVerticalGroup(
            painelDeTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDeTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDeTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovaTarefa)
                    .addComponent(jLabel2)
                    .addComponent(checkboxOcultar))
                .addGap(16, 16, 16))
        );

        getContentPane().add(painelDeTarefa);
        painelDeTarefa.setBounds(240, 60, 810, 480);

        lblMostrarPainel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMostrarPainel.setForeground(new java.awt.Color(0, 0, 0));
        lblMostrarPainel.setText("Mostrar tabela tarefa");
        getContentPane().add(lblMostrarPainel);
        lblMostrarPainel.setBounds(890, 30, 150, 20);

        imagemDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tela.jpg"))); // NOI18N
        getContentPane().add(imagemDeFundo);
        imagemDeFundo.setBounds(0, 0, 1060, 570);

        barraDeMenu.setBackground(new java.awt.Color(51, 51, 51));
        barraDeMenu.setForeground(new java.awt.Color(204, 204, 204));
        barraDeMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barraDeMenu.setPreferredSize(new java.awt.Dimension(104, 27));

        jMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jMenu1.setForeground(new java.awt.Color(204, 204, 204));
        jMenu1.setText("Arquivo");
        jMenu1.setOpaque(true);
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        c_novoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario 20 20.png"))); // NOI18N
        c_novoFuncionario.setText("Cadastrar Funcionário");
        c_novoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_novoFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(c_novoFuncionario);

        c_gerenciarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario 20 20.png"))); // NOI18N
        c_gerenciarFuncionario.setText("Gerenciar Funcionários");
        c_gerenciarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_gerenciarFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(c_gerenciarFuncionario);

        c_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagem sair.png"))); // NOI18N
        c_logout.setText("Logout");
        c_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_logoutActionPerformed(evt);
            }
        });
        jMenu1.add(c_logout);

        c_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagem sair.png"))); // NOI18N
        c_sair.setText("Sair");
        c_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_sairActionPerformed(evt);
            }
        });
        jMenu1.add(c_sair);

        barraDeMenu.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(51, 51, 51));
        jMenu2.setForeground(new java.awt.Color(204, 204, 204));
        jMenu2.setText("Sobre");

        sobreIntegrantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/informação.png"))); // NOI18N
        sobreIntegrantes.setText("Integrantes");
        sobreIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreIntegrantesActionPerformed(evt);
            }
        });
        jMenu2.add(sobreIntegrantes);

        barraDeMenu.add(jMenu2);

        setJMenuBar(barraDeMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão de novo funcionario de arquivo/menu
    private void c_novoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_novoFuncionarioActionPerformed
        // TODO add your handling code here:
        CadastroFuncionario objeto = new CadastroFuncionario();
        objeto.setVisible(true);
    }//GEN-LAST:event_c_novoFuncionarioActionPerformed

    //Botão de gerenciar funcionario da 
    private void c_gerenciarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_gerenciarFuncionarioActionPerformed
        GerenciaFuncionario objeto = new GerenciaFuncionario();

        objeto.setVisible(true);
        objeto.carregaTabela();
    }//GEN-LAST:event_c_gerenciarFuncionarioActionPerformed

    //botão de sair do sistema de arquivo/menu
    private void c_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_c_sairActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    //Direciona a página de informações dos integrantes do projeto
    private void sobreIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreIntegrantesActionPerformed
        // TODO add your handling code here:
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_sobreIntegrantesActionPerformed

    //CheckBox de mostrar tabela de tarefa
    private void checkBoxMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxMostrarActionPerformed
        // TODO add your handling code here:,,

        if (checkBoxMostrar.isSelected() == true) {
            painelDeTarefa.setVisible(true);
            lblTabelaTarefa.setVisible(true);
            checkBoxMostrar.setVisible(false);
            checkBoxMostrar.setSelected(false);
            lblMostrarPainel.setVisible(false);

        }
    }//GEN-LAST:event_checkBoxMostrarActionPerformed

    //CheckBox de ocultar tabela de tarefa 
    private void checkboxOcultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxOcultarActionPerformed
        // TODO add your handling code here:

        if (checkboxOcultar.isSelected() == true) {
            lblMostrarPainel.setVisible(true);
            painelDeTarefa.setVisible(false);
            checkBoxMostrar.setVisible(true);
            checkboxOcultar.setSelected(false);
            lblTabelaTarefa.setVisible(false);
        }
    }//GEN-LAST:event_checkboxOcultarActionPerformed

    //Campo de direcionar a area de cadastrar nova tarefa 
    private void NovaTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovaTarefaActionPerformed
        // TODO add your handling code here:
        AddTarefa objeto = new AddTarefa();
        this.setVisible(false);
        objeto.setVisible(true);
    }//GEN-LAST:event_NovaTarefaActionPerformed

    //Comando abre a aba mostrar tarefa e seta o conteudo do trecho da tabela na aba 
    private void TabelaTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaTarefaMouseClicked
        // TODO add your handling code here:
        MostraTarefa mostraTarefa = new MostraTarefa();

        if (evt.getClickCount() == 2) {

            //abrindo mostrar tarefa e fechando tela principal
            mostraTarefa.setVisible(true);
            this.setVisible(false);

            //pegando dados da tabela
            String numerotarefa = this.TabelaTarefa.getValueAt(this.TabelaTarefa.getSelectedRow(), 0).toString();
            String funcionario = this.TabelaTarefa.getValueAt(this.TabelaTarefa.getSelectedRow(), 1).toString();
            String tarefa = this.TabelaTarefa.getValueAt(this.TabelaTarefa.getSelectedRow(), 2).toString();
            String descricaotarefa = this.TabelaTarefa.getValueAt(this.TabelaTarefa.getSelectedRow(), 3).toString();
            String status = this.TabelaTarefa.getValueAt(this.TabelaTarefa.getSelectedRow(), 4).toString();

            //inserindo dados da tabela na aba mostrar tarefa
            mostraTarefa.getTextfuncionario().setText(funcionario);
            mostraTarefa.getTextTarefa().setText(tarefa);
            mostraTarefa.getTextDadosDaTarefa().setText(descricaotarefa);
            mostraTarefa.getNumeroTarefa().setText(numerotarefa);
            //setando status em mostrar tarefa
            if (status.equals("Pendente")) {
                mostraTarefa.getRadioPendente().setSelected(true);
            } else if (status.equals("Resolvido")) {
                mostraTarefa.getRadioResolvido().setSelected(true);
            }
        }
    }//GEN-LAST:event_TabelaTarefaMouseClicked

    //Configuração do botão logout 
    private void c_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_logoutActionPerformed

        //fecha tela principal e volta para login
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_c_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    //getters e setters
    public JTable getTabelaTarefa() {
        return TabelaTarefa;
    }

    public void setTabelaTarefa(JTable TabelaTarefa) {
        this.TabelaTarefa = TabelaTarefa;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NovaTarefa;
    private javax.swing.JTable TabelaTarefa;
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JMenuItem c_gerenciarFuncionario;
    private javax.swing.JMenuItem c_logout;
    private javax.swing.JMenuItem c_novoFuncionario;
    private javax.swing.JMenuItem c_sair;
    private javax.swing.JCheckBox checkBoxMostrar;
    private javax.swing.JCheckBox checkboxOcultar;
    private javax.swing.JLabel imagemDeFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMostrarPainel;
    private javax.swing.JLabel lblTabelaTarefa;
    private javax.swing.JPanel painelDeTarefa;
    private javax.swing.JMenuItem sobreIntegrantes;
    // End of variables declaration//GEN-END:variables
}
