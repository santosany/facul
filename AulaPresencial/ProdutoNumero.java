package facul.AulaPresencial;

import java.util.Scanner;

public class ProdutoNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int n1 = entrada.nextInt();
        System.out.println("Informe o segundo numero: ");
        int n2 = entrada.nextInt();

        int result = n1*n2;
        System.out.println("O produto dos numeros digitados são: "+ result);

        entrada.close();

    }
    
}
