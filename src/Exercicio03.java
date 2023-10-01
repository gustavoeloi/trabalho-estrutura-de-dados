import java.util.Scanner;

public class Exercicio03 {
    //Fazer uma função para calcular o modulo de vetor de doubles. Obs:
    //O modulo é a raiz quadrada da soma de todos os elementos elevados
    //ao quadrado.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int[] n = new int[sc.nextInt()];

        for(int i = 0; i < n.length; i++){
            System.out.printf("Digite o %d°: ", i + 1);
            n[i] = sc.nextInt();
        }

        System.out.printf("O módulo essa array é: %f", moduloDeDouble(n));
    }

    public static double moduloDeDouble(int[] arr){
        double somaVetor = 0.0;
        for(int i = 0; i < arr.length; i++){
            somaVetor += arr[i] * arr[i];
        }
        return Math.sqrt(somaVetor);
    }

}
