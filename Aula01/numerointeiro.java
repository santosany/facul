package facul.Aula01;
import java.util.Scanner;

public class numerointeiro {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        int n1, n2, result;
        

        System.out.println("Digite o primeiro numero: ");
        
        n1 = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        n2 = entrada.nextInt();

        if(n1 == n2){
            System.out.println("Os numeros são iguais!");
        }else if(n1 > n2){
            result = n1 - n2;
            System.out.println("O primeiro numero é maior. A diferença entre os dois numeros é: " + result);
        }else{
            result = n2 - n1;
            System.out.println("O segundo numero é maior. A diferença entre os dois numeros é: " + result);
        }
        
        entrada.close();  
    }
    
}
