import java.util.Scanner;

//16. Leia um valor de comprimento em polegadas e apresente-o convertido em centímetros.
//Fórmula: C = P × 2.54

public class ex16 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor em Polegadas: ");
        double p = sc.nextDouble();
        double c = p * 2.54;
        System.out.printf("%.2f polegadas equivalem a %.4f cm\n", p, c);
        sc.close();
    }
}