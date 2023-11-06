import java.util.Scanner;

/*Faça um programa que preencha um vetor com dez números reais, calcule e mostre 
a quantidade de números negativos e a soma dos números positivos desse vetor. */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir o tamanho do vetor
        int tamanho = 10;

        // Criar um vetor de números reais
        double[] numeros = new double[tamanho];

        // Preencher o vetor com números reais
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Inicializar variáveis para contar números negativos e somar números positivos
        int contadorNegativos = 0;
        double somaPositivos = 0.0;

        // Iterar sobre o vetor para contar números negativos e somar números positivos
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] < 0) {
                contadorNegativos++;
            } else if (numeros[i] > 0) {
                somaPositivos += numeros[i];
            }
        }

        // Mostrar o resultado
        System.out.println("Quantidade de números negativos: " + contadorNegativos);
        System.out.println("Soma dos números positivos: " + somaPositivos);

        // Fechar o scanner
        scanner.close();
    }
}
