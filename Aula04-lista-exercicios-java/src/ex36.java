import java.util.Scanner;

//36. Leia altura e raio de um cilindro e calcule seu volume.
//Fórmula: V = π × r2 × h

public class ex36 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Raio do cilindro: ");
        double r = sc.nextDouble();
        System.out.println("Altura do cilindro: ");
        double h = sc.nextDouble();
        double v = 3.141592 * r * r * h;
        System.out.printf("Volume: %.4f\n", v);
        sc.close();
    }
}