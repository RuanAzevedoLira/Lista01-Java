import java.util.Scanner;

/*Faça um programa que leia um vetor com quinze posições para números inteiros. 
Crie, a seguir, um vetor resultante que contenha todos os números primos do vetor 
digitado. Escreva o vetor resultante. */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tam = 15;

        int[] vetA = new int[tam];
        int[] res = new int[tam];
        int primeCount = 0;

        System.out.println("Digite os " + tam + " valores do vetor vetA:");
        for (int i = 0; i < tam; i++) {
            vetA[i] = sc.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            if (isPrime(vetA[i])) {
                res[primeCount] = vetA[i];
                primeCount++;
            }
        }

        System.out.println("Os números primos são:");
        for (int i = 0; i < primeCount; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

