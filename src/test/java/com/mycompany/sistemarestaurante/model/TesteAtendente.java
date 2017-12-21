/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemarestaurante.model;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Igor Sousa PC
 */
public class TesteAtendente {
    @Rule
    public ExpectedException excecao = ExpectedException.none();
    
    @Test
    public void emailNaoNulo() {
        excecao.expect(IllegalArgumentException.class);
        new Cliente(null, "sivirina@gmail.com");
    }

    @Test
    public void emailNaoVazio() {
        excecao.expect(IllegalArgumentException.class);
        new Cliente("", "Joaozinha@gmail.com");
    }

    @Test
    public void nomeNaoNulo() {
        excecao.expect(IllegalArgumentException.class);
        new Cliente("Severina", null);
    }

    @Test
    public void nomeNaoVazio() {
        excecao.expect(IllegalArgumentException.class);
        new Cliente("João", "");
    }
}
