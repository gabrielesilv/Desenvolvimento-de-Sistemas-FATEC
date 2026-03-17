import java.util.Scanner;

//8. Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius.
//Fórmula: C = K − 273.15

public class ex08 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Kelvin: ");
        double k = sc.nextDouble();
        System.out.printf("%.2fK equivale a %.2f°C\n", k, (k - 273.15));
        sc.close(); 
    }
}
