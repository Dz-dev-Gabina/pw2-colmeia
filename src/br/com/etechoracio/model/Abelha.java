package br.com.etechoracio.model;

import java.sql.SQLOutput;

public abstract class Abelha {
    private String nome;
    private int idade;

    public Abelha(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public abstract void executarAtividadePrincipal();
    public abstract double calcularConsumoDiario();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " dias");
    }
}
