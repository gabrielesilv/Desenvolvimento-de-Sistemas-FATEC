import java.util.Scanner;

//44. Calcule quantos degraus são necessários para atingir uma altura desejada.

public class ex44 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura do degrau (em metros): ");
        double degrau = sc.nextDouble();
        System.out.println("Altura desejada (em metros): ");
        double altura = sc.nextDouble();
        int qtd = (int)(altura / degrau);
        System.out.printf("Quantidade de degraus: %d\n", qtd);
        sc.close();
    }
}