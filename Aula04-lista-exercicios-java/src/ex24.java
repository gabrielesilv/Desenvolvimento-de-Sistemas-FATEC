import java.util.Scanner;

//24. Leia uma área em metros quadrados e converta para acres.
//Fórmula: A = M × 0.000247

public class ex24 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Área em metros quadrados: ");
        double m = sc.nextDouble();
        double a = m * 0.000247;
        System.out.printf("%.2f m² equivalem a %.4f acres\n", m, a);
        sc.close();
    }
}