package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        System.out.println("Bem-vindo ao Processo Seletivo!");

        imprimirCandidatos();

    }

 static void imprimirCandidatos() {

        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Lucas"};

        System.out.println("Lista de Candidatos:");
        for (int indice = 0; indice < candidatos.length; indice++) {
          
            System.out.println("O candidato de nº"+ (indice + 1) + " é: " + candidatos[indice]);
        }
    }


    static void selecaoCandidato() {

        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Lucas"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000; // Salário base para análise, pode ser alterado conforme necessário

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {

            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato: " + candidato + ", Salário Pretendido: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato " + candidato + " aprovado!");
                candidatosSelecionados++;
            }
            candidatosAtual++;

        }

    }

    static double valorPretendido() {

        return ThreadLocalRandom.current().nextDouble(1800, 2200); // Gera um salário pretendido aleatório entre 1500 e 3000
    }

    
   // ==========================================================
    
    static void analisaCandidato(double salarioPretendido) {

        double salarioBase = 2000; // Salário base para análise, pode ser alterado conforme necessário
        // salarioPretendido = 2000; // Exemplo de salário pretendido, pode ser alterado conforme necessário

        if (salarioPretendido <= salarioBase) {
            System.out.println("Candidato aprovado!");
        } else {
            System.out.println("Candidato reprovado.");
        }
    }
}
