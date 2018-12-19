package br.edu.ifrn.persistencia;

import br.edu.ifrn.negocio.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO extends Conexao{
    
    public ArrayList<Produto> selecionarProduto(){
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produtos ORDER BY nome";
        try {
            conectar();
            ResultSet resultado = estado.executeQuery(sql);
            while(resultado.next()){
                Produto produto = new Produto();
                produto.setCodigo(resultado.getString("codigo"));
                produto.setNome(resultado.getString("nome"));
                produto.setPrecoCompra(resultado.getDouble("precoCompra"));
                produto.setPrecoVenda(resultado.getDouble("precoVenda"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        } finally {
            fecharConexao();
        }
        return lista;
    }
    
    public ArrayList<Produto> selecionarProduto(String text){
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produtos WHERE nome LIKE '%"+text+"%' OR codigo = '"+text+"' ORDER BY nome";
        try {
            conectar();
            ResultSet resultado = estado.executeQuery(sql);
            while(resultado.next()){
                Produto produto = new Produto();
                produto.setCodigo(resultado.getString("codigo"));
                produto.setNome(resultado.getString("nome"));
                produto.setPrecoCompra(resultado.getDouble("precoCompra"));
                produto.setPrecoVenda(resultado.getDouble("precoVenda"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        } finally {
            fecharConexao();
        }
        return lista;
    }
    
    public void deletarProduto(String codigo){
        String sql = "DELETE FROM produtos WHERE codigo = ?";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, codigo);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Produto excluído!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar produto");
        } finally {
            fecharConexao();
        }
    }
    
    public void cadastrarProduto(String codigo, String nome, double precoCompra, double precoVenda){
        String sql = "INSERT INTO produtos(codigo, nome, precoCompra, precoVenda) VALUES(?,?,?,?)";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, codigo);
            estado1.setString(2, nome);
            estado1.setDouble(3, precoCompra);
            estado1.setDouble(4, precoVenda);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Produto cadastrado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto");
        } finally {
            fecharConexao();
        }
    }
    
    public void updateProduto(String codigo, String nome, double precoCompra, double precoVenda){
        String sql = "UPDATE produtos SET nome = ?, precoCompra = ?, precoVenda = ? WHERE codigo = ?";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, nome);
            estado1.setDouble(2, precoCompra);
            estado1.setDouble(3, precoVenda);
            estado1.setString(4, codigo);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "Produto Atualizado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produto");
        } finally {
            fecharConexao();
        }
    }
        
    public Produto getProduto(String codigo){
        Produto produto = new Produto();
        String sql = "SELECT * FROM produtos WHERE codigo ="+codigo;
        conectar();
        ResultSet resultado;
        try {
            resultado = estado.executeQuery(sql);
            while(resultado.next()){
                produto.setCodigo(resultado.getString("codigo"));
                produto.setNome(resultado.getString("nome"));
                produto.setPrecoCompra(resultado.getDouble("precoCompra"));
                produto.setPrecoVenda(resultado.getDouble("precoVenda"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }
        return produto;
    }
    
    public boolean verificarProduto(String codigo){
        boolean verificador = false;
        String sql = "SELECT * FROM produtos WHERE codigo = '"+codigo+"'";
        ResultSet resultado;
        conectar();
        try {
            resultado = estado.executeQuery(sql);
            if (!resultado.next()) {
                verificador = true;
            } else {
                verificador = false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao achar produto");
        } finally {
            fecharConexao();
        }
        return verificador;
    }
    
    
}
