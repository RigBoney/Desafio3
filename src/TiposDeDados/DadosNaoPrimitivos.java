package TiposDeDados;

import java.lang.annotation.Native;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        String nomeMaisculo = nome.toUpperCase(); // deixa em capslock
        System.out.println("Nome em caixa alta: " + nomeMaisculo);
        System.out.println("Nome normal: " + nome);

        String Aldeia = "Aldeia da Folha";
        System.out.println("Aldeia da Folha: " + Aldeia.toUpperCase());
        System.out.println("Aldeia da Folha: " + Aldeia.toLowerCase());
        System.out.println("Aldeia da Folha: " + Aldeia);
    }
    }
