package View;

//Imports
import Model.Funcionario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroFuncionario extends javax.swing.JFrame {

    // cria o vinculo com o Funcionario.java
    private Funcionario objaluno;

    //Construtor 
    public CadastroFuncionario() {
        initComponents();
        this.objaluno = new Funcionario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_cadastrar = new javax.swing.JButton();
        b_cancelar = new javax.swing.JButton();
        t_matutino = new javax.swing.JRadioButton();
        t_vespertino = new javax.swing.JRadioButton();
        t_integral = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        c_cpf = new javax.swing.JFormattedTextField();
        c_idade = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        C_selecaoDeSetor = new javax.swing.JComboBox<>();

        setTitle("Cadastro de Funcionário");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });
        c_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_nomeKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Idade: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Turno:");

        b_cadastrar.setText("Cadastrar");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        buttonGroup1.add(t_matutino);
        t_matutino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_matutino.setText("Matutino");
        t_matutino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        t_matutino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_matutinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(t_vespertino);
        t_vespertino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_vespertino.setText("Vespertino");
        t_vespertino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_vespertinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(t_integral);
        t_integral.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        t_integral.setText("Integral");
        t_integral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_integralActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Cadastro de funcionário");
        jLabel5.setToolTipText("");

        try {
            c_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        c_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cpfActionPerformed(evt);
            }
        });

        try {
            c_idade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        c_idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_idadeKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Setor:");

        C_selecaoDeSetor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        C_selecaoDeSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Setor:", "Ti", "Limpeza", "Financeiro", "Atendimento" }));
        C_selecaoDeSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_selecaoDeSetorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(b_cancelar)
                        .addGap(54, 54, 54)
                        .addComponent(b_cadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(t_matutino)
                                .addComponent(t_vespertino)
                                .addComponent(t_integral)
                                .addComponent(jLabel2)
                                .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(C_selecaoDeSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(222, 222, 222))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_matutino)
                    .addComponent(C_selecaoDeSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_vespertino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_integral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cadastrar)
                    .addComponent(b_cancelar))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Métodos gerais
    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    //Configuração de cadastrar funcionário
    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed

        try {
            // recebendo e validando dados da interface gr�fica.
            String nome = "";
            int idade = 0;
            String cpf = "";
            String Turno = "";
            String setor = "";

            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }

            if (this.c_idade.getText().length() <= 0) {
                throw new Mensagens("Idade deve ser maior que zero.");
            } else {
                idade = Integer.parseInt(this.c_idade.getText());
            }
            //tirando espaços de cpf
            cpf = this.c_cpf.getText().replace(" ", "");

            if (cpf.length() == 14) {
                cpf = this.c_cpf.getText();
            } else {
                throw new Mensagens("CPf deve conter 11 Número");
            }

            if (t_integral.isSelected() == true) {
                Turno = this.t_integral.getText();

            } else if (t_matutino.isSelected() == true) {
                Turno = this.t_matutino.getText();

            } else if (t_vespertino.isSelected() == true) {
                Turno = this.t_vespertino.getText();

            } else {
                throw new Mensagens("Selecione um turno");
            }

            if (C_selecaoDeSetor.getSelectedItem().equals("Selecione um Setor:")) {
                throw new Mensagens("Selecione um Setor");
            } else {
                setor = C_selecaoDeSetor.getSelectedItem().toString();
            }

            // envia os dados para o Controlador cadastrar
            if (this.objaluno.InsertAlunoBD(setor, cpf, Turno, nome, idade)) {
                JOptionPane.showMessageDialog(rootPane, "Funcionário Cadastrado com Sucesso!");

                // limpa campos da interface
                this.c_nome.setText("");
                this.c_idade.setValue(null);
                this.c_cpf.setValue(null);

                buttonGroup1.clearSelection();
                C_selecaoDeSetor.setSelectedIndex(0);

            }
            System.out.println(this.objaluno.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        }


    }//GEN-LAST:event_b_cadastrarActionPerformed

    //Configuração do botão cancelar
    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_b_cancelarActionPerformed

    //Métodos gerais
    private void t_matutinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_matutinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_matutinoActionPerformed

    private void t_integralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_integralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_integralActionPerformed

    private void t_vespertinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_vespertinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_vespertinoActionPerformed

    private void C_selecaoDeSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_selecaoDeSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_selecaoDeSetorActionPerformed

    private void c_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_cpfActionPerformed

    //Atalho para ir ao próximo campo idade
    private void c_nomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_nomeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            c_idade.requestFocus();
        }
    }//GEN-LAST:event_c_nomeKeyPressed
    //Atalho para ir ao próximo campo cpf
    private void c_idadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_idadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            c_cpf.requestFocus();
        }
    }//GEN-LAST:event_c_idadeKeyPressed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> C_selecaoDeSetor;
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField c_cpf;
    private javax.swing.JFormattedTextField c_idade;
    private javax.swing.JTextField c_nome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton t_integral;
    private javax.swing.JRadioButton t_matutino;
    private javax.swing.JRadioButton t_vespertino;
    // End of variables declaration//GEN-END:variables
}
