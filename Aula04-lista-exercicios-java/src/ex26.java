import java.util.Scanner;

//26. Leia uma área em metros quadrados e converta para hectares.
//Fórmula: H = M × 0.0001

public class ex26 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Área em metros quadrados: ");
        double m = sc.nextDouble();
        double h = m * 0.0001;
        System.out.printf("%.2f m² equivalem a %.4f hectares\n", m, h);
        sc.close();
    }
}