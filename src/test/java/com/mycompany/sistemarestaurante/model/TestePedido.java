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
    private CenarioPedido cenariop;
    
    @Before
    public void inicializa() {
        cenariop = new CenarioPedido();
    }
    
    @Ignore
    @Test
    public void descontoPedido() {
        cenariop.fazerPedido().getProdutos();
        
        /*Assert.assertEquals(85.00, cenariop.fazerPedido().desconto(), 0.0001);*/
    }
    
}
