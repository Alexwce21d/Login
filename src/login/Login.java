package login;

import cNegocio.UserService;
import cPresentacion.MainWindow;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private UserService userService;

    /**
    * Crea un nuevo formulario de inicio de sesión
    */
    public Login() {
        initComponents();
        userService = new UserService();
    
    }
    

    /**
    * Este método se llama desde el constructor para inicializar el formulario.
    * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
    * regenerado por el Editor de formularios.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblAvatar = new javax.swing.JLabel();
        txtUsuariooEmail = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        txtPassContraseña = new javax.swing.JPasswordField();
        jCheckBoxRecuerdame = new javax.swing.JCheckBox();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblCardHeader = new javax.swing.JLabel();
        lblCardContent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Avatar_Container.png"))); // NOI18N
        lblAvatar.setText("jLabel3");
        jPanel2.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 450, -1));
        jPanel2.add(txtUsuariooEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 370, 30));

        lblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContraseña.setText("Contraseña");
        jPanel2.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));
        jPanel2.add(txtPassContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 370, 30));

        jCheckBoxRecuerdame.setText("Recuerdame");
        jPanel2.add(jCheckBoxRecuerdame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        btnRegister.setBackground(new java.awt.Color(85, 110, 230));
        btnRegister.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnRegister.setText("Signup now");
        btnRegister.setBorder(null);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 370, 30));

        btnLogin.setBackground(new java.awt.Color(85, 110, 230));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 370, 30));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblCardHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Header.jpg"))); // NOI18N
        lblCardHeader.setText("jLabel2");
        lblCardHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblCardHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        lblCardContent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Card_Content.png"))); // NOI18N
        lblCardContent.setText("jLabel1");
        lblCardContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblCardContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 450, 380));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 450, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
         String username = txtUsuariooEmail.getText();
    String password = new String(txtPassContraseña.getPassword());
    if (userService.authenticate(username, password)) {
        // Autenticación exitosa, mostrar mensaje de bienvenida
        JOptionPane.showMessageDialog(this, "Bienvenido " + username + "!", "Autenticación exitosa", JOptionPane.INFORMATION_MESSAGE);
        // Cerrar la ventana de login y mostrar la ventana principal
        this.dispose();
        new MainWindow().setVisible(true);
    } else {
        // Autenticación fallida, mostrar mensaje de error
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
         RegisterWindow registerWindow = new RegisterWindow();
        JFrame registerFrame = new JFrame("Registro");
        registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        registerFrame.add(registerWindow);
        registerFrame.pack();
        registerFrame.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * @param args the command line arguments (argumenta los argumentos de la línea de comando)
     */
    public static void main(String args[]) {
        /* Establecer la apariencia de Nimbus */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox jCheckBoxRecuerdame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblCardContent;
    private javax.swing.JLabel lblCardHeader;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtPassContraseña;
    private javax.swing.JTextField txtUsuariooEmail;
    // End of variables declaration//GEN-END:variables
}
