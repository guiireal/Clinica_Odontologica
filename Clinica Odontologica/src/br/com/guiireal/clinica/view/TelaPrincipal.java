package br.com.guiireal.clinica.view;

import javax.swing.JOptionPane;

/**
 * TELA PRINCIPAL
 * 
 * @author Guilherme
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jifBemVindo = new javax.swing.JInternalFrame();
        jpnInterno = new javax.swing.JPanel();
        btnCadastroEstagiario = new javax.swing.JButton();
        btnCadastroPaciente = new javax.swing.JButton();
        btnCadastroDentista = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFundoInterno = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnArquivo = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jmnCadastros = new javax.swing.JMenu();
        jmiDentistas = new javax.swing.JMenuItem();
        jmiPacientes = new javax.swing.JMenuItem();
        jmiEstagiarios = new javax.swing.JMenuItem();
        jmiSystemUsers = new javax.swing.JMenuItem();
        jmnRelatorios = new javax.swing.JMenu();
        jmnFerramentas = new javax.swing.JMenu();
        jmiTelaBemVindo = new javax.swing.JMenuItem();
        jmnSobre = new javax.swing.JMenu();
        jmiContato = new javax.swing.JMenuItem();
        jmiVersaoSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Interno");
        setResizable(false);
        getContentPane().setLayout(null);

        jifBemVindo.setResizable(true);
        jifBemVindo.setTitle("Bem Vindo ! (Acesso Rápido)");
        jifBemVindo.setVisible(true);
        jifBemVindo.getContentPane().setLayout(null);

        jpnInterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpnInterno.setLayout(null);

        btnCadastroEstagiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/estagiario.png"))); // NOI18N
        btnCadastroEstagiario.setToolTipText("Estagiários");
        jpnInterno.add(btnCadastroEstagiario);
        btnCadastroEstagiario.setBounds(170, 40, 70, 60);

        btnCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/paciente.png"))); // NOI18N
        btnCadastroPaciente.setToolTipText("Pacientes");
        jpnInterno.add(btnCadastroPaciente);
        btnCadastroPaciente.setBounds(90, 40, 70, 60);

        btnCadastroDentista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/dentista.png"))); // NOI18N
        btnCadastroDentista.setToolTipText("Dentistas");
        btnCadastroDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirFormularioCadastroDentista(evt);
            }
        });
        jpnInterno.add(btnCadastroDentista);
        btnCadastroDentista.setBounds(10, 40, 70, 60);

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/Agenda.png"))); // NOI18N
        btnAgenda.setToolTipText("Agendamento");
        jpnInterno.add(btnAgenda);
        btnAgenda.setBounds(10, 140, 70, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Cadastros - ");
        jpnInterno.add(jLabel1);
        jLabel1.setBounds(10, 10, 90, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Agenda -");
        jpnInterno.add(jLabel2);
        jLabel2.setBounds(10, 110, 90, 20);

        lblFundoInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/fundodentista.png"))); // NOI18N
        jpnInterno.add(lblFundoInterno);
        lblFundoInterno.setBounds(2, -2, 520, 220);

        jifBemVindo.getContentPane().add(jpnInterno);
        jpnInterno.setBounds(0, 40, 520, 210);

        lblInfo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(0, 0, 204));
        lblInfo.setText("ACESSE RAPIDAMENTE AS FERRAMENTAS DE:");
        jifBemVindo.getContentPane().add(lblInfo);
        lblInfo.setBounds(110, 10, 280, 20);

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/exit.png"))); // NOI18N
        btnFechar.setToolTipText("Fechar a tela de boas vindas");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTelaBoasVindas(evt);
            }
        });
        jifBemVindo.getContentPane().add(btnFechar);
        btnFechar.setBounds(470, 0, 40, 40);

        getContentPane().add(jifBemVindo);
        jifBemVindo.setBounds(30, 30, 530, 280);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/guiireal/resource/images/fundotelas.png"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 600, 330);

        jmnArquivo.setText("Arquivo");

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharSistema(evt);
            }
        });
        jmnArquivo.add(jmiSair);

        jMenuBar1.add(jmnArquivo);

        jmnCadastros.setText("Cadastros");

        jmiDentistas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jmiDentistas.setText("Dentistas");
        jmiDentistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirFormularioCadastroDentista(evt);
            }
        });
        jmnCadastros.add(jmiDentistas);

        jmiPacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jmiPacientes.setText("Pacientes");
        jmnCadastros.add(jmiPacientes);

        jmiEstagiarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jmiEstagiarios.setText("Estagiários");
        jmnCadastros.add(jmiEstagiarios);

        jmiSystemUsers.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jmiSystemUsers.setText("System Users");
        jmnCadastros.add(jmiSystemUsers);

        jMenuBar1.add(jmnCadastros);

        jmnRelatorios.setText("Relatórios");
        jMenuBar1.add(jmnRelatorios);

        jmnFerramentas.setText("Ferramentas");

        jmiTelaBemVindo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jmiTelaBemVindo.setText("Tela de Boas Vindas (Quick access)");
        jmiTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirTelaBoasVindas(evt);
            }
        });
        jmnFerramentas.add(jmiTelaBemVindo);

        jMenuBar1.add(jmnFerramentas);

        jmnSobre.setText("Sobre");

        jmiContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmiContato.setText("Contato");
        jmiContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contato(evt);
            }
        });
        jmnSobre.add(jmiContato);

        jmiVersaoSistema.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jmiVersaoSistema.setText("Versão do Sistema");
        jmiVersaoSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versaoSistema(evt);
            }
        });
        jmnSobre.add(jmiVersaoSistema);

        jMenuBar1.add(jmnSobre);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(602, 382));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecharTelaBoasVindas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTelaBoasVindas
        jifBemVindo.dispose();
    }//GEN-LAST:event_fecharTelaBoasVindas

    private void fecharSistema(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharSistema
        System.exit(0);
    }//GEN-LAST:event_fecharSistema

    private void abrirTelaBoasVindas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirTelaBoasVindas
        jifBemVindo.show();
    }//GEN-LAST:event_abrirTelaBoasVindas

    private void contato(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contato
        JOptionPane.showMessageDialog(null, "Desenvolvido por Guilherme França (R) - Todos os direitos reservados\n"
                                      + "Telefone: (11) 95805-2138", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_contato

    private void versaoSistema(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_versaoSistema
        JOptionPane.showMessageDialog(null, "versão 1.0.0 beta", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_versaoSistema

    private void abrirFormularioCadastroDentista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirFormularioCadastroDentista
        FormularioCadastroDentista formulario = new FormularioCadastroDentista();
        formulario.setVisible(true);
    }//GEN-LAST:event_abrirFormularioCadastroDentista

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnCadastroDentista;
    private javax.swing.JButton btnCadastroEstagiario;
    private javax.swing.JButton btnCadastroPaciente;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JInternalFrame jifBemVindo;
    private javax.swing.JMenuItem jmiContato;
    private javax.swing.JMenuItem jmiDentistas;
    private javax.swing.JMenuItem jmiEstagiarios;
    private javax.swing.JMenuItem jmiPacientes;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiSystemUsers;
    private javax.swing.JMenuItem jmiTelaBemVindo;
    private javax.swing.JMenuItem jmiVersaoSistema;
    private javax.swing.JMenu jmnArquivo;
    private javax.swing.JMenu jmnCadastros;
    private javax.swing.JMenu jmnFerramentas;
    private javax.swing.JMenu jmnRelatorios;
    private javax.swing.JMenu jmnSobre;
    private javax.swing.JPanel jpnInterno;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblFundoInterno;
    private javax.swing.JLabel lblInfo;
    // End of variables declaration//GEN-END:variables
}
