import java.util.Scanner;

public class comparandoString {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String senha;

            System.out.println("Informe a senha: ");
            senha = entrada.next();

            if(senha.equals("R10p5")){
                System.out.println("acesso concedido! ");

            }else {
                System.out.println("acesso negado! ");
            }
        }
    
    }

}
