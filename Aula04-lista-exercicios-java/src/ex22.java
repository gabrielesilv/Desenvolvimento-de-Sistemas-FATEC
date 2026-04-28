import java.util.Scanner;

//22. Leia um comprimento em jardas e converta para metros.
//Fórmula: M = 0.91 × J

public class ex22 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comprimento em Jardas: ");
        double j = sc.nextDouble();
        double m = 0.91 * j;
        System.out.printf("%.2f jardas equivalem a %.4f metros\n", j, m);
        sc.close();
    }
}