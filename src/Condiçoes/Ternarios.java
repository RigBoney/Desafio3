package Condiçoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {

        //abrindo um scanner e perguntando ao usuario uma informação
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas missoes seu nija já participou? ");
        int missoes = leitor.nextInt();

        //Usando ternarios para reduzir o codigo e mostrar o resultado ao usuario
        String nivelDoNinja = (missoes >= 15) ? "Esse ninja está pronto para missoes fora." : "Este ninja ainda é muito novo para sair.";
        System.out.println(nivelDoNinja);

        leitor.close();
    }
}
