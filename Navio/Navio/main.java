package Navio;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo a batalha naval, vamos criar seu navio!");
        System.out.println("Vida do seu navio:");
        int vidaMeuNavio = entrada.nextInt();
        System.out.println("Dano do seu navio:");
        int danoMeuNavio = Integer.parseInt(entrada.nextLine());
        Navio n1 = new Navio(vidaMeuNavio, danoMeuNavio);

        System.out.println("Agora do seu adversario!");
        System.out.println("Vida do navio:");
        int vidaoutroNavio = entrada.nextInt();
        System.out.println("Dano do navio:");
        int danooutroNavio = entrada.nextInt();
        Navio n2 = new Navio(vidaoutroNavio, danooutroNavio);

        for (int i = 0; i >= 0; i++) {

            if (n1.getVida() <= 0) {
                System.out.println("Você perdeu");
                break;
            }else if (n2.getVida() <= 0) {
                System.out.println("Você ganho!!!!");
                break;
            }
            System.out.println();
            System.out.println("#########" + " Comandos " + "#########");
            System.out.println("         " + " Atacar (a) " + "         ");
            System.out.println("         " + " Oficina (o) " + "         ");
            System.out.println("         " + " Minha vida (v) " + "         ");
            System.out.println();

            String comando = entrada.nextLine();

            if (comando.equals("a")){
                n1.atacar(n2);
            }

            if (comando.equals("o")) {
                System.out.println("Aprimorar dano (apd)");
                System.out.println("Curar (c)");
                System.out.println("Aprimorar vida (apv)");
                comando = entrada.nextLine();
                if (comando.equals("apd")) {
                    System.out.println("Digite o novo dano:");
                    int novoDano = entrada.nextInt();
                    n1.setDano(novoDano);
                } else if (comando.equals("c")) {
                    n1.curar();
                } else {
                    System.out.println("Digite a nova vida do seu navio:");
                    int novoVida = entrada.nextInt();
                    n1.setVida(novoVida);
                }
            }

            if (comando.equals("v")) {
                System.out.println(n1.getVida());
            }

            System.out.println("Você foi atacado!");
            n2.atacar(n1);
            System.out.println("Sua vida atual" + n1.getVida());
        }
        
       
    }
}