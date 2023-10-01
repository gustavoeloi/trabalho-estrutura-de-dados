import java.util.ArrayList;
import java.util.Scanner;
//Fazer um código, usando listas, para ler números até que o usuário
//digite -1. Após isso imprimir todos os números na ordem inversa
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        while(n != -1){
            listaNumeros.add(n);
            System.out.print("Digite um número: ");
            n = sc.nextInt();
        }

        System.out.println(listaInvertida(listaNumeros));

        sc.close();
    }

    public static ArrayList<Integer> listaInvertida(ArrayList<Integer> lista){
        ArrayList<Integer> resultadoLista = new ArrayList<>();
        for(int i = lista.size() - 1; i >= 0; i--){
            resultadoLista.add(lista.get(i));
        }
        return resultadoLista;
    }

}
