import java.util.Scanner;

//25. Leia uma área em acres e converta para metros quadrados.
//Fórmula: M = A × 4048.58

public class ex25 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Área em Acres: ");
        double a = sc.nextDouble();
        double m = a * 4048.58;
        System.out.printf("%.2f acres equivalem a %.4f m²\n", a, m);
        sc.close();
    }
}