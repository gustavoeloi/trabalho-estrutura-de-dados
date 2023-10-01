import java.util.ArrayList;

// Crie um algoritmo de ordenação de lista
public class Exercicio09 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        ordenando(arr);

        System.out.println("Array ordenado; ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void ordenando(int[] arr)  {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move os elementos maiores que a chave para a direita
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insere a chave na posição correta
            arr[j + 1] = key;
    }

}}
