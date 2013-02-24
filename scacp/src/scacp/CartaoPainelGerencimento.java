/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author cleber
 */
public class CartaoPainelGerencimento extends javax.swing.JPanel {
    int numeroInscricao;
    Prova prova;
    /**
     * Creates new form CartaoPainelGerencimento
     */
    public CartaoPainelGerencimento(Prova prova, int numeroInscricao) {
        this.prova = prova;
        this.numeroInscricao = numeroInscricao;
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

        scrpnlQuestoesCartao = new javax.swing.JScrollPane();
        pnlQuestoesCartao = new javax.swing.JPanel();
        pnlBotoesCartao = new javax.swing.JPanel();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLocalizar = new javax.swing.JButton();
        btnCorrigirCartoes = new javax.swing.JButton();

        scrpnlQuestoesCartao.setMinimumSize(new java.awt.Dimension(100, 100));
        scrpnlQuestoesCartao.setPreferredSize(new java.awt.Dimension(400, 400));
        scrpnlQuestoesCartao.getHorizontalScrollBar().setUnitIncrement(10);
        scrpnlQuestoesCartao.getVerticalScrollBar().setUnitIncrement(10);

        pnlQuestoesCartao.setBackground(new java.awt.Color(218, 95, 110));
        pnlQuestoesCartao.setMinimumSize(new java.awt.Dimension(200, 200));
        pnlQuestoesCartao.setPreferredSize(new java.awt.Dimension(500, 450));
        CartaoPainel cartaoPainel = new CartaoPainel(numeroInscricao, prova.getQuantidadeQuestoes(), prova.getTipoProva());
        JFrame janela = new JFrame();
        cartaoPainel.revalidate();
        cartaoPainel.repaint();
        System.out.println("Cartao: " + cartaoPainel.getSize());
        janela.setLayout(new FlowLayout());
        janela.add(cartaoPainel);
        janela.setVisible(true);
        janela.pack();
        janela.revalidate();
        janela.repaint();
        System.out.println("Janela: " + janela.getSize());
        pnlQuestoesCartao.add(cartaoPainel);
        pnlQuestoesCartao.revalidate();
        pnlQuestoesCartao.repaint();
        System.out.println("Cartao: " + pnlQuestoesCartao.getSize());
        pnlQuestoesCartao.setLayout(new javax.swing.BoxLayout(pnlQuestoesCartao, javax.swing.BoxLayout.Y_AXIS));
        scrpnlQuestoesCartao.setViewportView(pnlQuestoesCartao);

        pnlBotoesCartao.setBackground(new java.awt.Color(255, 209, 164));
        pnlBotoesCartao.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções de Cartão"));

        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLocalizar.setText("Localizar");
        btnLocalizar.setEnabled(false);
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        btnCorrigirCartoes.setText("Corrigir Cartões");
        btnCorrigirCartoes.setEnabled(false);
        btnCorrigirCartoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigirCartoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesCartaoLayout = new javax.swing.GroupLayout(pnlBotoesCartao);
        pnlBotoesCartao.setLayout(pnlBotoesCartaoLayout);
        pnlBotoesCartaoLayout.setHorizontalGroup(
            pnlBotoesCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesCartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLocalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCorrigirCartoes)
                .addContainerGap())
        );
        pnlBotoesCartaoLayout.setVerticalGroup(
            pnlBotoesCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnIncluir)
                .addComponent(btnAlterar)
                .addComponent(btnExcluir)
                .addComponent(btnLocalizar)
                .addComponent(btnCorrigirCartoes))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrpnlQuestoesCartao, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(pnlBotoesCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrpnlQuestoesCartao, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotoesCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        //itmInserirCartaoActionPerformed(evt);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //itmAlterarCartaoActionPerformed(evt);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //itmExcluirActionPerformed(evt);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        //itmLocalizarActionPerformed(evt);
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnCorrigirCartoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigirCartoesActionPerformed
        //menuCorrigirActionPerformed(evt);
    }//GEN-LAST:event_btnCorrigirCartoesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCorrigirCartoes;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JPanel pnlBotoesCartao;
    private javax.swing.JPanel pnlQuestoesCartao;
    private javax.swing.JScrollPane scrpnlQuestoesCartao;
    // End of variables declaration//GEN-END:variables
}