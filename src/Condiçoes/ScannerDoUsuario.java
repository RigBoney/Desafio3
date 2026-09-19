package Condiçoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        //abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //coletar as informaçoes do usuario
        System.out.println("Digite seu nome de ninja: ");
        String nomeNinja = caixaDeTexto.nextLine();
        System.out.println("Digite a idade do seu ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();

        //qualificar o tipo do ninja de acordo com sua idade
        if (idadeNinja >= 0 && idadeNinja < 10) {
            System.out.println("O ninja " + nomeNinja + " ainda não tem nivel, pois tem apenas: " +  idadeNinja + " anos.");
        }else if (idadeNinja >= 10 && idadeNinja < 15) {
            System.out.println("O ninja " + nomeNinja + " está no nivel Gennin, pois tem apenas: " +  idadeNinja + " anos.");
        }else if (idadeNinja >= 15 && idadeNinja < 25) {
            System.out.println("O ninja " + nomeNinja + " está no nivel Chunin, pois tem: " + idadeNinja + " anos.");
        }else if (idadeNinja >= 25 && idadeNinja < 40) {
            System.out.println("O ninja " + nomeNinja + " está no nivel Jounin, pois já tem: " +  idadeNinja + " anos.");
        }else{
            System.out.println("Seu ninja " + nomeNinja + " já pode ser Hokage, pois tem: " + idadeNinja + " anos. Parabéns!");
        }

        //fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
