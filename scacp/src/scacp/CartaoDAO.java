/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scacp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Larissa
 */
public class CartaoDAO {

    public void inserirCartao(Cartao cartao, int IdProva) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("insert into cartoes (numero_inscricao, fk_id_prova, marcacao, nota) values (?,?,?,?)");
            st.setInt(1, cartao.getNumeroInscricao());
            st.setInt(2, cartao.getIdProva());
            st.setString(3, cartao.getMarcacao());
            st.setDouble(4, cartao.getNota());
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao criar o statement!");
        }
    }

    public void alterarCartaoMarcacao(Cartao cartao) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("update cartoes set marcacao='?' where  numero_inscricao = ? and fk_id_prova = ?");
            st.setString(1, cartao.getMarcacao());
            st.setInt(2, cartao.getNumeroInscricao());
            st.setInt(3, cartao.getIdProva());
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a marcação.");
        }
        alterarCartaoNota(cartao, cartao.getIdProva());
    }

    public void alterarCartaoNota(Cartao cartao, int IdProva) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("update cartoes set nota= ? where  numero_inscricao = ?");
            st.setDouble(1, cartao.getNota());
            st.setInt(2, cartao.getNumeroInscricao());
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar alterar a nota.");
        }
    }

    public Cartao buscarCartao(int numeroInscricao, int idProva) {
        Connection conexao = Conexao.getConexao();
        Cartao cartao = new Cartao();
        
        try {
            PreparedStatement st = conexao.prepareStatement("select * from cartoes where numero_inscricao = ? and fk_id_prova = ?");
            st.setInt(1, numeroInscricao);
            st.setInt(2, idProva);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cartao.setNumeroInscricao(rs.getInt("numero_inscricao"));
                cartao.setMarcacao(rs.getString("marcacao"));
                cartao.setNota(rs.getDouble("nota"));
            }
            st.execute();
            rs.close();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca");
        } finally{
        
        }
        return cartao;
    }

    public List<Cartao> buscarCartoes(int idProva) {
        List<Cartao> cartoes = new ArrayList<>();
        Cartao cartao = new Cartao();
        Connection conexao = Conexao.getConexao();

        try {
            PreparedStatement st = conexao.prepareStatement("select * from cartoes where fk_id_prova = ?");
            st.setInt(1, idProva);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                cartao.setNumeroInscricao(rs.getInt("numero_inscricao"));
                cartao.setMarcacao(rs.getString("marcacao"));
                cartao.setNota(rs.getDouble("nota"));
                cartoes.add(cartao);
            }
            st.execute();
            rs.close();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar realizar busca");
        }
        return cartoes;
    }

    public void excluirCartao(int numeroInscricao, int IdProva) {
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement st = conexao.prepareStatement("delete from cartoes where numero_inscricao = ?");
            st.setInt(1, numeroInscricao);
            st.execute();
            st.close();
            conexao.close();
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar deletar");
        }
    }
}
