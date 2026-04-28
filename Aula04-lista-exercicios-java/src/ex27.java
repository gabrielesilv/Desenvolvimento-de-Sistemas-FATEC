import java.util.Scanner;

//27. Leia uma área em hectares e converta para metros quadrados.
//Fórmula: M = H × 10000

public class ex27 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Área em Hectares: ");
        double h = sc.nextDouble();
        double m = h * 10000;
        System.out.printf("%.2f hectares equivalem a %.4f m²\n", h, m);
        sc.close();
    }
}