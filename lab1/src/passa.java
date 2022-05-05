import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Francisco Antonio Dantas de Sousa - 121110408
 */

public class passa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float primeiro = entrada.nextFloat();
        float segundo = entrada.nextFloat();
        double media = (primeiro + segundo)/2;
        if(media >= 7.0){
            System.out.println("pass: True!");
        } else {
            System.out.println("pass: False!");
        }
    }
}
