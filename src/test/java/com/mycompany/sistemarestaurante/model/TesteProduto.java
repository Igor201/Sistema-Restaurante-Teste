/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemarestaurante.model;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Igor Sousa PC
 */
public class TesteProduto {
    
        
    @Test
    public void produtoValido() {
        Produto produto = new Produto("Bolo", 10.00);
        Assert.assertTrue(produto.produtoValido());
    }
    
    @Test
    public void produtoInvalido() {
        Produto produto = new Produto(null, 10.00);
        Assert.assertTrue(produto.produtoInvalido());
    }
}
