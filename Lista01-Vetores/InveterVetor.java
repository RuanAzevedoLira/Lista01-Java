import java.util.Scanner;

public class InverterVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        // Cria um vetor com o tamanho especificado pelo usuário
        int[] vetor = new int[tamanho];

        // Solicita ao usuário que insira os elementos do vetor
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Exibe o vetor original
        System.out.print("Vetor Original: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        // Inverte os valores do vetor
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - i - 1];
            vetor[tamanho - i - 1] = temp;
        }

        // Exibe o vetor invertido
        System.out.print("\nVetor Invertido: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Fecha o scanner
        scanner.close();
    }
}
