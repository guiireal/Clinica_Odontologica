package br.com.guiireal.clinica.view;

/**
 * TELA DE CADASTRO DE DENTISTAS
 * 
 * @author Guilherme
 */
public class FormularioCadastroDentista extends javax.swing.JFrame {

    public FormularioCadastroDentista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCRD2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Dentistas");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("Nome completo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 10, 114, 29);

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtNome);
        txtNome.setBounds(380, 60, 280, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("Especialidade:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 60, 96, 29);

        txtCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtCPF);
        txtCPF.setBounds(50, 60, 200, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("CRD:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 35, 29);

        txtCRD2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtCRD2);
        txtCRD2.setBounds(50, 10, 117, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("CPF:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 60, 32, 29);

        txtNome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtNome1);
        txtNome1.setBounds(320, 10, 430, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 770, 300);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE DENTISTAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 4, 700, 30);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/fundolarge.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 794, 361);

        setSize(new java.awt.Dimension(810, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCRD2;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNome1;
    // End of variables declaration//GEN-END:variables
}
