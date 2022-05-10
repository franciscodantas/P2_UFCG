import java.util.Scanner;
public class lista {
    public int[] elementos;

    public static void main(String[] args) {
        lista inteiros = new lista();
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
            
        }
        for (int i = 0; i < inteiros.elementos.length; i++) {
            System.out.println(inteiros.elementos[i]);
        }

    }

    private void append(int adicionar){
        
        if (this.elementos == null){
            int[] novoArray = new int[1];
            novoArray[0] = adicionar;
            this.elementos = novoArray;

        }else{
            int[] novoArray = new int[this.elementos.length + 1];
            for (int i = 0; i < this.elementos.length; i++) {
                novoArray[i] = this.elementos[i];
            } 
            novoArray[novoArray.length - 1] = adicionar;
            this.elementos = novoArray;
        }
        
    }
}
