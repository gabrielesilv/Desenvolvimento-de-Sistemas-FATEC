import java.util.Scanner;

//23. Leia um comprimento em metros e converta para jardas.
//Fórmula: J = M / 0.91

public class ex23 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comprimento em Metros: ");
        double m = sc.nextDouble();
        double j = m / 0.91;
        System.out.printf("%.2f metros equivalem a %.4f jardas\n", m, j);
        sc.close();
    }
}