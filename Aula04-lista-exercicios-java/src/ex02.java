import java.util.Scanner;

// 2. Faça um programa que leia um número real e o imprima.

public class ex02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Digite um número real: ");
        double num = sc.nextDouble();
        System.out.println("O número digitado foi: " + num);

        sc.close(); 
    }
}


