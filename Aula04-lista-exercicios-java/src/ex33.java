import java.util.Scanner;

//33. Leia o lado de um quadrado e calcule sua área.

public class ex33 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lado do quadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        System.out.printf("Área: %.4f\n", area);
        sc.close();
    }
}