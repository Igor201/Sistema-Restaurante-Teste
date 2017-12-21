/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemarestaurante.model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Igor Sousa PC
 */
public class CenarioPedido {
    private Cliente joao;
    private Atendente maria;
    private Pedido pedido;
    private List<Produto> produtos;
    
    public Pedido fazerPedido(){
     joao = new Cliente("joao", "joao@gmail.com");
     joao = new Cliente("maria", "maria@gmail.com");
     
     produtos.add(new Produto("Biscoito", 100));
     produtos.add(new Produto("Coca", 10));
     produtos.add(new Produto("Agua", 2));
     produtos.add(new Produto("Suco", 20));
     
     pedido = new Pedido(maria, joao, produtos, "14:00");
     
     
     return pedido;
    }
   public Pedido pedidoSemProduto(){
     joao = new Cliente("joao", "joao@gmail.com");
     joao = new Cliente("maria", "maria@gmail.com");
       
     pedido = new Pedido(maria, joao, null, "19:00");
     
     return pedido;
    } 
}
