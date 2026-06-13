package br.com.etechoracio.test;

import br.com.etechoracio.model.Operaria;
import br.com.etechoracio.model.Rainha;
import br.com.etechoracio.model.Zangao;

public class SistemaColmeia {
    static void main() {
        System.out.println("===== Sistema da Colmeia =====");
        System.out.println();

        Operaria abelha1 = new Operaria("Mel", 15, 4);
        Rainha rainha = new Rainha("Elizabeth", 45, 1500);
        Zangao zangao = new Zangao("Buzz", 20, 2);

        double consumoTotal = 0;

        abelha1.exibirInformacoes();
        abelha1.executarAtividadePrincipal();

        double consumoOperaria = abelha1.calcularConsumoDiario();
        System.out.println("Consumo desta abelha: " + consumoOperaria + " mg");
        System.out.println("----------------------------------------");

        consumoTotal = consumoTotal + consumoOperaria;

        rainha.exibirInformacoes();
        rainha.executarAtividadePrincipal();

        double consumoRainha = rainha.calcularConsumoDiario();
        System.out.println("Consumo desta abelha: " + consumoRainha + " mg");
        System.out.println("----------------------------------------");

        consumoTotal = consumoTotal + consumoRainha;

        zangao.exibirInformacoes();
        zangao.executarAtividadePrincipal();

        double consumoZangao = zangao.calcularConsumoDiario();
        System.out.println("Consumo desta abelha: " + consumoZangao + " mg");
        System.out.println("----------------------------------------");

        consumoTotal = consumoTotal + consumoZangao;

        System.out.println("Consumo Total do dia: " + consumoTotal + " mg");
    }
}
