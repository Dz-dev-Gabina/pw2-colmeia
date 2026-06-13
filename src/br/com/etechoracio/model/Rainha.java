package br.com.etechoracio.model;

public class Rainha extends Abelha {
    private int ovosPorDia;

    public Rainha(String nome, int idade, int ovosPorDia) {
        super(nome, idade);
        this.ovosPorDia = ovosPorDia;
    }

    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Atividade: Reprodução da colônia (colocando ovos)");
    }

    @Override
    public double calcularConsumoDiario() {
        return 20.0 + (ovosPorDia * 0.01);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println(" | Tipo: Rainha | Ovos por Dia: " + ovosPorDia);
    }
}
