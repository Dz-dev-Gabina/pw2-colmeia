// Davih Zampieri Costa e Gabriel Pereira Rodrigues de Araújo

package br.com.etechoracio.model;

import br.com.etechoracio.interfaces.Coletor;
import br.com.etechoracio.interfaces.Defensor;

public class Operaria extends Abelha implements Defensor, Coletor {
    private int horasVoo;

    public Operaria(String nome, int idade, int horasVoo) {
        super(nome, idade);
        this.horasVoo = horasVoo;
    }

    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Atividade: Coletando néctar/pólen ou protegendo a colmeia");
    }

    @Override
    public double calcularConsumoDiario() {
        return 10.0 + (horasVoo * 2.0);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println(" | Tipo: Operária | Horas de Voo: " + horasVoo);
    }

    public void coletarRecursos() {
        System.out.println(getNome() + ": Coletando néctar nas flores.");
    }

    public void defenderColmeia() {
        System.out.println(getNome() + ": Defendendo a entrada da colmeia.");
    }
}