package Condiçoes;

import java.util.Scanner;

import static java.util.Scanner.*;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        //objetivo: pedir ao usuario para escolher entre algo e retornar algo de acordo com sua escolha
        Scanner CaixaTexto = new Scanner(System.in);

        //mostrar as opcoes ao usuario
        System.out.println("Escolha dentre um dos personagens: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Shikamaru Nara");
        System.out.println("3 - Rock lee");

        //pedir que o usuario escolha um
        int escolhaDoUsuario = CaixaTexto.nextInt();

        // resposta do usuario
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu Naruto Uzumaki, o mais chatinho que ta tendo.");
                break;
            case 2:
                System.out.println("O usuario escolheu Shikamaru Nara, do grego, estrategit.");
                break;
            case 3:
                System.out.println("O usuario escolheu Rock lee, o Goat!");
                break;
            default:
                System.out.println("Ops! Digite apenas um dos numeros citados acima.");
        }

        CaixaTexto.close();

    }
}
