import java.util.Scanner;

//42. Leia o salário-base.
//Gratificação: +5%
//Imposto: −7%

public class ex42 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salário base: ");
        double salario = sc.nextDouble();
        double grat = salario * 0.05;
        double imposto = salario * 0.07;
        double finalSalario = salario + grat - imposto;
        System.out.printf("Salário final: %.4f\n", finalSalario);
        sc.close();
    }
}