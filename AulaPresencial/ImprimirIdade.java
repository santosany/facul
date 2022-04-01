package facul.AulaPresencial;

import java.util.Scanner;

public class ImprimirIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Informe sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Informe se voce esta online(o) ou offline(f): ");
        String status = entrada.next();

        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Seu status é: " + status);

        entrada.close();
        

    }
}
