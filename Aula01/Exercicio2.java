import java.util.Scanner;

public class Exercicio2{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double n1, n2, media;

        System.out.println("Digite a primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite a segnda nota: ");
        n2 = entrada.nextDouble();

        media = (n1+n2)/2;

        System.out.println("A media é: " + media);

        entrada.close();

    }


    
}