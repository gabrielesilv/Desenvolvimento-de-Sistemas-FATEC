import java.util.Scanner;

//17. Leia um valor de comprimento em centímetros e apresente-o convertido em polegadas.
//Fórmula: P = C / 2.54

public class ex17 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor em Centímetros: ");
        double c = sc.nextDouble();
        double p = c / 2.54;
        System.out.printf("%.2f cm equivalem a %.4f polegadas\n", c, p);
        sc.close();
    }
}