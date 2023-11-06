import java.util.Scanner;

/*Ler dois vetores A e B com 20 elementos numéricos inteiros. Construir um vetor C, 
sendo cada elemento de C a subtração do elemento correspondente de A com B. 
Apresentar os elementos do vetor C */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 20; // Tamanho dos vetores A, B e C
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];
        int[] C = new int[tamanho];

        // Lê os elementos do vetor A
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // Lê os elementos do vetor B
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        // Calcula o vetor C (A - B)
        for (int i = 0; i < tamanho; i++) {
            C[i] = A[i] - B[i];
        }

        // Apresenta os elementos do vetor C
        System.out.println("Elementos do vetor C (A - B):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("C[" + i + "]: " + C[i]);
        }

        scanner.close();
    }
}
