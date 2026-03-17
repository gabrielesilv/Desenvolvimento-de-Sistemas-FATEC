import java.util.Scanner;

//7. Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
//Fórmula: C = 5.0 × (F − 32.0) / 9.0

public class ex07 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Graus Fahrenheit: ");
        double f = sc.nextDouble();
        double c = 5.0 * (f - 32.0) / 9.0;
        System.out.printf("%.1f°F equivale a %.1f°C\n", f, c);
        sc.close(); 
    }
}
