import java.util.Scanner;

//19. Leia um volume em litros e converta para metros cúbicos.
//Fórmula: M = L / 1000

public class ex19 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Volume em Litros: ");
        double l = sc.nextDouble();
        double m = l / 1000;
        System.out.printf("%.2f litros equivalem a %.4f m³\n", l, m);
        sc.close();
    }
}