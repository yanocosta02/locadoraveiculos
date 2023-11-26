/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apresentacao;

import Controladores.ControladorCliente;
import Controladores.Locadora;

/**
 *
 * @author Yan
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */

    Locadora locadora = Locadora.getInstance();
    ControladorCliente controladorcliente = ControladorCliente.getInstance();

    public TelaInicial() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMareafunc = new javax.swing.JMenu();
        jMcadfunc = new javax.swing.JMenuItem();
        jMlistarfunc = new javax.swing.JMenuItem();
        jMclientes = new javax.swing.JMenu();
        jMcadastrarcliente = new javax.swing.JMenuItem();
        jMlistarclientes = new javax.swing.JMenuItem();
        jMalugueis = new javax.swing.JMenu();
        jMnovoaluguel = new javax.swing.JMenuItem();
        jMlistaralugueis = new javax.swing.JMenuItem();
        jMpagamento = new javax.swing.JMenuItem();
        jMveiculos = new javax.swing.JMenu();
        jmiCadastroAuto = new javax.swing.JMenuItem();
        jmiBici = new javax.swing.JMenuItem();
        jmiListarVeic = new javax.swing.JMenuItem();
        jMsair = new javax.swing.JMenu();
        jMencerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(120, 120, 120));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(321, 50));
        jMenuBar1.setRequestFocusEnabled(false);

        jMareafunc.setText("Área do Funcionário");
        jMareafunc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMcadfunc.setText("Cadastrar Funcionário");
        jMcadfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcadfuncActionPerformed(evt);
            }
        });
        jMareafunc.add(jMcadfunc);

        jMlistarfunc.setText("Listar Funcionários");
        jMlistarfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMlistarfuncActionPerformed(evt);
            }
        });
        jMareafunc.add(jMlistarfunc);

        jMenuBar1.add(jMareafunc);

        jMclientes.setText("Clientes");
        jMclientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMcadastrarcliente.setText("Cadastrar Cliente");
        jMcadastrarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcadastrarclienteActionPerformed(evt);
            }
        });
        jMclientes.add(jMcadastrarcliente);

        jMlistarclientes.setText("Listar Clientes");
        jMlistarclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMlistarclientesActionPerformed(evt);
            }
        });
        jMclientes.add(jMlistarclientes);

        jMenuBar1.add(jMclientes);

        jMalugueis.setText("Aluguéis");
        jMalugueis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMnovoaluguel.setText("Novo Aluguel");
        jMalugueis.add(jMnovoaluguel);

        jMlistaralugueis.setText("Listar Aluguéis");
        jMalugueis.add(jMlistaralugueis);

        jMpagamento.setText("Pagamento");
        jMalugueis.add(jMpagamento);

        jMenuBar1.add(jMalugueis);

        jMveiculos.setText("Veículos");
        jMveiculos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jmiCadastroAuto.setText("Cadastrar Automóvel");
        jMveiculos.add(jmiCadastroAuto);

        jmiBici.setText("Cadastrar Bicicleta");
        jmiBici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBiciActionPerformed(evt);
            }
        });
        jMveiculos.add(jmiBici);

        jmiListarVeic.setText("Listar Veículos");
        jMveiculos.add(jmiListarVeic);

        jMenuBar1.add(jMveiculos);

        jMsair.setText("Sair");
        jMsair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMencerrar.setText("Encerrar Sessão");
        jMencerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMencerrarActionPerformed(evt);
            }
        });
        jMsair.add(jMencerrar);

        jMenuBar1.add(jMsair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMcadfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcadfuncActionPerformed
        // TODO add your handling code here:
        DlgCadastroFuncionario telaCadastro = new DlgCadastroFuncionario(null, true, locadora);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_jMcadfuncActionPerformed

    private void jMlistarclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMlistarclientesActionPerformed
        // TODO add your handling code here:
        DlgMostraClientes dlg = new DlgMostraClientes(null, true, controladorcliente);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMlistarclientesActionPerformed

    private void jMcadastrarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcadastrarclienteActionPerformed
        // TODO add your handling code here:
        DlgCadastroCliente telaCadastroCli = new DlgCadastroCliente(null, true, controladorcliente);
        telaCadastroCli.setVisible(true);
    }//GEN-LAST:event_jMcadastrarclienteActionPerformed

    private void jMencerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMencerrarActionPerformed
        // TODO add your handling code here:
        TelaLogin telaLogin = new TelaLogin(locadora);
        telaLogin.setVisible(true);   
        this.dispose();     
    }//GEN-LAST:event_jMencerrarActionPerformed

    private void jMlistarfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMlistarfuncActionPerformed
        // TODO add your handling code here:
        DlgMostraFuncionarios dlg = new DlgMostraFuncionarios(null, true, locadora);
        dlg.setVisible(true);
    }//GEN-LAST:event_jMlistarfuncActionPerformed

    private void jmiBiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBiciActionPerformed
        // TODO add your handling code here:
        DlgCadastroBicicleta dlg = new DlgCadastroBicicleta(null, true, locadora);
        dlg.setVisible(true);       
    }//GEN-LAST:event_jmiBiciActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMalugueis;
    private javax.swing.JMenu jMareafunc;
    private javax.swing.JMenuItem jMcadastrarcliente;
    private javax.swing.JMenuItem jMcadfunc;
    private javax.swing.JMenu jMclientes;
    private javax.swing.JMenuItem jMencerrar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMlistaralugueis;
    private javax.swing.JMenuItem jMlistarclientes;
    private javax.swing.JMenuItem jMlistarfunc;
    private javax.swing.JMenuItem jMnovoaluguel;
    private javax.swing.JMenuItem jMpagamento;
    private javax.swing.JMenu jMsair;
    private javax.swing.JMenu jMveiculos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmiBici;
    private javax.swing.JMenuItem jmiCadastroAuto;
    private javax.swing.JMenuItem jmiListarVeic;
    // End of variables declaration//GEN-END:variables
}
