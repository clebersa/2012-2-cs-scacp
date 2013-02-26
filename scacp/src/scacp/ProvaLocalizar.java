/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author cleber
 */
public class ProvaLocalizar extends javax.swing.JDialog {
    private Prova prova;
    private List<Prova> provas;
    private ProvaDAO provaDAO;
    /**
     * Creates new form CartaoLocalizar
     */
    public ProvaLocalizar(java.awt.Frame parent, boolean modal, Prova prova) {
        super(parent, modal);
        this.prova = prova;
        provas = new ArrayList<>();
        provaDAO = new ProvaDAO();
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

        lblNumeroinscricao = new javax.swing.JLabel();
        txfNumeroInscricao = new javax.swing.JTextField();
        btnLocalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCartoes = new javax.swing.JList();
        btnAbrir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Localizar Cartão");
        setPreferredSize(new java.awt.Dimension(300, 400));

        lblNumeroinscricao.setText("Nome:");

        txfNumeroInscricao.setVisible(false);

        btnLocalizar.setText("Localizar");
        btnLocalizar.setVisible(false);
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        provas = provaDAO.buscarProvas();
        listCartoes.setModel(new javax.swing.AbstractListModel() {
            public int getSize() {
                return provas.size();
            }
            public Object getElementAt(int i) {
                return provas.get(i).getNome();
            }
        });
        listCartoes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listCartoes);

        btnAbrir.setText("Abrir");
        if(provas.isEmpty()){
            btnAbrir.setEnabled(false);
        }
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAbrir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumeroinscricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNumeroInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLocalizar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroinscricao)
                    .addComponent(txfNumeroInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizar))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        try{
            prova = provas.get(listCartoes.getSelectedIndex());
            prova = provaDAO.buscarProva(prova.getIdProva());
            dispose();
        }catch(ArrayIndexOutOfBoundsException excecao){
            JOptionPane.showMessageDialog(this, "Selecione uma prova!", "Erro", JOptionPane.OK_CANCEL_OPTION);
        }        
    }//GEN-LAST:event_btnAbrirActionPerformed

    public Prova getProva() {
        return prova;
    }

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumeroinscricao;
    private javax.swing.JList listCartoes;
    private javax.swing.JTextField txfNumeroInscricao;
    // End of variables declaration//GEN-END:variables
}
