import java.util.Scanner;

//45. Converta uma letra maiúscula para minúscula usando ASCII.

public class ex45 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Letra maiúscula: ");
        char letra = sc.next().charAt(0);
        char minuscula = (char)(letra + 32);
        System.out.printf("Minúscula: %c\n", minuscula);
        sc.close();
    }
}