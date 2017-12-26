/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemarestaurante.model;


import java.util.ArrayList;
import java.util.List;
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
    public void pedidoValido() {
        Atendente atendente = (new Atendente("Clara", "clara@gmail.com"));
        Cliente cliente = (new Cliente("zora", "zora@gmail.com"));
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Refrigerante", 8.00));
        produtos.add(new Produto("Refri", 5.00));
        Pedido ped = new Pedido(atendente, cliente, produtos, 13.00, true);
       Assert.assertTrue(ped.pedidoValido());
    }
    
    @Test
    public void pedidoInvalido() {
        
       Assert.assertTrue(pedido.pedidoInvalido());
    }
    
    @Test
    public void comissaoPedido() {
        pedido.setValor(100.00);
        double valorPedido = pedido.getValor();
        Assert.assertEquals(101.00,pedido.comissao(valorPedido), 0.0001);
    }
    
    @Test
    public void descontoPedido() {
        pedido.setValor(100.00);
        double valorPedido = pedido.getValor();
        Assert.assertEquals(85.00,pedido.desconto(valorPedido), 0.0001);
    }
    
    
    @Test
    public void formaPagamentoAvista(){
        pedido.setValor(100.00);
        pedido.setPagAvista(true);
        pedido.pagamentoAvista();
        Assert.assertEquals(100.00,pedido.getValor(), 0.0001);
    }
    
     @Test
    public void formaPagamentoNaoAvista(){
        pedido.setValor(100.00);
        pedido.setPagAvista(false);
        pedido.pagamentoAvista();
        Assert.assertEquals(105.00,pedido.getValor(), 0.0001);
    }
}
