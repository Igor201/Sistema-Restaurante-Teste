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
    
    public Pedido() {
    }

    public Pedido(Atendente atendente, Cliente cliente, List<Produto> produtos) {
        this.atendente = atendente;
        this.cliente = cliente;
        this.produtos = produtos;
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

    public void adiciona(Produto produto) {
        this.produtos.add(produto);
    }
    
    public double desconto( double valor){
        if(valor >=100){
        double desconto;
        desconto = valor - valor * 0.15;
        return desconto;
        }
        return valor;
    }
    
    public double comissao(double valor){
        double comissao;
        comissao = valor + valor * 0.01;
        return comissao;
    }
    
    public double fecharPedido(List<Produto> prod){
    double conta = 0;
    for(int i=0; i < produtos.size();i++){
    conta += produtos.get(i).getValor();
    }
    return conta;   
    }
    
}
