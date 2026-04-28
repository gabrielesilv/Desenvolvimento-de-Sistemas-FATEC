import java.util.Scanner;

//51. Leia coordenadas (x, y) e calcule a distância até (0, 0).
//Fórmula: d = √(x2 + y2)

public class ex51 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coordenada X: ");
        double x = sc.nextDouble();
        System.out.println("Coordenada Y: ");
        double y = sc.nextDouble();
        double d = Math.sqrt(x*x + y*y);
        System.out.printf("Distância: %.4f\n", d);
        sc.close();
    }
}