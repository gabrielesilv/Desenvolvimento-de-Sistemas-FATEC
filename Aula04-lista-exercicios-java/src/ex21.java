import java.util.Scanner;

//21. Leia uma massa em libras e converta para quilogramas.
//Fórmula: K = L × 0.45

public class ex21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Massa em Libras: ");
        double l = sc.nextDouble();
        double k = l * 0.45;
        System.out.printf("%.2f libras equivalem a %.4f kg\n", l, k);
        sc.close();
    }
}