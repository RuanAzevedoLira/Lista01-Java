import java.util.Scanner;
/*Ler oito elementos numéricos inteiros em um vetor A. Construir um vetor B de 
mesma dimensão com os elementos do vetor A multiplicados por 3. Apresentar os 
elementos do vetor B.*/
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor
        int tamanho = 8;

        int[] vetorA = new int [tamanho];
        int[] vetorB = new int [tamanho];

        System.out.println("Digite os valores do vetorA: ");
        for(int i = 0; i < tamanho; i++){
            vetorA[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < tamanho; i++){
            vetorB[i] = vetorA[i] * 3;
            
        }
        System.out.println("Os valores do vetorB são:");
        for(int i = 0; i < tamanho; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}