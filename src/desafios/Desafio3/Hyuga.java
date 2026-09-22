package desafios.Desafio3;

public class Hyuga extends Ninja{

    String habilidadeEspecialHyuga;

    //criando um metodo para mostrar a habilidade especial que só esse cla tem
    public void mostrarHabilidade(){
        System.out.println("Habilidade Especial: " + habilidadeEspecialHyuga);
    }

    //chamando o metodo e o alterando com polimorfismo. ele chama o metodo original e adiciona ometodo criado acima
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        mostrarHabilidade();
    }
}
