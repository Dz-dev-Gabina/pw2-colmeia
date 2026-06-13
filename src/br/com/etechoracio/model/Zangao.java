package br.com.etechoracio.model;

public class Zangao extends Abelha{
    private int voosAcasalamento;

    public Zangao(String nome, int idade, int voosAcasalamento) {
        super(nome, idade);
        this.voosAcasalamento = voosAcasalamento;
    }

    @Override
    public void executarAtividadePrincipal() {
        System.out.println("Atividade: Participando do processo reprodutivo (voos de acasalamento).");
    }

    @Override
    public double calcularConsumoDiario() {
        return 15.0 + (voosAcasalamento * 3.0);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println(" | Tipo: Zangão | Voos de Acasalamento: " + voosAcasalamento);
    }
}
