import java.util.Scanner;

public class numeroDecrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1,n2;

        System.out.println("Informe o primeiro numero: ");
        n1 = entrada.nextFloat();

        System.out.println("Informe o segundo numero: ");
        n2 = entrada.nextFloat();

        if(n1 > n2){
            System.out.println(n1 + ", " + n2);
            // System.out.println(n1);
            // System.out.println(n2);
        }else{
            System.out.println(n2);
            System.out.println(n1);
        }

        entrada.close();

    }
    
    
}
