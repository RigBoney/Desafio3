package nivelBasico;

public class ArrayDeArray {
    public static void main(String[] args) {

        String[][] nomesFamalia = new String[3][3];
        nomesFamalia[0][0] = "Irmaos";
        nomesFamalia[0][1] = "isadora";
        nomesFamalia[0][2] = "david";

        nomesFamalia[1][0] = "Primos";
        nomesFamalia[1][1] = "felipe";
        nomesFamalia[1][2] = "marcondes";

        nomesFamalia[2][0] = "Outros";
        nomesFamalia[2][1] = "miguel";
        nomesFamalia[2][2] = "Gabi";

        for (int i = 0; i < nomesFamalia.length; i++) {
            System.out.print(nomesFamalia[i][0] + " - ");
            for (int j = 1; j < nomesFamalia[i].length; j++) {
                System.out.print(nomesFamalia[i][j] + " - ");
            }
            System.out.println();
        }
    }
}
