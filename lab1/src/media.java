import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Francisco Antonio Dantas de Sousa - 121110408
 */

 public class media {
     static int soma;
     static String resultado = " ";
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String lista = entrada.nextLine();
        String[] array = lista.split("\\s+");
        for(int i = 0; i < array.length;i ++){
            soma  += Integer.parseInt(array[i]);
        } 
        float media = soma/array.length;
        for(int i = 0; i < array.length;i ++){
            if (Integer.parseInt(array[i]) > media){
                resultado += array[i] + " ";

            }
            
        } 
        System.out.println(resultado.trim());
    }
}
