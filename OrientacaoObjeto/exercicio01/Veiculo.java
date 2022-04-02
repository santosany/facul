package exercicio01;

public class Veiculo {
    
    String modelo;
    String marca;
    double consumo;

    void descricaoVeiculo(){
        System.out.println("A marca é: " + marca + " o modelo é: " + modelo);
    }

    double retornaConsumo(){

        return consumo;

    }
}
