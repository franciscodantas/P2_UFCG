package auladia1105;

public class quiz{
    public static void main(String[] args) {
        Lista alunos = new Lista();
        int[] lista1 = {1,2,3};
        alunos.elementos = lista1;
        alunos.append(1);
        alunos.sorted();
        for (int i = 0; i < alunos.elementos.length; i++) {
            System.out.println(alunos.elementos[i]);
        }
    }
}