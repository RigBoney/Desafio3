package nivelBasico;

public class testeDeMetodo {
    void main(String[] args) {
        avaliarNinja("konohamaru", 12, "derrotar zabuza", "A" );
        avaliarNinja("hanabi", 11, "Achar um cahorro", "D");
        avaliarNinja("Naruto", 17, "Derrotar Pain", "S");
    }

    public static void avaliarNinja(String nome, int idade, String missao, String nivel) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel: " + nivel);

        if (idade < 15 && (nivel.equals("D") || nivel.equals("C"))) {
            System.out.printf("%s Está apto(a) para cumprir a missão nivel %s\n", nome, nivel);
        }else if (idade >= 15) {
            System.out.printf("%s Está apto(a) para cumprir a missão nivel %s\n", nome, nivel);
        }else {
            System.out.printf("%s Não está apto(a) para cumprir a missão de nível %s\n", nome, nivel);
        }
        System.out.println();
    }
}
