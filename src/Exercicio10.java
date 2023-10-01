import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Desenvolver uma função para inverter o sentido de uma fila
public class Exercicio10 {

    public static Queue<Integer> inverterFila(Queue<Integer> filaOriginal){
        Stack<Integer> pilha = new Stack<>();

//       transferir elementos da filha original para a pilha
        while(!filaOriginal.isEmpty()){
            pilha.push(filaOriginal.poll());
        }

//       Criar uma nova fila para armazenar os elementos invertidos
        Queue<Integer> filaInvertida = new LinkedList<>();

//        transferir elementos da pilha para a fila invertida
        while(!pilha.isEmpty()){
            filaInvertida.offer(pilha.pop());
        }

        return filaInvertida;
    }

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        fila.offer(1);
        fila.offer(2);
        fila.offer(3);
        fila.offer(4);

        Queue<Integer> filaInvertida = inverterFila(fila);

        // Imprimir a fila invertida
        while (!filaInvertida.isEmpty()) {
            System.out.println(filaInvertida.poll());
        }
    }
}
