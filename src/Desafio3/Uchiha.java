package Desafio3;

public class Uchiha extends Ninja{

    String habilidadeEspecialUchiha;

    public void mostrarHabilidade(){
        System.out.println("Habilidade especial: " + habilidadeEspecialUchiha);
    }
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        mostrarHabilidade();
    }
}
