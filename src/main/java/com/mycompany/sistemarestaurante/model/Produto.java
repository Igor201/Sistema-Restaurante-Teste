/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemarestaurante.model;

/**
 *
 * @author Igor Sousa PC
 */
public class Produto {
    private String nome;
    private double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public boolean produtoValido(){
        if(nome == null || valor <= 0){
            return false;
        }
        return true;
    }
    
    public boolean produtoInvalido(){
        if(nome == null || valor <= 0){
            return true;
        }
        return false;
    } 
}
