package facul.Aula01;
import java.util.Scanner;

public class exemploelseif {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero ");
        int numero = entrada.nextInt();

        if((numero % 2) == 0){
            System.out.println("O número é par! ");
        }else{
            System.out.println("O número é impar! ");
        }
        entrada.close();
    }
    
}
