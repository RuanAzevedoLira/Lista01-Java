import java.util.Random;

/*Faça um programa que defina dois vetores do tipo inteiro, um chamado par e outro 
chamado ímpar. Cada vetor deve conter 10 elementos. A seguir, faça um laço de 
repetição com 10 iterações e que contenha internamente a geração randômica de 
números entre 1 e 20. Se o valor gerado for par, armazene no vetor chamado par, 
caso contrário, no vetor chamado ímpar. Ao final, apresente o conteúdo de cada um 
dos vetores. Dica: Utilize o método nextInt(int n) da classe java.util.Random */

public class Main {
    public static void main(String[] args) {
        int[] par = new int[10];
        int[] impar = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = rand.nextInt(20) + 1;

            if (numeroAleatorio % 2 == 0) {
                par[i] = numeroAleatorio;
            } else {
                impar[i] = numeroAleatorio;
            }
        }

        System.out.println("Elementos do vetor 'par':");
        for (int i = 0; i < 10; i++) {
            if (par[i] != 0) {
                System.out.print(par[i] + " ");
            }
        }

        System.out.println("\nElementos do vetor 'ímpar':");
        for (int i = 0; i < 10; i++) {
            if (impar[i] != 0) {
                System.out.print(impar[i] + " ");
            }
        }
    }
}
