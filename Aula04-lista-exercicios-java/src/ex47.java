import java.util.Scanner;

//47. Leia um número de 4 dígitos e imprima um dígito por linha.

public class ex47 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de 4 dígitos: ");
        int n = sc.nextInt();

        System.out.println(n / 1000);
        System.out.println((n % 1000) / 100);
        System.out.println((n % 100) / 10);
        System.out.println(n % 10);

        sc.close();
    }
}