package nivelIntermediario;
public class Main {
    public static void main(String[] args) {

        //criar um usuario
        UsuarioComum renboney = new UsuarioComum();
        renboney.nome = "yuri silva";
        renboney.email = "renboney@gmail.com";
        renboney.idade = 27;

        UsuarioVip gabey = new UsuarioVip();
        gabey.nome = "gabrielle xavier";
        gabey.email = "gabey@gmail.com";
        gabey.idade = 24;
        gabey.VipAtivado();

        UsuarioPremium davidrec = new UsuarioPremium();
        davidrec.nome = "david anderson";
        davidrec.email = "david@gmail.com";
        davidrec.idade = 30;
        davidrec.PremiumAtivado();

    }
}
