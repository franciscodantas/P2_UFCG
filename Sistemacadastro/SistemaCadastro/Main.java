package SistemaCadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String id;
        Cadastro c = new Cadastro();
        Scanner entrada = new Scanner(System.in);
        for (;;) {
            System.out.println("\n" + "C - Cadastra");
            System.out.println("L - Lista");
            System.out.println("R - Remove");
            System.out.println("S - Sair" + "\n");
            String comando = entrada.nextLine();
            if (comando.equals("C")) {
                nome = entrada.nextLine();
                id = entrada.nextLine();
                c.adicionar(nome, id);
            }
            if (comando.equals("R")) {
                String pesquisa = entrada.nextLine();
                c.remove(pesquisa);
            }
            if (comando.equals("L")) {
                System.out.println("\n" + c.getAlunos() + "\n" + c.getIds() + "\n");
            }
            if (comando.equals("S")) {
                break;
            }
            
            
        }
        
    }
}
