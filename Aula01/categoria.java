import java.util.Scanner;

public class categoria {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int idade;

            System.out.println("Informe a idade do nadador: ");
            idade = entrada.nextInt();

            if(idade < 5){
                System.out.println("Vc ainda não tem idade para competir! ");

            }else if(idade >= 5 && idade <= 7){
                System.out.println("InfantilA");

            }else if(idade <= 10){
                System.out.println("InfantilB");

            }else if(idade <= 13){
                System.out.println("JuvenilA");

            }else if(idade <= 17){
                System.out.println("JuvenilA");

            }else{
                System.out.println("Senior");
            }
        }
    }
    
}
