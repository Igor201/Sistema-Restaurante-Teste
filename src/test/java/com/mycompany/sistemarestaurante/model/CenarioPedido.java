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
    
    public Pedido CenarioPedido(){
     joao = new Cliente("joao", "joao@gmail.com");
     joao = new Cliente("maria", "maria@gmail.com");
     
     pedido.adiciona(new Produto("Biscoito", 50));
     pedido.adiciona(new Produto("Coca", 25));
     pedido.adiciona(new Produto("Agua", 15));
     pedido.adiciona(new Produto("Suco", 10));
     
     return pedido;
    }
   public Pedido pedidoSemProduto(){
     joao = new Cliente("joao", "joao@gmail.com");
     joao = new Cliente("maria", "maria@gmail.com");
       
     pedido = new Pedido(maria, joao, null, 10.00);
     
     return pedido;
    }

    public Cliente getJoao() {
        return joao;
    }

    public void setJoao(Cliente joao) {
        this.joao = joao;
    }

    public Atendente getMaria() {
        return maria;
    }

    public void setMaria(Atendente maria) {
        this.maria = maria;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
   
}
