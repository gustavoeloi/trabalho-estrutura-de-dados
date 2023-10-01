public class Exercicio05 {

    public static void quickSort(int[] arr, int menor, int maior){
        if(menor < maior) {
//          Primeiro passo é escolher o pivô
            int pivo = particao(arr, menor, maior);

//          Segundo passo é fazer a recursão à esquerda do pivô.
            quickSort(arr, menor, pivo - 1);
//          Terceiro passo é fazer a recursão à direita do pivô.
            quickSort(arr, pivo + 1, maior);
        }
    }

    public static int particao(int[] arr, int menor, int maior) {
        // Escolhendo o pivô como o elemento mais à direita.
        int pivo = arr[maior];

        // Inicializando um índice i para a posição antes da primeira posição do array.
        int i = menor - 1;

        for (int j = menor; j < maior; j++) {
            if(arr[j] < pivo){
                i++;
                // Troca o arr[i] e arr[j] para mover elementos menores à esquerda
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Troca arr[i+1] e arr[maior] (o pivô)
        int temp = arr[i + 1];
        arr[i + 1] = arr[maior];
        arr[maior] = temp;

        return  i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Chamando quickSort para ordenar o array
        quickSort(arr, 0, n - 1);

        // Imprimindo o array ordenado
        System.out.println("Array ordenado:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}