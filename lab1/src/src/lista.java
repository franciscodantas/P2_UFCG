package src;
public class lista {
    public int[] elementos;

    public void append(int adicionar){
        
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

    public void sorted(){
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
