package View;

//Imports
import DAO.FuncionarioDAO;
import Model.Funcionario;
import Model.Tarefas;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class AddTarefa extends javax.swing.JFrame {

    //Atributos
    private Tarefas objetotarefas;

    //Instanciando a tela principal
    TelaPrincipal telaPrincipal = new TelaPrincipal();

    //Construtor
    public AddTarefa() {
        initComponents();
        this.objetotarefas = new Tarefas(); // carrega objaluno de aluno
        this.carregaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        c_tarefa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_descricaotarefa = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();
        add_tarefa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEscolhaFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Nova Tarefa");
        jLabel1.setToolTipText("");

        c_tarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_tarefaActionPerformed(evt);
            }
        });
        c_tarefa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_tarefaKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tarefa:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Oque deverá ser realizado:");

        c_descricaotarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_descricaotarefaActionPerformed(evt);
            }
        });
        c_descricaotarefa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_descricaotarefaKeyPressed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        add_tarefa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_tarefa.setText("Adicionar tarefa");
        add_tarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_tarefaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Atribuir tarefa a:");

        tabelaEscolhaFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaEscolhaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "CPF", "Turno", "Setor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEscolhaFuncionario.getTableHeader().setReorderingAllowed(false);
        tabelaEscolhaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEscolhaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEscolhaFuncionario);
        if (tabelaEscolhaFuncionario.getColumnModel().getColumnCount() > 0) {
            tabelaEscolhaFuncionario.getColumnModel().getColumn(0).setMinWidth(50);
            tabelaEscolhaFuncionario.getColumnModel().getColumn(0).setMaxWidth(50);
            tabelaEscolhaFuncionario.getColumnModel().getColumn(2).setMinWidth(70);
            tabelaEscolhaFuncionario.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(botaoVoltar)
                                            .addGap(28, 28, 28)
                                            .addComponent(add_tarefa))
                                        .addComponent(c_descricaotarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel6))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_descricaotarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(add_tarefa))
                .addGap(19, 19, 19))
        );

        getAccessibleContext().setAccessibleName("Cadastro de tarefa");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Métodos gerais
    private void c_tarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_tarefaActionPerformed
    }//GEN-LAST:event_c_tarefaActionPerformed

    private void c_descricaotarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_descricaotarefaActionPerformed
    }//GEN-LAST:event_c_descricaotarefaActionPerformed

    //Configuração do botão voltar
    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        telaPrincipal.setVisible(true);

    }//GEN-LAST:event_botaoVoltarActionPerformed

    //Configuração do botão adicionar tarefa
    private void add_tarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_tarefaActionPerformed
        try {
            // recebendo e validando dados da interface gráfica.

            int id = 0;
            String nome = "";
            int idade = 0;
            String cpf = "";
            String turno = "";
            String setor = "";
            String tarefa = "";
            String descricaotarefa = "";
            String status = "";
            
            //conferindo se algo está selecionado na tabela 
            if (this.tabelaEscolhaFuncionario.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Funcionário");
            } else {
                id = Integer.parseInt(this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 0).toString());
                setor = this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 5).toString();
                nome = this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 1).toString();
                turno = this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 4).toString();
                cpf = this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 3).toString();
                idade = Integer.parseInt(this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 2).toString());
            }
            
            if (this.c_tarefa.getText().length() == 0) {
                throw new Mensagens("Escreva um titulo para a tarefa");
            } else {
                tarefa = this.c_tarefa.getText();
            }
            if (this.c_descricaotarefa.getText().length() == 0) {
                throw new Mensagens("Escreva a tarefa");
            } else {
                descricaotarefa = this.c_descricaotarefa.getText();
            }
            //Definindo pendente como padrão ao criar uma tarefa
            status = "Pendente";
            if (this.objetotarefas.InsertTarefaBD(tarefa, descricaotarefa,status, setor, cpf, turno, nome, idade, id)) {
                
                //Mensagem de confirmação para o usuário
                JOptionPane.showMessageDialog(rootPane, "Tarefa criada com Sucesso!");

                // limpa campos da interface
                
                this.c_tarefa.setText("");
                this.c_descricaotarefa.setText("");
            }

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            telaPrincipal.carregaTabelaadd();
        }
    }//GEN-LAST:event_add_tarefaActionPerformed
    
    //Evento de selecionar diretamente na tabela 
    private void tabelaEscolhaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEscolhaFuncionarioMouseClicked
    }//GEN-LAST:event_tabelaEscolhaFuncionarioMouseClicked

    //atalho para proximo campo descrição tarefa
    private void c_tarefaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_tarefaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            c_descricaotarefa.requestFocus();
        }
    }//GEN-LAST:event_c_tarefaKeyPressed

    //atalho para o botão adicionar tarefa
    private void c_descricaotarefaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_descricaotarefaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
            // recebendo e validando dados da interface gráfica.

            int id = 0;
            String nome = "";
            int idade = 0;
            String cpf = "";
            String turno = "";
            String setor = "";
            String tarefa = "";
            String descricaotarefa = "";
            String status = "";
            
            //conferindo se algo está selecionado na tabela 
            if (this.tabelaEscolhaFuncionario.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Funcionário");
            } else {
                id = Integer.parseInt(this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 0).toString());
                setor = this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 5).toString();
                nome = this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 1).toString();
                turno = this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 4).toString();
                cpf = this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 3).toString();
                idade = Integer.parseInt(this.tabelaEscolhaFuncionario.getValueAt(this.tabelaEscolhaFuncionario.getSelectedRow(), 2).toString());
            }
            
            if (this.c_tarefa.getText().length() == 0) {
                throw new Mensagens("Escreva um titulo para a tarefa");
            } else {
                tarefa = this.c_tarefa.getText();
            }
            if (this.c_descricaotarefa.getText().length() == 0) {
                throw new Mensagens("Escreva a tarefa");
            } else {
                descricaotarefa = this.c_descricaotarefa.getText();
            }
            //Definindo pendente como padrão ao criar uma tarefa
            status = "Pendente";
            if (this.objetotarefas.InsertTarefaBD(tarefa, descricaotarefa,status, setor, cpf, turno, nome, idade, id)) {
                
                //Mensagem de confirmação para o usuário
                JOptionPane.showMessageDialog(rootPane, "Tarefa criada com Sucesso!");

                this.setVisible(false);
                telaPrincipal.setVisible(true);
                // limpa campos da interface
                
                this.c_tarefa.setText("");
                this.c_descricaotarefa.setText("");
            }

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {
            telaPrincipal.carregaTabelaadd();
        }
            
        }
    }//GEN-LAST:event_c_descricaotarefaKeyPressed

    @SuppressWarnings("unchecked")
    //Método de carregar tabela 
    public void carregaTabela() {

        DefaultTableModel modelo = (DefaultTableModel) this.tabelaEscolhaFuncionario.getModel();
        modelo.setNumRows(0);
        
        ArrayList<Funcionario> minhalista = new ArrayList<>();
        minhalista = objetotarefas.getMinhaLista();

        for (Funcionario a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getIdade(),
                a.getCpf(),
                a.getTurno(),
                a.getSetor()
            });
        }
    }

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
            java.util.logging.Logger.getLogger(AddTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTarefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_tarefa;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField c_descricaotarefa;
    private javax.swing.JTextField c_tarefa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEscolhaFuncionario;
    // End of variables declaration//GEN-END:variables
}
