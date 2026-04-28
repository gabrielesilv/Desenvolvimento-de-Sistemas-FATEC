import java.util.Scanner;

//40. Um encanador recebe R$ 30,00/dia. Calcule o salário líquido com desconto de 8%.

public class ex40 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dias trabalhados: ");
        int dias = sc.nextInt();
        double bruto = dias * 30;
        double liquido = bruto - (bruto * 0.08);
        System.out.printf("Salário líquido: %.4f\n", liquido);
        sc.close();
    }
}