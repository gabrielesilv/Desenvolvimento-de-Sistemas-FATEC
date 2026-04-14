import java.util.Scanner;

//14. Leia um ângulo em graus e apresente-o convertido em radianos.
//Fórmula: R = G × π / 180 (π = 3.14)

public class ex14 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ângulo em Graus: ");
        double g = sc.nextDouble();
        double r = g * 3.14 / 180;
        System.out.printf("%.2f° equivale a %.4f radianos\n", g, r);
        sc.close(); 
    }
}
