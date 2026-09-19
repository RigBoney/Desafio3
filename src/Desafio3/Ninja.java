package Desafio3;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("----- Informaçôes do ninja -----");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade);
        System.out.println("Status: " + statusMissao);
        System.out.println("---------------------------");


    }
}
