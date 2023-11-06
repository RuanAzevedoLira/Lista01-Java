import java.util.Scanner;

/*Ler 20 elementos numéricos inteiros para um vetor A e construir um vetor B de 
mesma dimensão com os mesmos elementos de A. Eles devem estar invertidos, ou 
seja, o primeiro elemento de A passa a ser o último de B, o segundo elemento de A 
passa a ser o penúltimo de B, e assim por diante. Apresentar os elementos dos dois 
vetores. */

public class InverteVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tamanho dos vetores
        int tamanho = 20;

        // Declarar vetores A e B
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];

        // Ler elementos para o vetor A
        System.out.println("Digite os " + tamanho + " elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            A[i] = input.nextInt();
        }

        // Inverter os elementos de A e armazenar em B
        for (int i = 0; i < tamanho; i++) {
            B[i] = A[tamanho - 1 - i];
        }

        // Apresentar elementos dos dois vetores
        System.out.println("Elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nElementos do vetor B (invertido):");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(B[i] + " ");
        }

        input.close();
    }
}
