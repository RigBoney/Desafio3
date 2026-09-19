package nivelBasico;

import java.util.Scanner;
public class Desafio2 {
    public static void main(String[] args) {

        //fazer um menuinterativo para receber o nome de varios ninjas e listar eles
        // ou encerrrar o programa de acordo com a vontade do usuario

        //definindo o valor das variaveis iniciais e o Array que será usado pors nomes
        int opcao = 0;
        String[] ninjas = new String[5];
        int totalDeNinjas = 0;
        Scanner sc = new Scanner(System.in);

        //enquanto a opcao escolhida nao for a 3, o menu sempre aparecerá por conta do while
        while (opcao != 3) {
            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            //abrindo o scanner para pegar as respostas

            opcao = sc.nextInt();
            //limpando o scanner pois mudamos a tipagem do que ele vai ler
            sc.nextLine();

            //comecando o codigo que será executado de acordo com o case escolhido
            switch (opcao) {
                case 1:
                    if (totalDeNinjas < ninjas.length) {
                        System.out.println();
                        System.out.println("Nome do ninja: ");
                        ninjas[totalDeNinjas] = sc.nextLine();
                        System.out.println("Cadastro feito com sucesso.");
                        System.out.println();
                        totalDeNinjas++;
                    } else {
                        System.out.println("------------");
                        System.out.println("Lista cheia.");
                        System.out.println("------------");
                        System.out.println();
                    }
                    break;
                case 2:
                    //caso um espaço do objeto de memoria do array ainda esteja vazio, será substituido o "null" por algo melhor visualmente

                    System.out.println("Ninjas cadastrados com sucesso: ");
                    System.out.println();
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null) {
                            System.out.println("vazio.");
                        } else {
                            System.out.println("Nome do ninja: " + ninjas[i] + ".");
                        }
                    }
                    System.out.println();
                    break;
                //encerrando o menu

                case 3:
                    System.out.println();
                    System.out.println("Obrigado por usar nosso sistema.");
                    break;
                default:
                    System.out.println("Resposta invalida.");
            }
        }
        sc.close();
    }
}
