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
    
    public Pedido cenarioPedido(){
     joao = new Cliente("joao", "joao@gmail.com");
     joao = new Cliente("maria", "maria@gmail.com");
     
     produtos.add(new Produto("Biscoito", 50));
     produtos.add(new Produto("Coca", 25));
     produtos.add(new Produto("Agua", 15));
     produtos.add(new Produto("Suco", 10));
     
     pedido = new Pedido(maria, joao, produtos);
     
     
     return pedido;
    }
   public Pedido pedidoSemProduto(){
     joao = new Cliente("joao", "joao@gmail.com");
     joao = new Cliente("maria", "maria@gmail.com");
       
     pedido = new Pedido(maria, joao, null);
     
     return pedido;
    } 
}
