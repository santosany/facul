package facul.AulaPresencial;
import java.util.Scanner;

public class ExercicioMediaTresNumeros {
    public static void main(String[] args) {
        Scanner notaInformada = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double nota1 = notaInformada.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = notaInformada.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = notaInformada.nextDouble();

        double resultado = calculoMedia(nota1, nota2, nota3);
        System.out.println("A media é: " + resultado);

        notaInformada.close();


    }
    
    public static double calculoMedia(double n1, double n2, double n3){
        double calculo = (n1+n2+n3)/3;

        return calculo;
    }
    
}
