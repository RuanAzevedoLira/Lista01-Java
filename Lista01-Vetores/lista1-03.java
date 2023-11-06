import java.util.Arrays;
import java.util.Scanner;

/*Ler dois vetores A com cinco elementos e B com dez elementos (valores numéricos 
inteiros). Construir um vetor C, que é a junção dos dois outros vetores. Dessa forma, 
C deve ter a capacidade de armazenar 15 elementos. Apresentar os elementos do 
vetor C.*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare e leia o vetor A com cinco elementos
        int[] vetorA = new int[5];
        System.out.println("Digite os cinco elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = scanner.nextInt();
        }

        // Declare e leia o vetor B com dez elementos
        int[] vetorB = new int[10];
        System.out.println("Digite os dez elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            vetorB[i] = scanner.nextInt();
        }

        // Combine os vetores A e B em um vetor C
        int[] vetorC = new int[15];
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];
        }
        for (int i = 0; i < 10; i++) {
            vetorC[i + 5] = vetorB[i];
        }

        // Apresente os elementos do vetor C
        System.out.println("Vetor C (junção de A e B):");
        for (int i = 0; i < 15; i++) {
            System.out.print(vetorC[i] + " ");
        }

        scanner.close();
    }
}
