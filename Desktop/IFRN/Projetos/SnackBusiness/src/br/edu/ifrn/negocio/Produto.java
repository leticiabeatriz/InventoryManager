package br.edu.ifrn.negocio;

public class Produto {
    
    private String codigo;
    private String nome;
    private double precoCompra;
    private double precoVenda;
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPrecoCompra() {
        return precoCompra;
    }
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
        
}
