import java.util.Scanner;

//6. Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
//Fórmula: F = C × (9.0/5.0) + 32.0

public class ex06 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Graus Celsius: ");
        double c = sc.nextDouble();
        double f = c * (9.0 / 5.0) + 32.0;
        System.out.printf("%.1f°C equivale a %.1f°F\n", c, f);
        sc.close(); 
    }
}
