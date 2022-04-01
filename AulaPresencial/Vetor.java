package facul.AulaPresencial;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float resultNota;
        float somaNota = 0;
        float notaFinal;

        for(float nota = 1; nota <= 10; nota++){
            System.out.println("Informe nota "+nota);
            resultNota = entrada.nextFloat();

            System.out.println(resultNota);

            somaNota = somaNota + resultNota;

        }
        notaFinal = somaNota/10;
        System.out.println("A media é: " + notaFinal);
        
    }
    
}
