package br.com.guiireal.clinica.view;

import br.com.guiireal.clinica.controller.DentistaDAO;

/**
 * TELA DE CADASTRO DE DENTISTAS
 * 
 * @author Guilherme
 */
public class FormularioCadastroDentista extends javax.swing.JFrame {

    DentistaDAO dentista = new DentistaDAO();
    
    public FormularioCadastroDentista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCRO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JTextField();
        jcbEspecialidades = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDentistas = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
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
        jLabel2.setBounds(190, 50, 120, 29);

        txtCPF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtCPF);
        txtCPF.setBounds(490, 10, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("CRO:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 10, 40, 29);

        txtCRO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtCRO);
        txtCRO.setBounds(320, 10, 117, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("CPF:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 10, 32, 29);

        txtNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtNome1);
        txtNome1.setBounds(320, 50, 410, 30);

        jcbEspecialidades.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbEspecialidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Clínico", "Cirurgião", "Odontopediatra", "Fonoaudiólogo" }));
        jPanel1.add(jcbEspecialidades);
        jcbEspecialidades.setBounds(480, 90, 120, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu"));
        jPanel2.setLayout(null);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        jPanel2.add(btnSalvar);
        btnSalvar.setBounds(30, 60, 100, 30);

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovo.setText("Novo");
        jPanel2.add(btnNovo);
        btnNovo.setBounds(30, 20, 100, 30);

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        jPanel2.add(btnExcluir);
        btnExcluir.setBounds(30, 140, 100, 30);

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        jPanel2.add(btnEditar);
        btnEditar.setBounds(30, 100, 100, 30);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCadastroDentista(evt);
            }
        });
        jPanel2.add(btnCancelar);
        btnCancelar.setBounds(30, 180, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 10, 160, 230);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Especialidade:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(370, 90, 100, 29);

        tblDentistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblDentistas);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(190, 190, 540, 190);

        txtPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtPesquisar);
        txtPesquisar.setBounds(420, 150, 170, 30);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/procurar.png"))); // NOI18N
        btnPesquisar.setToolTipText("Pesquisar");
        jPanel1.add(btnPesquisar);
        btnPesquisar.setBounds(370, 150, 40, 33);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 40, 740, 390);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE DENTISTAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 4, 700, 30);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/fundolarge.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 760, 440);

        setSize(new java.awt.Dimension(777, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarCadastroDentista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCadastroDentista
        this.dentista.desconecta();
        this.dispose();
    }//GEN-LAST:event_cancelarCadastroDentista

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcbEspecialidades;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JTable tblDentistas;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCRO;
    private javax.swing.JTextField txtNome1;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
