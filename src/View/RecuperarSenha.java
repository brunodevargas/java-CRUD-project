package View;

//Imports
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Model.Senha;
import DAO.SenhaDAO;

public class RecuperarSenha extends javax.swing.JFrame{

    //Instanciando um objeto de Login
    Login login = new Login();

    //Construtor
    public RecuperarSenha() {
        initComponents();
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        C_confirma_usuario = new javax.swing.JTextField();
        c_digitar_novaSenha = new javax.swing.JPasswordField();
        c_confirmar_novaSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botao_voltar = new javax.swing.JButton();
        botao_confirma = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 465));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Recuperar senha");
        jLabel1.setPreferredSize(new java.awt.Dimension(314, 48));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 25, 280, 48);

        C_confirma_usuario.setBackground(new java.awt.Color(102, 102, 102));
        C_confirma_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        C_confirma_usuario.setForeground(new java.awt.Color(0, 0, 0));
        C_confirma_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C_confirma_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_confirma_usuarioActionPerformed(evt);
            }
        });
        C_confirma_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                C_confirma_usuarioKeyPressed(evt);
            }
        });
        getContentPane().add(C_confirma_usuario);
        C_confirma_usuario.setBounds(247, 148, 190, 26);

        c_digitar_novaSenha.setBackground(new java.awt.Color(102, 102, 102));
        c_digitar_novaSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_digitar_novaSenha.setForeground(new java.awt.Color(0, 0, 0));
        c_digitar_novaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c_digitar_novaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_digitar_novaSenhaActionPerformed(evt);
            }
        });
        c_digitar_novaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_digitar_novaSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(c_digitar_novaSenha);
        c_digitar_novaSenha.setBounds(247, 218, 190, 26);

        c_confirmar_novaSenha.setBackground(new java.awt.Color(102, 102, 102));
        c_confirmar_novaSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_confirmar_novaSenha.setForeground(new java.awt.Color(0, 0, 0));
        c_confirmar_novaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c_confirmar_novaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_confirmar_novaSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(c_confirmar_novaSenha);
        c_confirmar_novaSenha.setBounds(247, 288, 190, 26);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Insira nome do usuário:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(247, 122, 170, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Digite a nova senha:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(247, 192, 160, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Confirme nova senha:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(247, 262, 170, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/unisulPequena.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(16, 364, 230, 59);

        botao_voltar.setBackground(new java.awt.Color(102, 102, 102));
        botao_voltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_voltar.setForeground(new java.awt.Color(0, 0, 0));
        botao_voltar.setText("Voltar");
        botao_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(botao_voltar);
        botao_voltar.setBounds(247, 332, 72, 26);

        botao_confirma.setBackground(new java.awt.Color(102, 102, 102));
        botao_confirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_confirma.setForeground(new java.awt.Color(0, 0, 0));
        botao_confirma.setText("Confirmar");
        botao_confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_confirmaActionPerformed(evt);
            }
        });
        getContentPane().add(botao_confirma);
        botao_confirma.setBounds(337, 332, 100, 26);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 10, 0, 0);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/paisagem.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 700, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Métodos gerais
    private void C_confirma_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_confirma_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_confirma_usuarioActionPerformed

    private void c_digitar_novaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_digitar_novaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_digitar_novaSenhaActionPerformed

    //Configuração do botão 
    private void botao_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_voltarActionPerformed
        // TODO add your handling code here:

        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_botao_voltarActionPerformed
    private void botao_confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_confirmaActionPerformed
        // TODO add your handling code here:

        String senha = String.valueOf(c_digitar_novaSenha.getPassword());
        String confirmaSenha = String.valueOf(c_confirmar_novaSenha.getPassword());
        String nome = C_confirma_usuario.getText();

        if (senha.equals(confirmaSenha) && nome.equals(login.getUsuario())) {
            Senha update = new Senha();
            senha = c_confirmar_novaSenha.getText();
            update.updateSenhaBD(senha);
            login.setVisible(true);
            this.setVisible(false);
            

        } else if (nome.equals(login.getUsuario()) == false) {
            JOptionPane.showMessageDialog(null, "Esse usuário não existe!");
        } else if (senha.equals(confirmaSenha) == false) {
            JOptionPane.showMessageDialog(null, "As senhas não são compativeis.");
        }
    }//GEN-LAST:event_botao_confirmaActionPerformed

    //Configuração de confirmar senha
    private void c_confirmar_novaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_confirmar_novaSenhaKeyPressed

        //Atalho pressionando ENTER para confirmar senha
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String senha = String.valueOf(c_digitar_novaSenha.getPassword());
            String confirmaSenha = String.valueOf(c_confirmar_novaSenha.getPassword());
            String nome = C_confirma_usuario.getText();

            if (senha.equals(confirmaSenha) && nome.equals(login.getUsuario())) {
            Senha update = new Senha();
            senha = c_confirmar_novaSenha.getText();
            update.updateSenhaBD(senha);
            login.setVisible(true);
            this.setVisible(false);

            } else if (nome.equals(login.getUsuario()) == false) {
                JOptionPane.showMessageDialog(null, "Esse usuário não existe!");
            } else if (senha.equals(confirmaSenha) == false) {
                JOptionPane.showMessageDialog(null, "As senhas não são compativeis.");
            }
        }

    }//GEN-LAST:event_c_confirmar_novaSenhaKeyPressed

    //Atalho para ir ao próximo campo
    private void C_confirma_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_C_confirma_usuarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            c_digitar_novaSenha.requestFocus();
        }
    }//GEN-LAST:event_C_confirma_usuarioKeyPressed

    //Atalho para ir ao próximo campo
    private void c_digitar_novaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_digitar_novaSenhaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            c_confirmar_novaSenha.requestFocus();
        }
    }//GEN-LAST:event_c_digitar_novaSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(RecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField C_confirma_usuario;
    private javax.swing.JButton botao_confirma;
    private javax.swing.JButton botao_voltar;
    private javax.swing.JPasswordField c_confirmar_novaSenha;
    private javax.swing.JPasswordField c_digitar_novaSenha;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
