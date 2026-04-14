import java.util.Scanner;

//31. Leia um número inteiro e imprima seu antecessor e sucessor.

public class ex31 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();
        System.out.printf("Antecessor: %d | Sucessor: %d\n", n - 1, n + 1);
        sc.close();
    }
}