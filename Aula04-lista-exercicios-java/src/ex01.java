import java.util.Scanner;

// 1. Faça um programa que leia um número inteiro e o imprima.

public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        System.out.println("O número digitado foi: " + num);

        sc.close(); 
    }
}