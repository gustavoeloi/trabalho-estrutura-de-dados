import java.util.Scanner;

public class Exercicio01 {
    //Fazer um código para que o usuário informe um número N e você leia
    //N números e depois imprima eles na ordem inversa da que foram
    //informados.
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Quantos números serão digitados? ");
       int[] n = new int[sc.nextInt()];

       for(int i = 0; i < n.length; i++){
           System.out.printf("Digite o %d°: ", i + 1);
           n[i] = sc.nextInt();
       }

       System.out.println("Números ao contrário");
       for(int i = n.length - 1; i >= 0; i--){
           System.out.print(n[i]);
       }
    }
}