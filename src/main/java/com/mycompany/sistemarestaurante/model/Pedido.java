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
    private double valor;
    
    public Pedido() {
    }

    public Pedido(Atendente atendente, Cliente cliente, List<Produto> produtos, double valor) {
        this.atendente = atendente;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
    
    public boolean pedidoValido(){
        if(atendente == null || cliente == null){
            return false;
        }
        if(produtos == null || valor <= 0){
            return false;
        }
        return true;
    } 
    
     public boolean pedidoInvalido(){
        if(atendente == null || cliente == null){
            return true;
        }
        if(produtos == null || valor <= 0){
            return true;
        }
        return false;
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
    
}
