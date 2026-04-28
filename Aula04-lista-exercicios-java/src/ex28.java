import java.util.Scanner;

//28. Leia três valores e apresente a soma dos quadrados deles.

public class ex28 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três valores: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double soma = (a*a) + (b*b) + (c*c);
        System.out.printf("A soma dos quadrados é %.4f\n", soma);
        sc.close();
    }
}