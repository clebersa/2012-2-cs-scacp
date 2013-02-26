/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.awt.Dimension;
import java.util.HashMap;

/**
 *
 * @author cleber
 */
public class QuestoesPainel extends javax.swing.JPanel {
    private int inicioQuestoes, fimQuestoes, numeroInscricao;
    private HashMap<Integer, QuestaoFormulario> questoes;
    private TipoProva tipoProva;
    /**
     * Creates new form FormularioRespostas
     */
    public QuestoesPainel(int numeroInscricao, int inicioQuestoes, int fimQuestoes, TipoProva tipoProva) {
        int largura;
        int altura;
        
        this.numeroInscricao = numeroInscricao;
        this.inicioQuestoes = inicioQuestoes;
        this.fimQuestoes = fimQuestoes;
        this.tipoProva = tipoProva;
        questoes = new HashMap<>();
        initComponents();
        
        largura = 35*(fimQuestoes-inicioQuestoes+1) + 2 * 80;
        if(largura < 350){
            largura = 350;
        }
        if(tipoProva == TipoProva.MULTIPLA_ESCOLHA){
            if(numeroInscricao == 9999990){
                altura = 18 + 220;
            }else{
                altura = 18 + 240;
            }
        }else{
            if(numeroInscricao == 9999990){
                altura = 18 + 130;
            }else{
                altura = 18+ 150;
            }
        }
        altura += 12;
        setPreferredSize(new Dimension(largura, altura));        
    }
    
    public String getMarcacao(){
        int contador;
        String marcacao = "";
        for(contador = inicioQuestoes; contador <= fimQuestoes; contador++){
            marcacao += questoes.get(contador).getAlternativa();
        }
        return marcacao;
    }
    
    public void setMarcacao(String marcacao){
        int contador, questao;
        for(contador = inicioQuestoes, questao = 0; contador <= fimQuestoes; contador++, questao++){
            questoes.get(contador).setAlternativa(String.format("%c", marcacao.charAt(questao)));
        }
    }

    @Override
    public void setEnabled(boolean enabled) {
        for(QuestaoFormulario questaoFormulario : questoes.values()){
            questaoFormulario.setEnabled(enabled);
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotuloRespostas = new javax.swing.JLabel();
        pnlLateralDireito = new javax.swing.JPanel();
        pnlLateralEsquerdo = new javax.swing.JPanel();
        pnlQuestoes = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(0, 252));
        setLayout(new java.awt.BorderLayout());

        rotuloRespostas.setBackground(new java.awt.Color(156, 156, 156));
        rotuloRespostas.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        rotuloRespostas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rotuloRespostas.setText(String.format("Questões de %02d a %02d - Inscrição: %07d", inicioQuestoes, fimQuestoes, numeroInscricao));
        add(rotuloRespostas, java.awt.BorderLayout.PAGE_START);

        if(tipoProva == TipoProva.MULTIPLA_ESCOLHA){
            pnlLateralDireito = new scacp.QuestaoMEPainelLateral(numeroInscricao);
        }else{
            pnlLateralDireito = new scacp.QuestaoVFPainelLateral(numeroInscricao);
        }

        add(pnlLateralDireito, java.awt.BorderLayout.LINE_END);

        if(tipoProva == TipoProva.MULTIPLA_ESCOLHA){
            pnlLateralEsquerdo = new scacp.QuestaoMEPainelLateral(numeroInscricao);
        }else{
            pnlLateralEsquerdo = new scacp.QuestaoVFPainelLateral(numeroInscricao);
        }

        add(pnlLateralEsquerdo, java.awt.BorderLayout.LINE_START);

        pnlQuestoes.setAlignmentX(0.0F);
        pnlQuestoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlQuestoes.setLayout(new javax.swing.BoxLayout(pnlQuestoes, javax.swing.BoxLayout.LINE_AXIS));

        pnlQuestoes.setBackground(new java.awt.Color(166, 166, 166));
        if(tipoProva == TipoProva.MULTIPLA_ESCOLHA){
            for(int cont = inicioQuestoes; cont <= fimQuestoes; cont++){
                questoes.put(cont, new scacp.QuestaoMEFormulario(cont, numeroInscricao));
                pnlQuestoes.add(questoes.get(cont));
            }
        }else{
            for(int cont = inicioQuestoes; cont <= fimQuestoes; cont++){
                questoes.put(cont, new scacp.QuestaoVFFormulario(cont, numeroInscricao));
                pnlQuestoes.add(questoes.get(cont));
            }
        }

        add(pnlQuestoes, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlLateralDireito;
    private javax.swing.JPanel pnlLateralEsquerdo;
    private javax.swing.JPanel pnlQuestoes;
    private javax.swing.JLabel rotuloRespostas;
    // End of variables declaration//GEN-END:variables
}
