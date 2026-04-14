import java.util.Scanner;

//12. Leia uma distância em milhas e apresente-a convertida em quilômetros.
//Fórmula: K = 1.61 × M

public class ex12 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Distância em Milhas: ");
        double m = sc.nextDouble();
        System.out.printf("%.2f milhas = %.2f km\n", m, (1.61 * m));
        sc.close(); 
    }
}
