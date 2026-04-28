import java.util.Scanner;

//38. Leia o salário e calcule o novo salário com aumento de 25%.

public class ex38 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salário: ");
        double salario = sc.nextDouble();
        double novo = salario + (salario * 0.25);
        System.out.printf("Novo salário: %.4f\n", novo);
        sc.close();
    }
}