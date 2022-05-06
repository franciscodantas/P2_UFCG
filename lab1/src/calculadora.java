import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Francisco Antonio Dantas de Sousa - 121110408
 */

public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String operaçao = entrada.next();

        if(operaçao.equals("+")){
            float parcela1 = entrada.nextFloat();
            float parcela2 = entrada.nextFloat();
            float soma = parcela1 + parcela2;
            System.out.println("RESULTADO: " + soma);
        }else{
            if(operaçao.equals("-")){
                float minuendo = entrada.nextFloat();
                float subtraendo = entrada.nextFloat();
                float subtracao = minuendo - subtraendo;
                System.out.println("RESULTADO: " + subtracao);
            }else{
                if(operaçao.equals("*")){
                    float fator1 = entrada.nextFloat();
                    float fator2 = entrada.nextFloat();
                    float produto = fator1 * fator2;
                    System.out.println("RESULTADO: " + produto);
                }else{
                    if(operaçao.equals("/")){
                        float dividendo = entrada.nextFloat();
                        float divisor = entrada.nextFloat();
                        if(divisor != 0.0){
                            float quociente = dividendo/divisor;
                            System.out.println("RESULTADO: " + quociente);
                        }else{
                            System.out.println("ERRO");
                        }
                    }else{
                        System.out.println("ENTRADA INVALIDA");
                    }
                }
            }
        }
    }
}
