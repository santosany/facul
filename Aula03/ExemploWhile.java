/**
 * ExemploWhile
 */
public class ExemploWhile {

    public static void main(String[] args) {
        int cont;

        cont = 1;

        while (cont < 10) {
            System.out.print(cont + " ");
            cont++; //cont = cont + 1; cont +=1;
            //cont += 2; //cont = cont + 2;
        }

        System.out.println(cont);
    }
}