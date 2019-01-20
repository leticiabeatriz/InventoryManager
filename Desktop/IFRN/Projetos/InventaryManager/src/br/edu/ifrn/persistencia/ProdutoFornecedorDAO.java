/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.persistencia;

import br.edu.ifrn.negocio.Fornecedor;
import br.edu.ifrn.negocio.Produto;
import br.edu.ifrn.negocio.ProdutoFornecedor;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author letic
 */
public class ProdutoFornecedorDAO extends Conexao {

    public void cadastrarProdutosFornecedor(String codigo, String cnpj, BigDecimal precoDeCompra) {
        String sql = "INSERT INTO produtosFornecedores(cnpjFornecedor, codigoProduto, precoCompra) VALUES(?,?,?)";
        PreparedStatement estado1;
        try {
            conectar();
            estado1 = conexao.prepareStatement(sql);
            estado1.setString(1, cnpj);
            estado1.setString(2, codigo);
            estado1.setBigDecimal(3, precoDeCompra);
            estado1.execute();
            JOptionPane.showMessageDialog(null, "O fornecedor foi adicionado");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(null, "Erro ao adicionar o fornecedor ao produto");
        } finally {
            fecharConexao();
        }
    }

    public ArrayList<ProdutoFornecedor> selecionarFornecedoresProduto(String codigo) {;
        ArrayList<ProdutoFornecedor> lista = new ArrayList<>();
        String sql = "SELECT nome, precoCompra FROM produtosFornecedores LEFT JOIN fornecedores ON cnpjFornecedor = cnpj WHERE codigoProduto = '" + codigo + "'";
        ResultSet resultado;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while (resultado.next()) {
                ProdutoFornecedor pf = new ProdutoFornecedor();
                Fornecedor f = new Fornecedor();
                f.setNome(resultado.getString("nome"));
                pf.setFornecedor(f);
                pf.setPrecoCompra(resultado.getBigDecimal("precoCompra"));
                lista.add(pf);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        return lista;
    }

    public String getFornecedoresJuntos(String codigo) {
        String fornecedores = "";
        int count = 0;
        String sql = "SELECT nome FROM produtosFornecedores LEFT JOIN fornecedores ON cnpjFornecedor = cnpj WHERE codigoProduto = '" + codigo + "'";
        ResultSet resultado = null;
        try {
            conectar();
            resultado = estado.executeQuery(sql);
            while (resultado.next()) {
                fornecedores += resultado.getString("nome") + ", ";
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelefoneFornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fecharConexao();
        }
        if (count >= 1) {
            fornecedores = fornecedores.substring(0, fornecedores.length() - 1);
            fornecedores = fornecedores.substring(0, fornecedores.length() - 1);
        }
        return fornecedores;
    }

}
