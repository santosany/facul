package facul.AulaPresencial;

import java.util.Scanner;

public class VetorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 0;

        for(int n = 1; n <= 10; n++){
            System.out.println("Informe o numero: " + n);
            int numero = entrada.nextInt();
            System.out.println(num);
            num = num + numero;   
        }
        System.out.println(num*2);

        System.out.println(num/3);
    }
    
}
