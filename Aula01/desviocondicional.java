import java.util.Scanner; 

public class desviocondicional {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Tente acertar o numero que estou pensando... ");
            int chute = entrada.nextInt();

            if(chute == 15){
                System.out.println("Perfeito! Acertou! ");
            }else if(chute > 15){
                System.out.println("Chute acima do esperado! ");
            }else{
                System.out.println("Chute abaixo do esperado! ");
            }
            entrada.close();

        }
    }
    
}
