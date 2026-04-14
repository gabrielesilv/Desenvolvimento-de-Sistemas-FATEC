import java.util.Scanner;

//18. Leia um volume em metros cúbicos (m3) e converta para litros.
//Fórmula: L = 1000 × M

public class ex18 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Volume em metros cúbicos: ");
        double m = sc.nextDouble();
        double l = 1000 * m;
        System.out.printf("%.2f m³ equivalem a %.4f litros\n", m, l);
        sc.close();
    }
}