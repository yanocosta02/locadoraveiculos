/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Apresentacao;
import Controladores.Locadora;
import Controladores.ControladorCliente;
import Controladores.ControladorAluguel;
import javax.swing.JOptionPane;
import Modelo.Aluguel;
import Modelo.Cliente;
import Modelo.Seguro;
import Modelo.Veiculo;
import Modelo.Pagamento;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;



/**
 *
 * @author Iris
 */
public class DlgCadastroPagamento extends javax.swing.JDialog {

    /**
     * Creates new form DlgCadastroBicicleta
     */
    
   ControladorCliente controladorCliente = ControladorCliente.getInstance();
   ControladorAluguel controladorAluguel = ControladorAluguel.getInstance();
   Locadora locadora = Locadora.getInstance();
   MaskFormatter mfdata;
   Seguro novoseguro = new Seguro();
   
   public DlgCadastroPagamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
   
    DlgCadastroPagamento(java.awt.Frame parent, boolean modal, ControladorAluguel controladorAluguel) {
        super(parent, modal);
                try {
            mfdata = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            System.out.println("Ocorreu um erro na criação da máscara");
        }
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

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jBbuscar = new javax.swing.JButton();
        jTcpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTidAluguel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jBcadastrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jForma = new javax.swing.JFormattedTextField(mfdata);
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jTcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcpfActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF do cliente:");

        jLabel9.setText("ID do aluguel:");

        jBcadastrar.setText("Exibir Total");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });

        jLabel10.setText("Forma:");

        jForma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBcadastrar)
                            .addComponent(jBbuscar)
                            .addComponent(jTcpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTidAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(jForma, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTidAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jBcadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Cadastrar Pagamento");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        int cpf = Integer.parseInt(jTcpf.getText());
        String forma = jForma.getText();
        ArrayList<Aluguel>  alugueisEncontrados = controladorAluguel.buscaAluguel(cpf);
        
        if (!controladorCliente.existeCliente(cpf)) {
            JOptionPane.showMessageDialog(null, "Cliente não existe!");
            //DlgCadastroCliente telaCadastroCli = new DlgCadastroCliente(null, true, controladorCliente);
            //telaCadastroCli.setVisible(true);
            
        } else {
            if (!alugueisEncontrados.isEmpty()) {
                DlgBuscaAlugueis mostraAlugueis = new DlgBuscaAlugueis(null, true, controladorAluguel, alugueisEncontrados);
                mostraAlugueis.setVisible(true);                                       
                //JOptionPane.showMessageDialog(null, "Encontrou");
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não possui nenhuma reserva.");
            }
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcpfActionPerformed

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
        // TODO add your handling code here:
        int cpf = Integer.parseInt(jTcpf.getText());
        Cliente clienteLocador;
        Veiculo veiculoLocado;
        int idAluguel= Integer.parseInt(jTidAluguel.getText());
        String forma = jForma.getText();
        
        double valor = controladorAluguel.calculaValor(idAluguel);
        double multa = controladorAluguel.calculaMulta(idAluguel, valor);
        double seguro = controladorAluguel.calculaSeguro(idAluguel);
        double total = controladorAluguel.calculaTotal(valor, multa, seguro);
        
        Pagamento novoPagamento = new Pagamento(forma, valor, total, multa, seguro);
        
        JOptionPane.showMessageDialog(null, "");
        
        
        //adicionarPagamento(Pagamento pag)
    }//GEN-LAST:event_jBcadastrarActionPerformed

    private void jFormaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormaFocusLost

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
            java.util.logging.Logger.getLogger(DlgCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCadastroPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgCadastroPagamento dialog = new DlgCadastroPagamento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JFormattedTextField jForma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTidAluguel;
    // End of variables declaration//GEN-END:variables
}
