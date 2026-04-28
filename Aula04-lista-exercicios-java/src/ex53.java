import java.util.Scanner;

//53. Calcule o custo para cercar um terreno:
//Entrada: comprimento (c), largura (l) e preço por metro (p)
//Fórmula: custo = 2 × (c + l) × p

public class ex53 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comprimento: ");
        double c = sc.nextDouble();
        System.out.println("Largura: ");
        double l = sc.nextDouble();
        System.out.println("Preço por metro: ");
        double p = sc.nextDouble();

        double custo = 2 * (c + l) * p;

        System.out.printf("Custo total: %.4f\n", custo);
        sc.close();
    }
}