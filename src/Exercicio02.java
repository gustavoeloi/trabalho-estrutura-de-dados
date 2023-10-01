import java.util.Scanner;

public class Exercicio02 {
    // Fazer uma função para imprimir o menor valor de uma array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores serão armazenados? ");
        int[] n = new int[sc.nextInt()];

        for(int i = 0; i < n.length; i++){
            System.out.printf("%d° -> ", i + 1);
            n[i] = sc.nextInt();
        }

        System.out.println(menorValorDeUmaArray(n));
    }
    public static int menorValorDeUmaArray(int[] listaArray){
        int menorNumero = listaArray[0];
        for(int i = 1; i < listaArray.length; i++){
            if(listaArray[i] < menorNumero){
                menorNumero = listaArray[i];
            }
        }
        return menorNumero;
    }
}
