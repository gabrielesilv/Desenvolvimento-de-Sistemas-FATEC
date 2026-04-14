import java.util.Scanner;

//52. Divida um prêmio proporcionalmente ao valor apostado por três amigos.

public class ex52 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor total do prêmio: ");
        double premio = sc.nextDouble();

        System.out.println("Aposta 1: ");
        double a1 = sc.nextDouble();
        System.out.println("Aposta 2: ");
        double a2 = sc.nextDouble();
        System.out.println("Aposta 3: ");
        double a3 = sc.nextDouble();

        double total = a1 + a2 + a3;

        double p1 = premio * (a1 / total);
        double p2 = premio * (a2 / total);
        double p3 = premio * (a3 / total);

        System.out.printf("1º: %.2f | 2º: %.2f | 3º: %.2f\n", p1, p2, p3);
        sc.close();
    }
}