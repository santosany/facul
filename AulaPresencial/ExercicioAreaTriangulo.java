package facul.AulaPresencial;
import java.util.Scanner;

public class ExercicioAreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a area do triangulo: ");
        float area = entrada.nextFloat();
        System.out.println("Informe a base do triangulo: ");
        float base = entrada.nextFloat();

        float resultado = calculoArea(area, base);
        System.out.println("A area do triangulo: " + resultado);

       entrada.close();

    }
     public static float calculoArea(float area, float base){
        float calculo = area * base / 2;

        return calculo;
     }
    
}
