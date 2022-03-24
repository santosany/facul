import java.util.Scanner;

public class ExercicioFuncaoPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int num = entrada.nextInt();

        boolean resultado = isPair(num);

        System.out.println("O numero é par? " + resultado);
        entrada.close();
    }

    public static boolean isPair(int numero){
        if (numero%2 == 0) {
            return true;
            
        } else {
            return false;
        }
    }
    
}
