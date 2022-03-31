package facul.AulaPresencial;
import java.util.Scanner;

public class ExercicioTabuadaUsuario {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite o numero para multiplicar: ");
        int numeroUsuario = entrada.nextInt();
        

        for (int numero = 0; numero <= 10; numero++) {
            int result = numero * numeroUsuario;
            System.out.println(numero + " x " + numeroUsuario + " = " + result);
            
        }
        entrada.close();
    }
    
    
}
