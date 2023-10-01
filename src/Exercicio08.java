import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio08 {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>(Arrays.asList(2, 5, 9, 12, 24, 11));
        System.out.println("A soma de todos os elementos da lista é igual a " + somaLista(listaDeNumeros));
    }

    public static int somaLista(ArrayList<Integer> lista){
        int soma = 0;
        for(int i = 0; i < lista.size(); i++){
            soma += lista.get(i);
        }
        return soma;
    }

}
