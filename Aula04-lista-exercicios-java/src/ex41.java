import java.util.Scanner;

//41. Leia valor da hora e horas trabalhadas. Adicione 10% ao salário final.

public class ex41 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor da hora: ");
        double valorHora = sc.nextDouble();
        System.out.println("Horas trabalhadas: ");
        double horas = sc.nextDouble();
        double salario = valorHora * horas;
        double finalSalario = salario + (salario * 0.10);
        System.out.printf("Salário final: %.4f\n", finalSalario);
        sc.close();
    }
}