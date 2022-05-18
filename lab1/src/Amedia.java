import java.util.Scanner;

public class Amedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        double acimaMedia = n * 0.9;
        System.out.println(acimaMedia);
    }
}
