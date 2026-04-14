import java.util.Scanner;

//46. Leia um número de 3 dígitos e imprima-o invertido.

public class ex46 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de 3 dígitos: ");
        int n = sc.nextInt();

        int c = n / 100;
        int d = (n % 100) / 10;
        int u = n % 10;

        System.out.printf("Invertido: %d%d%d\n", u, d, c);
        sc.close();
    }
}