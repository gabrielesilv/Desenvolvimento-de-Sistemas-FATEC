import java.util.Scanner;

//20. Leia uma massa em quilogramas e converta para libras.
//Fórmula: L = K / 0.45

public class ex20 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massa em Quilogramas: ");
        double k = sc.nextDouble();
        double l = k / 0.45;
        System.out.printf("%.2f kg equivalem a %.4f libras\n", k, l);
        sc.close();
    }
}