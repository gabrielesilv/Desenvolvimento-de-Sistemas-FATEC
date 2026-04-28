import java.util.Scanner;

//50. Calcule o ano de nascimento com base na idade e no ano atual.

public class ex50 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Idade: ");
        int idade = sc.nextInt();
        System.out.println("Ano atual: ");
        int ano = sc.nextInt();
        int nasc = ano - idade;
        System.out.printf("Ano de nascimento: %d\n", nasc);
        sc.close();
    }
}