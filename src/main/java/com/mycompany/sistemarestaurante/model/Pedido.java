/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemarestaurante.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor Sousa PC
 */
public class Pedido {
    private Atendente atendente;
    private Cliente cliente;
    private List<Produto> produtos;
    private LocalDate horapedido;

    public Pedido(Atendente atendente, Cliente cliente, LocalDate horapedido) {
        this.atendente = atendente;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.horapedido = horapedido;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public LocalDate getHorapedido() {
        return horapedido;
    }
    
    
}
