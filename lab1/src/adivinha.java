import java.util.Scanner;

public class adivinha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numCerto = entrada.nextInt();
        while(true){
            int tentativa = entrada.nextInt();
            if (tentativa > numCerto) {
                System.out.println("MAIOR");
            } else if(tentativa < numCerto) {
                System.out.println("MENOR");
            }else{
                System.out.println("ACERTOU");
                break;
            }
        }
    }
}
