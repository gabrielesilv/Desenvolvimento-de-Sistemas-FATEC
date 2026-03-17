import java.util.Scanner;

//5. Leia um número real e imprima a quinta parte desse número.

public class ex05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();
        System.out.println("A quinta parte é: " + (num / 5));
        sc.close(); 
    }
}
