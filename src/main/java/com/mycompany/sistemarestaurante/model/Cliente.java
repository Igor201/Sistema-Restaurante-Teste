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
public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        if(email == null || email.isEmpty()) {
            throw new IllegalArgumentException("e-mail do Cliente inválido");
        }
        if(nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("nome do Cliente inválido");
        }
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
