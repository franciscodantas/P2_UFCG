import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Francisco Antonio Dantas de Sousa - 121110408
 */

public class crescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();
        int numero4 = entrada.nextInt();
        if(numero1 > numero2 && numero2 > numero3 && numero3 > numero4){
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        }else{
            if(numero1 < numero2 && numero2 < numero3 && numero3 < numero4){
                System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
            }else{
                System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
            }
        }
    }

}
