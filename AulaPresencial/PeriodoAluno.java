package facul.AulaPresencial;

import java.util.Scanner;

public class PeriodoAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe qual o periodo você estuda. Matutino(M) / Vespertino(V) / Noturno(N)");
        String periodo = entrada.next();

        //String periodo = "M";

        if (periodo == "M" || periodo == "m") {
            System.out.println("Bom dia!");
            
        } else if(periodo == "V" || periodo == "v") {
            System.out.println("Boa tarde!");
            
        } else if (periodo == "N" || periodo == "n"){
            System.out.println("Boa noite!");

        }else{
            System.out.println("Informacao invalida!");
        }

        //entrada.close();
    }
    
}
