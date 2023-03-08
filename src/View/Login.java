package View;

//Imports
import Principal.Principal;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.util.*;
import Model.Senha;
import DAO.SenhaDAO;

public class Login extends javax.swing.JFrame {

    //Atributos (senha e usuário padrão)
    private String senha = "123456";
    private String usuario = "Usuario";
    private int contador;

    //getters e setters
    public String getSenha() {
        return senha;
    }

    public void setSenha(String s) {
        this.senha = s;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //Contrutor
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        c_usuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        C_senha = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        Botao_entrar = new javax.swing.JButton();
        botao_recuperar_senha = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(700, 465));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        c_usuario.setBackground(new java.awt.Color(102, 102, 102));
        c_usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        c_usuario.setForeground(new java.awt.Color(0, 0, 0));
        c_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c_usuarioKeyPressed(evt);
            }
        });
        getContentPane().add(c_usuario);
        c_usuario.setBounds(245, 173, 177, 30);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(204, 204, 204));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(301, 215, 70, 25);

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(204, 204, 204));
        lblLogin.setText("Login");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(280, 30, 100, 48);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(295, 136, 80, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/unisulPequena.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 357, 230, 59);

        C_senha.setBackground(new java.awt.Color(102, 102, 102));
        C_senha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        C_senha.setForeground(new java.awt.Color(0, 0, 0));
        C_senha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_senhaActionPerformed(evt);
            }
        });
        C_senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                C_senhaKeyPressed(evt);
            }
        });
        getContentPane().add(C_senha);
        C_senha.setBounds(245, 252, 177, 31);

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(684, 17, 0, 0);

        Botao_entrar.setBackground(new java.awt.Color(102, 102, 102));
        Botao_entrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Botao_entrar.setForeground(new java.awt.Color(0, 0, 0));
        Botao_entrar.setText("Entrar");
        Botao_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(Botao_entrar);
        Botao_entrar.setBounds(292, 301, 80, 26);

        botao_recuperar_senha.setBackground(new java.awt.Color(102, 102, 102));
        botao_recuperar_senha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botao_recuperar_senha.setForeground(new java.awt.Color(0, 0, 0));
        botao_recuperar_senha.setText("Esqueceu a senha?");
        botao_recuperar_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_recuperar_senhaActionPerformed(evt);
            }
        });
        getContentPane().add(botao_recuperar_senha);
        botao_recuperar_senha.setBounds(523, 390, 160, 26);
        getContentPane().add(canvas1);
        canvas1.setBounds(523, 240, 0, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/paisagem.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 710, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //configuração do botão de entrar
    private void Botao_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_entrarActionPerformed
        // TODO add your handling code here:
        ArrayList<Senha> pegasenha = new ArrayList<>();
        pegasenha = SenhaDAO.senha;
        for(Senha a : pegasenha){
        
            if (c_usuario.getText().equals(usuario) && C_senha.getText().equals(a.getSenha())) {
                if (contador <= 3) {
                    TelaPrincipal objetotela = new TelaPrincipal();
                    objetotela.setVisible(true);
                    setVisible(false);
                }
            } else if (contador < 3) {
                JOptionPane.showMessageDialog(null, "Acesso negado!");
                contador++;
            } else {
                JOptionPane.showMessageDialog(null, "Você atingiu o limite maximo de tentativa, aperte em esqueci minha senha");
            }
        
        }
    }//GEN-LAST:event_Botao_entrarActionPerformed

    //Confiração do botão recuperar senha
    private void botao_recuperar_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_recuperar_senhaActionPerformed
        // TODO add your handling code here:
        RecuperarSenha esqueceuSenha = new RecuperarSenha();
        esqueceuSenha.setVisible(true);
        setVisible(false);


    }//GEN-LAST:event_botao_recuperar_senhaActionPerformed

    //Configuração do atalho ENTER para logar
    private void C_senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_C_senhaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        
            ArrayList<Senha> pegasenha = new ArrayList<>();
            pegasenha = SenhaDAO.senha;
            for(Senha a : pegasenha){
                if (c_usuario.getText().equals(usuario) && C_senha.getText().equals(a.getSenha())) {
                    if (contador <= 3) {
                        TelaPrincipal objetotela = new TelaPrincipal();
                        objetotela.setVisible(true);
                        setVisible(false);
                    }
                } else if (contador < 3) {
                    JOptionPane.showMessageDialog(null, "Acesso negado!");
                    contador++;
                } else {
                    JOptionPane.showMessageDialog(null, "Você atingiu o limite maximo de tentativa, aperte em esqueci minha senha");
                }
            }
        }
    }//GEN-LAST:event_C_senhaKeyPressed

    private void C_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_senhaActionPerformed

    //Atalho para ir ao próximo campo
    private void c_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_usuarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            C_senha.requestFocus();
        }


    }//GEN-LAST:event_c_usuarioKeyPressed
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_entrar;
    private javax.swing.JPasswordField C_senha;
    private javax.swing.JButton botao_recuperar_senha;
    private javax.swing.JTextField c_usuario;
    private java.awt.Canvas canvas1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
