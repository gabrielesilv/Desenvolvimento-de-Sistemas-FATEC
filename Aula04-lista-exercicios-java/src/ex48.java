import java.util.Scanner;

//48. Converta segundos em horas, minutos e segundos.

public class ex48 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Segundos: ");
        int total = sc.nextInt();

        int h = total / 3600;
        int m = (total % 3600) / 60;
        int s = total % 60;

        System.out.printf("%d:%d:%d\n", h, m, s);
        sc.close();
    }
}