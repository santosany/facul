package facul.AulaPresencial;

import java.util.Scanner;

public class NumeroDecrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        double n1 = entrada.nextDouble();
        System.out.println("Informe o segundo numero: ");
        double n2 = entrada.nextDouble();

        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
            
        } else if(n2 > n1) {
            System.out.println(n2 + " é maior que " + n1);
            
        }
        System.out.println("Os numeros digitados são iguais");
        entrada.close();
    }
    
    
}
