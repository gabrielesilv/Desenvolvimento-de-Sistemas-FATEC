import java.util.Scanner;

//13. Leia uma distância em quilômetros e apresente-a convertida em milhas.
//Fórmula: M = K / 1.61

public class ex13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Distância em Quilômetros: ");
        double k = sc.nextDouble();
        System.out.printf("%.2f km = %.2f milhas\n", k, (k / 1.61));
        sc.close(); 
    }
}
