/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemarestaurante.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Igor Sousa PC
 */
public class TestePedido {
    private Pedido pedido; 
    
    @Before
    public void inicializa() {
        pedido = new Pedido();
    }
    
    @Test
    public void comissaoPedido() {
        double valorPedido = 100.00;
        Assert.assertEquals(101.00,pedido.comissao(valorPedido), 0.0001);
    }
    
    @Test
    public void descontoPedido() {
        double valorPedido = 100.00;
        Assert.assertEquals(85.00,pedido.desconto(valorPedido), 0.0001);
    }
    
}
