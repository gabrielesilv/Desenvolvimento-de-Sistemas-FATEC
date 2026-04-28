import java.util.Scanner;

//34. Leia o raio de um círculo e calcule sua área.
//Fórmula: A = π × r2 (π = 3.141592)

public class ex34 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Raio do círculo: ");
        double r = sc.nextDouble();
        double area = 3.141592 * r * r;
        System.out.printf("Área: %.4f\n", area);
        sc.close();
    }
}