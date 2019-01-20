package br.edu.ifrn.negocio;

import java.math.BigDecimal;

public class ProdutoFornecedor {
    
    Produto produto;
    Fornecedor fornecedor;
    BigDecimal precoCompra;
    
    public BigDecimal getPrecoCompra(){
        return precoCompra;
    }
    
    public void setPrecoCompra(BigDecimal precoCompra){
        this.precoCompra = precoCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
