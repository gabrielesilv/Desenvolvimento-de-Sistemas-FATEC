import java.util.Scanner;

//15. Leia um ângulo em radianos e apresente-o convertido em graus.
//Fórmula: G = R × 180 / π (π = 3.14)

public class ex15 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Angulo em Radianos: ");
        double r = sc.nextDouble();
        double g = r * 180 / 3.14;
        System.out.printf("%.2f equivale a $.4f graus\n", r, g);
        sc.close(); 
    }
}
