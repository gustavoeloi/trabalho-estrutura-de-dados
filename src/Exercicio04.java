import java.util.Scanner;

// Fazer uma função para verificar se existe um numero no vetor
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0, 3, 5, 7, 8, 9};

        System.out.print("Digite um valor: ");
        int n = sc.nextInt();

        System.out.printf("O valor %d existe no array? ", n);
        System.out.println(valorExistente(n, arr));
    }

    public static boolean valorExistente(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }
}
