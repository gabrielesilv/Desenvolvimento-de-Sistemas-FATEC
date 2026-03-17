import java.util.Scanner;

//9. Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin.
//Fórmula: K = C + 273.15

public class ex09 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Celsius: ");
        double c = sc.nextDouble();
        System.out.printf("%.1f°C equivale a %.2fK\n", c, (c + 273.15));
        sc.close(); 
    }
}
