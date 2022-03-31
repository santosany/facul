package facul.Aula01;
import java.util.Scanner;

public class intervalo {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int n1;

            System.out.println("Informe o numero: ");
            n1 = entrada.nextInt();

            if(n1 >= 50 && n1 <= 100){
                System.out.println("Pertence ao intervalo! ");
            }else{
                System.out.println("Não pertence ao intervalo! ");
            }
            entrada.close();
        }
    }
    
}
