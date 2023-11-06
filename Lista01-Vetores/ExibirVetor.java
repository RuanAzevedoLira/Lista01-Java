public class Main {
    public static void ExibirVetor (String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        
        System.out.print("Vetor: ");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println(); // Pula uma linha após exibir o vetor
    }
}
