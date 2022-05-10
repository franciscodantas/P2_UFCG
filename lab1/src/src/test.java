package src;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        lista inteiros = new lista();
        int[] inteiro = {1,2,3,5,10,6,8};
        inteiros.elementos = inteiro;
        Scanner entrada = new Scanner(System.in);
        int count = 0;
        while(true){
            String sc = entrada.nextLine();
            if (sc.equals("-")) {
                break;
            }else{
            inteiros.append(Integer.parseInt(sc));
            System.out.println(inteiros.elementos[count]);

            count++;
        }
        inteiros.sorted();
            
        }
        for (int i = 0; i < inteiros.elementos.length; i++) {
            System.out.println(inteiros.elementos[i]);
        }

    }
}
