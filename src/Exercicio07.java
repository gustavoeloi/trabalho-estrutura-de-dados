import java.util.ArrayList;
import java.util.Arrays;

// Imprimir o menor valor de uma lista
public class Exercicio07 {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumeros = new ArrayList<>(Arrays.asList(5, 2, 3, 7, 8, 9));
        System.out.print("O menor numero dessa lista é " + menorNumero(listaDeNumeros));

    }

    public static int menorNumero(ArrayList<Integer> lista){
        int menorNumero = lista.get(0);
        for(int i = 1; i < lista.size(); i++){
            if(lista.get(i) < menorNumero){
                menorNumero = lista.get(i);
            }
        }
        return menorNumero;
    }

}
