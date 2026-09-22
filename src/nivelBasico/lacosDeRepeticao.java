package nivelBasico;

import java.util.Scanner;

public class lacosDeRepeticao {
    public static void main(String[] args) {

        //testando for e do-while para fazer laços de repetição

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 5;

        while (numeroDeClones < numeroMaximoDeClones) {
            numeroDeClones++;
            String contagemClones = (numeroDeClones == 1) ? "O Naruto fez " + numeroDeClones + " clone das sombras." : "O Naruto fez " + numeroDeClones + " clones das sombras.";
            System.out.println(contagemClones);
        }
        //agora fazer o mesmo usando o For e If/Else

        for (numeroDeClones = 0; numeroDeClones < numeroMaximoDeClones; numeroDeClones++) {
            if (numeroDeClones == 0) {
                System.out.println("Naruto ainda não fez nenhum clone.");
            }else System.out.println("Naruto fez " + numeroDeClones + " clone(s).");
        }
        //usando ternarios e For
        for (numeroDeClones = 0; numeroDeClones < numeroMaximoDeClones; numeroDeClones++) {
            String contagem = (numeroDeClones == 0) ? "Naruto não tem clones." : "Naruto já tem " + numeroDeClones + " clones.";
            System.out.println(contagem);
        }

        //objetivo: fazer o usuario acertar a palavra


        //definição da resposta e pedindo ao usuario para dar um chute
        String resposta = "casa";
        Scanner leitor = new Scanner(System.in);
        System.out.println("Boa noite, gostaria de advinhar a palavra do dia? [sim ou nao]");
        String resposta1 = leitor.nextLine();
        switch (resposta1) {
            case "sim":
                System.out.println("O que é, o que é: uma casinha sem porta e sem janela?");
                String resposta2 = leitor.nextLine();
                if (resposta.equals(resposta2)) {
                    System.out.println("Parabens! Você acertou a palavra do dia.");
                } else {
                    System.out.println("Ops! Essa não é a palavra.");
                    System.out.println("Quer tentar novamente? [sim ou nao]");
                    String resposta3 = leitor.nextLine();
                    switch (resposta3) {
                        case "sim":
                            System.out.println("Tente de novo, então:");
                            String resposta4 = leitor.nextLine();
                            if (resposta4.equals(resposta)) {
                                System.out.println("Parabens! Você acertou a palavra do dia.");
                            } else {
                                System.out.println("Ops! Essa não é a palavra.");
                            }
                            break;
                        case "nao":
                            System.out.println("Tudo bem, até mais!");
                            break;
                        default:
                            System.out.println("Responda apenas sim ou nao da proxima vez, ok? Até mais.");
                            break;
                    }
                }
                break;
            case "nao":
                System.out.println("Tudo bem, até mais!");
                break;
            default:
                System.out.println("Responda apenas sim ou nao da proxima vez, ok? Até mais.");
                break;
        }
        leitor.close();


    }
}
