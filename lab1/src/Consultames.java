import java.util.Scanner;

public class Consultames{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] mes = entrada.nextLine().split("\\s+");
        String[] valores = entrada.nextLine().split("\\s+");
        String pesquisa = entrada.nextLine();
        for (int i = 0; i < mes.length; i++) {
            if (mes[i].equals(pesquisa)) {
                System.out.println(valores[i]);
            }
        }
    }
}