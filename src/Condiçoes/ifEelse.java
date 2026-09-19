package Condiçoes;

import java.util.Arrays;
import java.util.Scanner;

public class ifEelse {
    public static void main(String[] args) {
        //variaveis para criar um programa onde o usuario fornece os dados e o programa retorna sua condição

        String nome;
        int idade;
        boolean hokage = false;
        int missoes;
        String rank;
        //abrimos um scanner para pegar as informaçoes de cada variavel e ao final delas, fechamos o scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do ninja: ");
        nome = scanner.nextLine();
        System.out.println("Digite a idade do ninja: ");
        idade = scanner.nextInt();
        System.out.println("Digite o numero de missoes dele: ");
        missoes = scanner.nextInt();
        scanner.close();
        //começamos a verificação das condiçôes para ver em qual condiçao o usuario se encaixa

        if (missoes < 10 || idade < 10) {
        System.out.println(nome + " ainda não tem rank");
        }else if (missoes >= 10 && missoes <20 && idade >= 15) {
            rank = "gennin";
            System.out.println(nome + " é um " + rank + "!");
        }else if (missoes >= 20 && missoes <35 &&  idade >= 15) {
            rank = "chunin";
            System.out.println(nome + " é um " + rank + "!");
        }else if (missoes >= 35 && missoes <50 &&  idade >= 20) {
            rank = "jounin";
            System.out.println(nome + " é um " + rank + "!");
        }else {
            hokage = true;
            rank = "hokage";
            System.out.println("Parabéns " + nome + "! Já é um grande " + rank + "!");
        }
        }

    }
