import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Francisco Antonio Dantas de Sousa - 121110408
 */

public class wally {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){
            String nomeNovo = "?";
            String[] listaNomes = entrada.nextLine().split("\\s+");
            if(listaNomes[0].equals("wally")){
                break;
            }
            for(int i = 0; i < listaNomes.length; i++){
                if(listaNomes[i].length() == 5){
                    nomeNovo = listaNomes[i];
                }
            }
            System.out.println(nomeNovo);
        }
        
    }
}
