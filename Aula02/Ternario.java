import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Informe o numero: ");
        num = entrada.nextInt();

        System.out.println((num>=0)? "Positivo" : "Negativo");

        entrada.close();
    }
    
}
