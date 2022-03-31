package facul.AulaOnline04;
//import java.util.Scanner;

public class ExercicioChamadaMetodo {

    public static void main(String[] args) {
        // Scanner numeroDigitado= new Scanner(System.in);
        // int numero;

        // System.out.println("Digite um valor: ");
        // numero = numeroDigitado.nextInt();
        // numeroDigitado.close();


        // verificaPositvo(numero);

        //System.out.println(verificaPositvoNegativo(-12));

        if (ehPositivo(-12)) {
            System.out.println("O numero é positivo");
        } else {
            System.out.println("O numero é negativo");
        }
        
    }
    public static void verificaPositvo(int num) {
        if (num >= 0) {
            System.out.println("O numero " + num +  "é positivo");
        }else{
            System.out.println("O numero " + num +  "é negativo");
        }
        
    }
    public static String verificaPositvoNegativo(int num) {
        if (num >= 0) {
            return("O numero " + num +  " é positivo");
        }else{
            return("O numero " + num +  " é negativo");
        }
        
    }
    public static boolean ehPositivo(int num) {
        if (num >= 0) {
            return true;
        }
        
        return false;
    
        
    }
    
}
