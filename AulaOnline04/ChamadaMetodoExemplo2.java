public class ChamadaMetodoExemplo2 {

    public static void main(String[] args) {
        metodo1();
        System.out.println("Dentro do metodo main");
    }

    public static void metodo1() {
        System.out.println("Metodo 1");
        metodo2();
        System.out.println("Dentro do metodo 1");
    }

    public static void metodo2() {
        System.out.println("Metodo 2");
    }
    
    
}
