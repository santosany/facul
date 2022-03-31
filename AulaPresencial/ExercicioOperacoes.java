package facul.AulaPresencial;
import java.util.Scanner;

public class ExercicioOperacoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroUsuario;
        

        do {
            
            System.out.println("Informe um numero: ");
            numeroUsuario = entrada.nextInt();

            if (numeroUsuario <= 0) {
                break;
                
            }
            

            System.out.println(" O numero eh: " + numeroUsuario);
            System.out.println(" O numero ao quadrado eh " + numeroUsuario*numeroUsuario);
            System.out.println(" O numero ao cubo eh " + numeroUsuario*numeroUsuario*numeroUsuario);
            System.out.println(" A raiz quadrado do numero eh " + Math.sqrt(numeroUsuario));
            
        }while(numeroUsuario > 0);


    }
    
}
