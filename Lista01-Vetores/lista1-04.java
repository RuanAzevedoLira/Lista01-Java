import java.util.Scanner;

/*Ler 15 elementos numéricos inteiros de um vetor A. Construir um vetor B de mesmo 
tipo, observando a seguinte lei de formação: todo elemento do vetor B deve ser o 
quadrado do elemento correspondente do vetor A. Apresentar os elementos dos 
vetores A e B dispostos lado a lado.*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int tamanho = 15;
        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        
        // Lê os elementos do vetor A
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
            vetorA[i] = input.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i]; // Calcula o quadrado e armazena em vetorB
        }
        
        // Exibe os elementos dos vetores A e B lado a lado
        System.out.println("Elementos dos vetores A e B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("A[" + i + "] = " + vetorA[i] + "\tB[" + i + "] = " + vetorB[i]);
        }
        
        input.close();
    }
}
