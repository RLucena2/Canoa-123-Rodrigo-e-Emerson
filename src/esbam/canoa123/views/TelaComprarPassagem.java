/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package esbam.canoa123.views;

import esbam.canoa123.controller.DAO.CidadesDAO;
import esbam.canoa123.controller.DAO.PassageirosDAO;
import esbam.canoa123.controller.DAO.PassagemDAO;
import esbam.canoa123.controller.PassageirosController;
import esbam.canoa123.model.Passageiros;
import esbam.canoa123.model.Passagens;
import esbam.canoa123.model.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author User
 */
public class TelaComprarPassagem extends javax.swing.JFrame {

    /**
     * Creates new form TelaComprarPassagem
     */
    public TelaComprarPassagem() {
        initComponents();
        TelaLogin lg = new TelaLogin();
        PassageirosDAO pasdao = new PassageirosDAO();
        Passagens pas = new Passagens();
        restaurarDadosComboBox();
        restaurarDadosComboBoxDestino();
        //  int idPassageiro = pas.getPassageiro().getId();
        // lblNomePassageiro.setText(lg.nomeusuario);
        // lblidPassageiro.setText(Integer.toString(idPassageiro));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxOrigem = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxDestino = new javax.swing.JComboBox<>();
        btnComprar = new javax.swing.JButton();
        lblNomeLogado1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBuscaCpf = new javax.swing.JTextField();
        btnBuscaCpf = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblNomePas = new javax.swing.JLabel();
        lblIdPas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAdm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comprar Passagem");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bem-Vindo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 70, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("COMPRA DE PASSAGENS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Destino:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 70, 30));

        cbxOrigem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbxOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        cbxOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrigemActionPerformed(evt);
            }
        });
        getContentPane().add(cbxOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Origem:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, 30));

        cbxDestino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        getContentPane().add(cbxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 150, -1));

        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        lblNomeLogado1.setMaximumSize(new java.awt.Dimension(59, 16));
        lblNomeLogado1.setMinimumSize(new java.awt.Dimension(59, 16));
        getContentPane().add(lblNomeLogado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 120, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 70, 30));

        txtBuscaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscaCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 160, -1));

        btnBuscaCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscaCpf.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscaCpf.setText("Procurar");
        btnBuscaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCpfActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 70, 30));
        getContentPane().add(lblNomePas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, 20));
        getContentPane().add(lblIdPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo 123canoa.jpeg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

        jMenu1.setText("Administrador");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuAdm.setText("Tela Principal");
        menuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmActionPerformed(evt);
            }
        });
        jMenu1.add(menuAdm);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmActionPerformed
        // TODO add your handling code here:
        Tela_Principal tp = new Tela_Principal();
        tp.setVisible(true);
    }//GEN-LAST:event_menuAdmActionPerformed

    private void cbxOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOrigemActionPerformed

    private void btnBuscaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCpfActionPerformed

        String buscaCpf = txtBuscaCpf.getText();
        PassageirosController pascontroller = new PassageirosController();
        try {
            ArrayList<Passageiros> passageiros = pascontroller.listarPassageirosCpf(buscaCpf);
            passageiros.forEach((Passageiros passageiro) -> {

                lblNomePas.setText(passageiro.getNome());
                lblIdPas.setText(Integer.toString(passageiro.getId()));
                // JOptionPane.showMessageDialog(null, passageiro.getNome());
                //  JOptionPane.showMessageDialog(null, passageiro.getId());
            });

        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnBuscaCpfActionPerformed

    Vector<Integer> id_localidade = new Vector<Integer>();
    Vector<Integer> id_destino = new Vector<Integer>();

    public void restaurarDadosComboBox() {
        try {
            //  PassagemDAO pasdao = new PassagemDAO();
            CidadesDAO cidDao = new CidadesDAO();
            PassagemDAO pasdao = new PassagemDAO();
            ResultSet rs = pasdao.listarOrigem();
            while (rs.next()) {

                // inserir combobox origem
                id_localidade.addElement(rs.getInt(1));
                cbxOrigem.addItem(rs.getString(2));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO CARREGAR ESTADO");
        }

    }
    
    
    
    public void restaurarDadosComboBoxDestino() {
        try {
            //  PassagemDAO pasdao = new PassagemDAO();
            CidadesDAO cidDao = new CidadesDAO();
            PassagemDAO pasdao = new PassagemDAO();
            ResultSet rs = pasdao.listarDestino();
            while (rs.next()) {

                // inserir combobox origem
                id_localidade.addElement(rs.getInt(1));
                cbxDestino.addItem(rs.getString(2));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO CARREGAR ESTADO");
        }

    }
    
    
    
    


    private void txtBuscaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaCpfActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
      //  PassagemDAO pasdao = new PassagemDAO();
      //  pasdao.cadastrarPassagem(passagem);
        
        
    }//GEN-LAST:event_btnComprarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void usuariologado() {
        // TelaLogin lg = new TelaLogin();
        //  lblNomeLogado.setText("JOSE MARIA");
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
            java.util.logging.Logger.getLogger(TelaComprarPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComprarPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComprarPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComprarPassagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComprarPassagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaCpf;
    private javax.swing.JButton btnComprar;
    private javax.swing.JComboBox<String> cbxDestino;
    private javax.swing.JComboBox<String> cbxOrigem;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblIdPas;
    private javax.swing.JLabel lblNomeLogado1;
    private javax.swing.JLabel lblNomePas;
    private javax.swing.JMenuItem menuAdm;
    private javax.swing.JTextField txtBuscaCpf;
    // End of variables declaration//GEN-END:variables
}
