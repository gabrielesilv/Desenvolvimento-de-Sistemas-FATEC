import java.util.Scanner;

//30. Leia um valor em reais e a cotação do dólar. Imprima o valor em dólares.

public class ex30 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor em Reais: ");
        double reais = sc.nextDouble();
        System.out.println("Cotação do Dólar: ");
        double cotacao = sc.nextDouble();
        double dolares = reais / cotacao;
        System.out.printf("R$ %.2f equivalem a %.4f dólares\n", reais, dolares);
        sc.close();
    }
}