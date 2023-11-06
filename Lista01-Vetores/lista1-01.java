import java.util.Scanner;

/*Ler oito elementos numéricos inteiros em um vetor A. Construir um vetor B de 
mesma dimensão com os elementos do vetor A multiplicados por 3. Apresentar os 
elementos do vetor B.*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor
        int tamanho = 8;

        // Declare os vetores A e B
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        // Leia os elementos do vetor A
        System.out.println("Digite os elementos do vetor A:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetorA[i] = scanner.nextInt();
        }

        // Construa o vetor B multiplicando os elementos do vetor A por 3
        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[i] * 3;
        }

        // Apresente os elementos do vetor B
        System.out.println("Elementos do vetor B (A * 3):");

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vetorB[i]);
        }

        // Feche o scanner
        scanner.close();
    }
}
