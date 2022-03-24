import java.util.Scanner;

public class ExercicioNumMaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            System.out.print("Informe o numero 1: ");
            int num1 = entrada.nextInt();
            System.out.print("Informe o numero 2: ");
            int num2 = entrada.nextInt();

            System.out.print(" O maior numero é: ");
            maior(num1, num2);

            entrada.close();

    }

        static void maior(int n1, int n2) {
    
            if(n1 > n2){
                System.out.println(n1);
            }else{
                System.out.println(n2);
            }
       
        
    }
    
}
