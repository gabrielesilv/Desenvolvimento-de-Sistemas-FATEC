import java.util.Scanner;

//3. Peça ao usuário para digitar três valores inteiros e imprima a soma deles.

public class ex03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite três números inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Soma: " + (n1 + n2 + n3));

        sc.close(); 
    }
}
