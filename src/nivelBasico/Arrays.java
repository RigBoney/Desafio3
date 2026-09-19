package nivelBasico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        //array de palavras
        String[] ninja = new String[10];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Shikamaru Nara";
        ninja[2] = "Sasuke Uchiha";

        //array de numeros
        int[] idade = {1, 2, 3};
        System.out.println(idade[0]);

        //array de nomes pré definidos
        String[] nome = {"yuri", "david", "isadora"};
        System.out.println(nome[0]);

        //alternativa para o array, pois nao precisa pré definir seu tamanho, basta ir adicionando
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("yuri");

        for (int contador = 0; contador < 3; contador++) {
            System.out.println(nome[contador]);
        }

        for (int contador = 0; contador < 3; contador++) {
            Scanner input = new Scanner(System.in);
            System.out.println("qual seu nome? ");
            String nome1 = input.nextLine();
            nome[contador] = nome1;
        }
        for (int contador = 0; contador < 3; contador++) {
            System.out.println(nome[contador]);
        }

        int[] numeros = {1, 2, 3};
        numeros = new int[]{4, 5, 6};
        System.out.println(numeros[0]);

        int numero = 2;

    }
}