/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

/**
 *
 * @author Cleber
 */
public class ProvaPainelDados extends javax.swing.JPanel {

    /**
     * Creates new form ProvaPainelDados
     */
    public ProvaPainelDados() {
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

        lblQntQuestoesD = new javax.swing.JLabel();
        lblTipoProvaD = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        lblIncidenciaPenalizacao = new javax.swing.JLabel();
        lblProporcao = new javax.swing.JLabel();
        lblPrecicaoPontuacao = new javax.swing.JLabel();
        lblTipoProva = new javax.swing.JLabel();
        lblPontuacaoMinima = new javax.swing.JLabel();
        lblQntQuestoes = new javax.swing.JLabel();
        lblPrecicaoPontuacaoD = new javax.swing.JLabel();
        lblProporcaoD = new javax.swing.JLabel();
        lblPontuacaoMaxima = new javax.swing.JLabel();
        lblPontuacaoMinimaD = new javax.swing.JLabel();
        lblPontuacaoMaximaD = new javax.swing.JLabel();
        lblIncidenciaPenalizacaoD = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Prova: "));
        setMinimumSize(new java.awt.Dimension(441, 114));

        lblQntQuestoesD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblQntQuestoesD.setText("MISC");
        lblQntQuestoesD.setName("qntQuestoes"); // NOI18N

        lblTipoProvaD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblTipoProvaD.setText("MISC");
        lblTipoProvaD.setName("tipoProva"); // NOI18N

        btnAlterar.setText("Alterar");

        lblIncidenciaPenalizacao.setText("Incidência de Penalização? ");

        lblProporcao.setText("Proporção: ");
        lblProporcao.setName("proporcaoPenalizacaoLabel"); // NOI18N

        lblPrecicaoPontuacao.setText("Precisão da Pontuação:");

        lblTipoProva.setText("Tipode de Prova:");

        lblPontuacaoMinima.setText("Pontuação Mínima:");

        lblQntQuestoes.setText("Quantidade de Questões:");

        lblPrecicaoPontuacaoD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblPrecicaoPontuacaoD.setText("3");
        lblPrecicaoPontuacaoD.setName("precisaoPontuacao"); // NOI18N

        lblProporcaoD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblProporcaoD.setText("0");
        lblProporcaoD.setName("proporcaoPenalizacaoValor"); // NOI18N

        lblPontuacaoMaxima.setText("Pontuação Máxima:");

        lblPontuacaoMinimaD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblPontuacaoMinimaD.setText("150");
        lblPontuacaoMinimaD.setName("pontuacaoMinima"); // NOI18N

        lblPontuacaoMaximaD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblPontuacaoMaximaD.setText("150");
        lblPontuacaoMaximaD.setName("pontuacaoMaxima"); // NOI18N

        lblIncidenciaPenalizacaoD.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblIncidenciaPenalizacaoD.setText("MISC");
        lblIncidenciaPenalizacaoD.setName("incidenciaPenalizacaoBoolean"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoProva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoProvaD)
                        .addGap(18, 18, 18)
                        .addComponent(lblQntQuestoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQntQuestoesD))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPontuacaoMinima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPontuacaoMinimaD))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPontuacaoMaxima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPontuacaoMaximaD))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPrecicaoPontuacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrecicaoPontuacaoD)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblIncidenciaPenalizacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIncidenciaPenalizacaoD))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProporcao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProporcaoD))
                            .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoProva)
                    .addComponent(lblQntQuestoes)
                    .addComponent(lblTipoProvaD)
                    .addComponent(lblQntQuestoesD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPontuacaoMinima)
                    .addComponent(lblPontuacaoMinimaD)
                    .addComponent(lblIncidenciaPenalizacao)
                    .addComponent(lblIncidenciaPenalizacaoD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPontuacaoMaxima)
                    .addComponent(lblPontuacaoMaximaD)
                    .addComponent(lblProporcao)
                    .addComponent(lblProporcaoD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPrecicaoPontuacao)
                        .addComponent(lblPrecicaoPontuacaoD))))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JLabel lblIncidenciaPenalizacao;
    private javax.swing.JLabel lblIncidenciaPenalizacaoD;
    private javax.swing.JLabel lblPontuacaoMaxima;
    private javax.swing.JLabel lblPontuacaoMaximaD;
    private javax.swing.JLabel lblPontuacaoMinima;
    private javax.swing.JLabel lblPontuacaoMinimaD;
    private javax.swing.JLabel lblPrecicaoPontuacao;
    private javax.swing.JLabel lblPrecicaoPontuacaoD;
    private javax.swing.JLabel lblProporcao;
    private javax.swing.JLabel lblProporcaoD;
    private javax.swing.JLabel lblQntQuestoes;
    private javax.swing.JLabel lblQntQuestoesD;
    private javax.swing.JLabel lblTipoProva;
    private javax.swing.JLabel lblTipoProvaD;
    // End of variables declaration//GEN-END:variables
}
