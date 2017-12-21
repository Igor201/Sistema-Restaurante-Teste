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
public class Atendente {
    private String nome;
    private int numpedidos;
    private double comisao;

    public Atendente(String nome, int numpedidos, double comisao) {
        this.nome = nome;
        this.numpedidos = numpedidos;
        this.comisao = comisao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumpedidos() {
        return numpedidos;
    }

    public void setNumpedidos(int numpedidos) {
        this.numpedidos = numpedidos;
    }

    public double getComisao() {
        return comisao;
    }

    public void setComisao(double comisao) {
        this.comisao = comisao;
    }
    
    
}
