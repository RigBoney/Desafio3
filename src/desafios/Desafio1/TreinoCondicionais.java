package desafios.Desafio1;

public class TreinoCondicionais {
    public static void main(String[] args) {
        //catalogar ninjas de acordo com sua idade e nivel de missao que pode concluir

        //Informações do ninja 1
        String Ninja1 = "Konohamaru";
        int idadeNinja1 = 12;
        String missaoNinja1 = "Derrotar zabuza";
        String nivelDaMissao1 = "A";
        boolean concluida1 = false;
        //Verificação com base na idade para descobrir se pode ou não concluir

        System.out.println("Ninja: " + Ninja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missao: " + missaoNinja1);
        System.out.println("Nivel da missao: " + nivelDaMissao1);
        if (idadeNinja1 >= 15) {
            concluida1 = true;
            System.out.println(Ninja1 + " pode concluir sua missão");
        }else if (idadeNinja1 < 15 && (nivelDaMissao1.equals("D") || nivelDaMissao1.equals("C"))) {
            concluida1 = true;
            System.out.println(Ninja1 + " pode concluir a missao de nivel: " + nivelDaMissao1);
        }else {
            System.out.println(Ninja1 + " não é capaz de concluir a missao de nivel: " + nivelDaMissao1);
        }
        System.out.println();
        //Informações do ninja 2

        String Ninja2 = "Shikamaru";
        int idadeNinja2 = 16;
        String missaoNinja2 = "Derrotar Hidan";
        String nivelDaMissao2 = "S";
        boolean concluida2 = false;
        //verificação de conclulusão

        System.out.println("Ninja: " + Ninja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missao: " + missaoNinja2);
        System.out.println("Nivel da missao: " + nivelDaMissao2);
        if (idadeNinja2 >= 15) {
            concluida2 = true;
            System.out.println(Ninja2 + " pode concluir a missao de nivel: " + nivelDaMissao2);
        }else if (idadeNinja2 < 15 && (nivelDaMissao2.equals("D") || nivelDaMissao2.equals("C"))) {
                concluida2 = true;
                System.out.println(Ninja2 + " pode concluir a missao de nivel: " + nivelDaMissao2);
        }else {
            System.out.println(Ninja2 + " não é capaz de concluir a missao de nivel: " + nivelDaMissao2);
        }
        System.out.println();
        //informaçôes do ninja 3

        String Ninja3 = "Hanabi";
        int idadeNinja3 = 11;
        String missaoNinja3 = "Derrotar Gaara";
        String nivelDaMissao3 = "A";
        boolean concluida3 = false;
        //verificação de conclusão

        System.out.println("Ninja: " + Ninja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missao: " + missaoNinja3);
        System.out.println("Nivel da missao: " + nivelDaMissao3);
        if (idadeNinja3 >= 15) {
            concluida3 = true;
            System.out.println(Ninja3 + " pode concluir a missao de nivel: " + nivelDaMissao3);
        }else if (idadeNinja3 < 15 && (nivelDaMissao3.equals("D") || nivelDaMissao3.equals("C"))) {
            concluida3 = true;
            System.out.println(Ninja3 + " pode concluir a missao de nivel: " + nivelDaMissao2);
        }else {
            System.out.println(Ninja3 + " não é capaz de concluir a missao de nivel: " + nivelDaMissao3);
        }

    }
}
