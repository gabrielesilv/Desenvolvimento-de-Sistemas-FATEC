import java.util.Scanner;

//35. Leia os catetos (a e b) de um triângulo e calcule a hipotenusa.
//Fórmula: h = √(a2 + b2)

public class ex35 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cateto A: ");
        double a = sc.nextDouble();
        System.out.println("Cateto B: ");
        double b = sc.nextDouble();
        double h = Math.sqrt(a*a + b*b);
        System.out.printf("Hipotenusa: %.4f\n", h);
        sc.close();
    }
}