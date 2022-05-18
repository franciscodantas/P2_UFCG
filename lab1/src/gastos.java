import java.util.Scanner;

public class gastos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i = 0;
        for (int j = 0; j < elementos.length - i; j++) {
            for (i = 0; i < elementos.length - 1; i++) {
                if (elementos[i] > elementos[i + 1]) {
                    int troca = this.elementos[i + 1];
                    this.elementos[i + 1] = this.elementos[i];
                    this.elementos[i] = troca;
                }
            }
        }
    }
}
