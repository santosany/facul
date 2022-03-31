package facul.AulaOnline04;
import java.util.Scanner;

public class EncontrarMax {

    public static void main(String[] args) {

        System.out.println("O maior numero digitado é " + encontrarMax());

    }
    public static int encontrarMax() {
        Scanner entrada = new Scanner(System.in);
        int num;
        int maior = 0;
       

        for (int i = 1; i <=3; i++) {
            System.out.print("numero"+i+": ");
            num = entrada.nextInt();

            if (num > maior) {
                maior = num;
            }
        }
        return maior;
        
    }
    
    
}
