import java.util.Scanner;

//43. Para vendas:
//À vista: 10% de desconto
//Parcelado (3x): sem juros
//Comissão à vista: 5% sobre valor com desconto
//Comissão parcelada: 5% sobre valor total

public class ex43 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor do produto: ");
        double valor = sc.nextDouble();

        double vista = valor - (valor * 0.10);
        double comissaoVista = vista * 0.05;

        double parcelado = valor;
        double parcela = valor / 3;
        double comissaoParcelado = valor * 0.05;

        System.out.printf("À vista: %.2f | Comissão: %.2f\n", vista, comissaoVista);
        System.out.printf("Parcelado (3x): %.2f | Parcela: %.2f | Comissão: %.2f\n", parcelado, parcela, comissaoParcelado);

        sc.close();
    }
}