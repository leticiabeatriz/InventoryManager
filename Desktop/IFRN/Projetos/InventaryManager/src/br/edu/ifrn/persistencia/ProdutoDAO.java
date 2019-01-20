package br.edu.ifrn.persistencia;

import br.edu.ifrn.negocio.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO extends Conexao {

    public void cadastrarProduto(String codigo, String nome) {
        String sql = "INSERT INTO produtos(codigo, nome) VALUES (?,?)";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, codigo);
            estado1.setString(2, nome);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Produto cadastrado");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
    }

    public int verificarCodigo(String codigo) {
        int verificador = 0;
        String sql = "SELECT codigo FROM produtos WHERE codigo = '" + codigo + "'";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while (resultado.next()) {
                verificador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        return verificador;
    }
    
    public ArrayList<Produto> selecionarProdutos(){
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produtos ORDER BY nome";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while(resultado.next()){
                Produto produto = new Produto();
                produto.setNome(resultado.getString("nome"));
                produto.setCodigo(resultado.getString("codigo"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        return lista;
    }
    
    public ArrayList<Produto> selecionarProdutos(String rest){
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produtos WHERE codigo LIKE '%"+rest+"%' OR nome LIKE '%"+rest+"%' ORDER BY nome";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while(resultado.next()){
                Produto produto = new Produto();
                produto.setNome(resultado.getString("nome"));
                produto.setCodigo(resultado.getString("codigo"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        } finally {
            fecharConexao();
        }
        return lista;
    }

}
