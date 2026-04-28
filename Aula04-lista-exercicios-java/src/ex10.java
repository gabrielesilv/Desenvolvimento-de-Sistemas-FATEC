import java.util.Scanner;

//10. Leia uma velocidade em km/h e apresente-a convertida em m/s.
//Fórmula: M = K / 3.6

public class ex10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Velocidade em km/h: ");
        double kmh = sc.nextDouble();
        System.out.printf("%.2f km/h = %.2f m/s\n", kmh, (kmh / 3.6));
        sc.close(); 
    }
}
