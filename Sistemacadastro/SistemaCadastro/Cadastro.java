package SistemaCadastro;

import java.util.Arrays;

public class Cadastro {
    private String[] alunos;
    private String[] ids;
    public void adicionar(String nome, String id){
        if (this.alunos == null){
            String[] novoArray = new String[1];
            novoArray[0] = nome;
            this.alunos = novoArray;

        }else{
            String[] novoArray = new String[this.alunos.length + 1];
            for (int i = 0; i < this.alunos.length; i++) {
                novoArray[i] = this.alunos[i];
            } 
            novoArray[novoArray.length - 1] = nome;
            this.alunos = novoArray;
        }
        if (this.ids == null){
            String[] novoArray = new String[1];
            novoArray[0] = id;
            this.ids = novoArray;

        }else{
            String[] novoArray = new String[this.ids.length + 1];
            for (int i = 0; i < this.ids.length; i++) {
                novoArray[i] = this.ids[i];
            } 
            novoArray[novoArray.length - 1] = id;
            this.ids = novoArray;
        }
    }

    public void remove(String pesquisa){
        int idx;
        int i;
        for (i = 0; i < alunos.length; i++) {
            
            if (alunos[i].equals(pesquisa) || ids[i].equals(pesquisa) ){
                break;
            } 
        }
        idx = i;
        String[] novoAluno = new String[alunos.length - 1];
        String[] novoids = new String[ids.length - 1];
        for (int j = 0; j < idx; j++) {
            novoAluno[j] = alunos[j];
            novoids[j] = ids[j];
        }
        for (int j = idx; j < novoAluno.length; j++) {
            novoAluno[j] = alunos[j + 1];
            novoids[j] = ids[j + 1];
        }

        this.alunos = novoAluno;
        this.ids = novoids;
    }

    public Object getAlunos() {
        return Arrays.toString(this.alunos);
    }

    public Object getIds() {
        return Arrays.toString(this.ids);
    }
}
