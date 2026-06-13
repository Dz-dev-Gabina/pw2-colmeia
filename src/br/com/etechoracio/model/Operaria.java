package br.com.etechoracio.model;

public class Operaria extends Abelha {
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
}
