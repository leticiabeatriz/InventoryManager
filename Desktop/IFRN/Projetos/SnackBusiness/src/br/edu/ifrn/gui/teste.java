/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.gui;

import br.edu.ifrn.persistencia.ProdutoDAO;
import java.util.Scanner;

/**
 *
 * @author letic
 */
public class teste {
    
    public static void main(String[] args){
        
        String codigo;
        Scanner teclado = new Scanner (System.in);
        
        ProdutoDAO produto = new ProdutoDAO();
        
        codigo = teclado.next();
        
        
        System.out.println(produto.verificarProduto(codigo));
        
        
        
    }
    
}
