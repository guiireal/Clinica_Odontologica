package br.com.guiireal.clinica.view;

/**
 * TELA DE LOGIN
 * 
 * @author Guilherme
 */
public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        psfSenha = new javax.swing.JPasswordField();
        lblInfo3 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblInfo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        lblFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Odontológica");
        getContentPane().setLayout(null);
        getContentPane().add(psfSenha);
        psfSenha.setBounds(120, 160, 190, 40);

        lblInfo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInfo3.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo3.setText("Senha:");
        getContentPane().add(lblInfo3);
        lblInfo3.setBounds(40, 160, 80, 40);

        lblInfo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInfo2.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo2.setText("Usuário:");
        getContentPane().add(lblInfo2);
        lblInfo2.setBounds(30, 90, 80, 40);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(120, 90, 190, 40);

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setText("ACESSO AO SISTEMA");
        getContentPane().add(lblInfo);
        lblInfo.setBounds(110, 0, 260, 50);

        btnSair.setText("SAIR");
        getContentPane().add(btnSair);
        btnSair.setBounds(340, 150, 100, 50);

        btnEntrar.setText("ENTRAR");
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(340, 90, 100, 50);

        lblFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/fundologin.png"))); // NOI18N
        getContentPane().add(lblFundoLogin);
        lblFundoLogin.setBounds(0, 0, 500, 220);

        setSize(new java.awt.Dimension(516, 260));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblFundoLogin;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JPasswordField psfSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
