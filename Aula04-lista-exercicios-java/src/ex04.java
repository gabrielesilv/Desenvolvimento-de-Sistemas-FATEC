import java.util.Scanner;

//4. Leia um número real e imprima o resultado do quadrado desse número.

public class ex04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();
        System.out.println("O quadrado é: " + (num * num));
        sc.close(); 
    }
}
