import java.util.Scanner;

//11. Leia uma velocidade em m/s e apresente-a convertida em km/h.
//Fórmula: K = M × 3.6

public class ex11 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Velocidade em m/s: ");
        double ms = sc.nextDouble();
        System.out.printf("%.2f m/s = %.2f km/h\n", ms, (ms * 3.6));
        sc.close(); 
    }
}
