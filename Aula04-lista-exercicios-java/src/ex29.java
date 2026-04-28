import java.util.Scanner;

//29. Leia quatro notas, calcule a média aritmética e imprima o resultado.

public class ex29 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quatro notas: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("A média é %.4f\n", media);
        sc.close();
    }
}