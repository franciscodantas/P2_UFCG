import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Francisco Antonio Dantas de Sousa - 121110408
 */

public class dobro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int dobro = x * 2;
        int triplo = x * 3;
        System.out.println("dobro: " + dobro + ", triplo: " + triplo);

    }
}
