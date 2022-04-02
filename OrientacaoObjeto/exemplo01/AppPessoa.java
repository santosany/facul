package exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Any";
        p1.apresentar();

        p2.nome = "João";
        p2.apresentar();
    }
    
}
