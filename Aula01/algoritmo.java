package facul.Aula01;
import java.util.Scanner;

public class algoritmo {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        float numero, metade;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        if(numero > 20){
             metade = numero/2;
            System.out.println("A divisão de pontos é: " + metade);
        }
        
        entrada.close();  
    }
    
}
