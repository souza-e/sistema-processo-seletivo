package candidatura;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        System.out.println("Bem-vindo ao Processo Seletivo!");

        analisaCandidato(2000); // Chamada do método com o salário pretendido
        analisaCandidato(2500); // Chamada do método com outro salário pretendido
        analisaCandidato(1500); // Chamada do método com outro salário pretendido
    }

    static void analisaCandidato (double salarioPretendido) {
       
        double salarioBase = 2000; // Salário base para análise, pode ser alterado conforme necessário
       // salarioPretendido = 2000; // Exemplo de salário pretendido, pode ser alterado conforme necessário
     
        if (salarioPretendido <= salarioBase) {
            System.out.println("Candidato aprovado!");
        } else {
            System.out.println("Candidato reprovado.");
        }
    }
}
