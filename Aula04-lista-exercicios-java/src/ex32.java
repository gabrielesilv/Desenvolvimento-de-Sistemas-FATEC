import java.util.Scanner;

//32. Leia um número inteiro e imprima a soma do sucessor do triplo com o antecessor do dobro.

public class ex32 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();
        int resultado = (3 * n + 1) + (2 * n - 1);
        System.out.printf("Resultado: %d\n", resultado);
        sc.close();
    }
}