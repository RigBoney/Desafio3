package Desafio3;

public class Hyuga extends Ninja{

    String habilidadeEspecialHyuga;

    public void mostrarHabilidade(){
        System.out.println("Habilidade Especial: " + habilidadeEspecialHyuga);
    }
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        mostrarHabilidade();
    }
}
