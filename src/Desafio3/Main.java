package Desafio3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resposta = 0;
        ArrayList<Ninja> listaDeNinjas = new ArrayList<Ninja>();
        boolean continuarMenu = true;

        while (continuarMenu) {

            limparTela();

            System.out.println();
            System.out.println("      ----- MENU DE GERENCIAMENTO DE NINJAS -----     ");
            System.out.println();
            System.out.println("Olá, Usuário. Por favor, selecione uma das seguintes opções abaixo:");
            System.out.println();
            System.out.println("1 - Exibir ninjas do catálogo.");
            System.out.println("2 - Adicionar ninja ao catálogo.");
            System.out.println("3 - Atualizar habilidade especial.");
            System.out.println("4 - Remover ninja do catálogo.");
            System.out.println();
            System.out.print("Opção escolhida: ");
            resposta = input.nextInt();
            input.nextLine();

            switch (resposta) {
                case 1:
                    if (listaDeNinjas.isEmpty()) {
                        System.out.println("Ainda não há nenhum ninja cadastrado.");
                        System.out.println();
                    } else {
                        for (Ninja ninja : listaDeNinjas) {
                            ninja.mostrarInformacoes();
                            System.out.println();
                        }
                    }
                    break;

                case 2:
                    System.out.println("Insira as informações do ninja.");
                    System.out.println();
                    System.out.print("nome: ");
                    String nome = input.nextLine();
                    boolean idadeValida = false;
                    int idade = 0;
                    while (!idadeValida) {
                        try {
                            System.out.print("idade: ");
                            idade = input.nextInt();
                            input.nextLine();
                            idadeValida = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Isso não é um número válido, por favor, tente novamente.");
                            input.nextLine();
                        }
                    }

                    System.out.print("missao: ");
                    String missao = input.nextLine();
                    System.out.print("nivel de dificuldade: ");
                    String nivelDeDificuldade = input.nextLine();
                    System.out.print("status: ");
                    String statusMissao = input.nextLine();
                    System.out.println();
                    System.out.println("Que tipo de ninja é esse?");
                    System.out.println("1 - Comum.");
                    System.out.println("2 - Uchiha.");
                    System.out.println("3 - Hyuga.");
                    System.out.println("Opção escolhida: ");
                    int tipoDeNinja = input.nextInt();
                    input.nextLine();

                    switch (tipoDeNinja) {
                        case 2:
                            System.out.println("Qual a habilidade especial dele? ");
                            String habilidadeEspecialUchiha = input.nextLine();
                            Uchiha newUchiha = new Uchiha();
                            newUchiha.nome = nome;
                            newUchiha.idade = idade;
                            newUchiha.missao = missao;
                            newUchiha.nivelDeDificuldade = nivelDeDificuldade;
                            newUchiha.statusMissao = statusMissao;
                            newUchiha.habilidadeEspecialUchiha = habilidadeEspecialUchiha;
                            System.out.println();

                            listaDeNinjas.add(newUchiha);
                            break;

                        case 3:
                            System.out.println("Qual a habilidade especial dele? ");
                            String habilidadeEspecialHyuga = input.nextLine();
                            Hyuga newHyuga = new Hyuga();
                            newHyuga.nome = nome;
                            newHyuga.idade = idade;
                            newHyuga.missao = missao;
                            newHyuga.nivelDeDificuldade = nivelDeDificuldade;
                            newHyuga.statusMissao = statusMissao;
                            newHyuga.habilidadeEspecialHyuga = habilidadeEspecialHyuga;
                            System.out.println();

                            listaDeNinjas.add(newHyuga);
                            break;

                        default:
                            Ninja newNinja = new Ninja();
                            newNinja.nome = nome;
                            newNinja.idade = idade;
                            newNinja.missao = missao;
                            newNinja.nivelDeDificuldade = nivelDeDificuldade;
                            newNinja.statusMissao = statusMissao;
                            System.out.println();

                            listaDeNinjas.add(newNinja);
                            break;
                    }
                    System.out.println("Ninja adicionado com sucesso!");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Nome do ninja que você deseja atualizar as habilidades: ");
                    String buscarNinja = input.nextLine();

                    boolean encontrouNinja = false;
                    for (Ninja ninja : listaDeNinjas) {
                        if (ninja.nome.equals(buscarNinja)) {
                            encontrouNinja = true;

                            if (ninja instanceof Uchiha) {
                                System.out.println("Informe a nova habilidade: ");
                                String novaHabilidade = input.nextLine();

                                Uchiha habilidadeUchiha = (Uchiha) ninja;
                                habilidadeUchiha.habilidadeEspecialUchiha = novaHabilidade;
                                System.out.println("Habilidade atualizada com sucesso!");
                            } else if (ninja instanceof Hyuga) {
                                System.out.println("Informe a nova habilidade: ");
                                String novaHabilidade = input.nextLine();

                                Hyuga habilidadeHyuga = (Hyuga) ninja;
                                habilidadeHyuga.habilidadeEspecialHyuga = novaHabilidade;
                                System.out.println("Habilidade atualizada com sucesso!");
                            } else {
                                System.out.println("Esse ninja não pode ter uma habilidade especial, pois não é de um clã.");
                            }
                            break;
                        }
                    }
                    if (!encontrouNinja) {
                        System.out.println("Ninja não encontrado no catálogo.");
                    }
                    break;

                case 4:
                    System.out.println("Que ninja você deseja remover do catálogo?");
                    String buscarCat = input.nextLine();
                    boolean encontrouRemocao = false;
                    for (Ninja ninja : listaDeNinjas) {
                        if (ninja.nome.equals(buscarCat)) {
                            listaDeNinjas.remove(ninja);
                            System.out.println("Ninja removido com sucesso!");
                            encontrouRemocao = true;
                            break;
                        }
                    }
                    if (!encontrouRemocao) {
                        System.out.println("Ninja não encontrado no catálogo.");
                    }
                    break;

                default:
                    System.out.println("Essa não é uma opção válida, desculpe.");
            }

            System.out.println("Deseja voltar ao menu? [s/n] ");
            String resposta2 = input.nextLine();
            while (!resposta2.equalsIgnoreCase("n") && !resposta2.equalsIgnoreCase("s")) {
                System.out.println("Digite uma resposta válida.");
                resposta2 = input.nextLine();
            }
            if (resposta2.equalsIgnoreCase("n")) {
                continuarMenu = false;
                limparTela();
                System.out.println("Encerrando o sistema, obrigado pela visita!");
            }
        }
    }

    private static void limparTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}