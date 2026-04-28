import java.util.Scanner;

//37. Leia o valor de um produto e aplique 12% de desconto.

public class ex37 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor do produto: ");
        double valor = sc.nextDouble();
        double desconto = valor * 0.12;
        double finalValor = valor - desconto;
        System.out.printf("Valor com desconto: %.4f\n", finalValor);
        sc.close();
    }
}