package exercicio01;

public class AppVeiculo {
    
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();

        v1.marca = "Chevrolet";
        v1.modelo = "Captiva";
        v1.consumo = 5.0;

        v1.descricaoVeiculo();
        System.out.println("Consumo: " + v1.retornaConsumo());

    }
}
