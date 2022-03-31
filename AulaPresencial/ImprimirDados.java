package facul.AulaPresencial;

import java.util.Scanner;

public class ImprimirDados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome completo: ");
        String nome = entrada.nextLine();

        System.out.println("Informe qual o seu curso: ");
        String curso = entrada.nextLine();

        System.out.println(" Infome seu RA: ");
        int ra = entrada.nextInt();


        System.out.println(" Seu nome é: " + nome);
        System.out.println(" Seu RA é : " + ra);
        System.out.println(" Seu curso é: " + curso);
        
        entrada.close();
    }
    

    
}
