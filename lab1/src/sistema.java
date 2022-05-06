import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Francisco Antonio Dantas de Sousa - 121110408
 */

public class sistema {
    private static int soma;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int minimo = 0;
        int acima = 0;
        int abaixo = 0;
        List<Object[]> alunos = new ArrayList<>();
        while (true) {
            Object[] notas = entrada.nextLine().split("\\s+");
            if (notas[0].equals("-")) {
                break;
            }
            alunos.add(notas);
        }

        for (int i = 0; i < alunos.size(); i++) {
            Object[] aux = alunos.get(i);
            soma += Integer.parseInt((String) aux[1]);
        }

        float media = soma/alunos.size();

        for (int i = 0; i < alunos.size(); i++) {
            Object[] aux = alunos.get(i);
            if (Integer.parseInt((String) aux[1]) >= 700) {
                acima += 1;
            }
            if (Integer.parseInt((String) aux[1]) < 700) {
                abaixo += 1;
            }
            if (Integer.parseInt((String) aux[1]) > maior) {
                maior = Integer.parseInt((String) aux[1]);
            }
            
        }
        minimo = maior;
        for (int i = 0; i < alunos.size(); i++) {
            Object[] aux = alunos.get(i);
            if (Integer.parseInt((String) aux[1]) <= minimo) {
                minimo = Integer.parseInt((String) aux[1]);
            }
        }

        for (int x = 0; x < alunos.size(); x++) {
            Object[] aux = alunos.get(x);
            
        }

        

        System.out.println("maior: " + maior);
        System.out.println("menor: " + minimo);
        System.out.println("media: " + (int) media);
        System.out.println("acima: " + acima);
        System.out.println("abaixo: " + abaixo);
    }
}
