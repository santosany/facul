import java.util.Scanner;

public class ChamadaMetodoExemplo5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num1,num2;

        System.out.println("Sigite dois numeros inteiros: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        teclado.close();

        System.out.println("Valor é: " + soma(num1,num2));
        
    }
    public static int soma(int n1, int n2) {
        return (n1 + n2);
    }
    
}
