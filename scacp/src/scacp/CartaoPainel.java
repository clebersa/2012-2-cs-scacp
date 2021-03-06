/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.awt.Dimension;


/**
 *
 * @author cleber
 */
public class CartaoPainel extends javax.swing.JPanel {
    private int quantidadeQuestoes;
    private QuestoesPainel questoesBloco1, questoesBloco2;
    private Cartao cartao;
    /**
     * Creates new form CartaoPainel
     */
    public CartaoPainel(Cartao cartao, int quantidadeQuestoes, TipoProva tipoProva) {
        this.cartao = cartao;
        this.quantidadeQuestoes = quantidadeQuestoes;
        questoesBloco1 = new QuestoesPainel(cartao.getNumeroInscricao(), 01, quantidadeQuestoes/2, tipoProva);
        questoesBloco2 = new QuestoesPainel(cartao.getNumeroInscricao(), (quantidadeQuestoes/2)+1, quantidadeQuestoes, tipoProva);
        add(questoesBloco1);
        add(questoesBloco2);
        initComponents();
        try{
            if(!cartao.getMarcacao().equals("")){
                setMarcacao(cartao.getMarcacao());
            }
        }catch(NullPointerException excecao){
        }
        setPreferredSize(new Dimension(questoesBloco1.getPreferredSize().width, questoesBloco1.getPreferredSize().height*2));
    }
    
    private String getMarcacao(){
        String marcacao;
        marcacao = questoesBloco1.getMarcacao();
        marcacao +=questoesBloco2.getMarcacao();
        return marcacao;
    }
    
    private void setMarcacao(String marcacao){
        String marcacaoBloco1, marcacaoBloco2;
        marcacaoBloco1 = marcacao.substring(0, quantidadeQuestoes/2);
        marcacaoBloco2 = marcacao.substring(quantidadeQuestoes/2, quantidadeQuestoes);
        questoesBloco1.setMarcacao(marcacaoBloco1);
        questoesBloco2.setMarcacao(marcacaoBloco2);
        questoesBloco1.repaint();
        questoesBloco2.repaint();
    }

    public Cartao getCartao(){
        cartao.setMarcacao(getMarcacao());
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
        setMarcacao(cartao.getMarcacao());
    }

    @Override
    public void setEnabled(boolean enabled) {
        questoesBloco1.setEnabled(enabled);
        questoesBloco2.setEnabled(enabled);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(300, 300));
        setLayout(new java.awt.GridLayout(2, 1));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
