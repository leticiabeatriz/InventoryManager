package br.edu.ifrn.persistencia;

import br.edu.ifrn.negocio.Produto;
import br.edu.ifrn.negocio.Venda;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VendaDAO extends Conexao{
    
    public void cadastrarVenda (String codigo, double valorTotal, double valorPago){

        String sql = "INSERT INTO vendas(id, data_hora, valorPago, valorTotal) VALUES (?,?,?,?)";
        PreparedStatement estado1;
        try {
            java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, codigo);
            estado1.setDate(2, date);
            estado1.setDouble(3, valorPago);
            estado1.setDouble(4, valorTotal);
            estado1.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar venda");
        } finally {
            fecharConexao();
        } 
    }
    
    public void cadastrarProdutoVenda(String codigoVenda, String codigoProduto, int produtoQtd){
        String sql = "INSERT INTO venda_produtos(id_venda, cod_produto, qtd_produto) VALUES (?,?,?)";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, codigoVenda);
            estado1.setString(2, codigoProduto);
            estado1.setInt(3, produtoQtd);
            estado1.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar os produtos da venda");
        } finally {
            fecharConexao();
        } 
    }
    
    public ArrayList<Venda> selecionarVendas(){
        String sql = "SELECT * FROM vendas";
        ArrayList<Venda> lista = new ArrayList<>();
        ResultSet resultado;
        conectar();
        try {
            resultado = estado.executeQuery(sql);
            while (resultado.next()){
                Venda venda  = new Venda();
                venda.setCodigo(resultado.getString("id"));
                venda.setValorTotal(resultado.getDouble("valorTotal"));
                venda.setData(resultado.getDate("data_hora"));
                lista.add(venda);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        return lista;
    }
    
    public ArrayList<Produto> selecionarProdutosVenda(String codigoVenda){
        ArrayList<Produto> lista = new ArrayList<>();
        String sql = "SELECT nome, codigo, qtd_produto, precoVenda FROM venda_produtos, produtos WHERE cod_produto = codigo AND id_venda = '"+codigoVenda+"'";
        try {
            conectar();
            ResultSet resultado = estado.executeQuery(sql);
            while(resultado.next()){
                Produto produto = new Produto();
                produto.setCodigo(resultado.getString("codigo"));
                produto.setNome(resultado.getString("nome"));
                produto.setPrecoVenda(resultado.getDouble("precoVenda"));
                produto.setQtdProduto(resultado.getInt("qtd_produto"));
                lista.add(produto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        } finally {
            fecharConexao();
        }
        return lista;
    }
}
