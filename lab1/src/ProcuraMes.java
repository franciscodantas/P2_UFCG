import java.util.Scanner;

public class ProcuraMes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] meses = entrada.nextLine().split(" ");
        String[] valores = entrada.nextLine().split(" ");
        String mes = entrada.next();
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equals(mes)) {
                System.out.println(valores[i]);
            }
        }
    }
}
