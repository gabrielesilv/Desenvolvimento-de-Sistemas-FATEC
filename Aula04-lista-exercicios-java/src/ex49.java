import java.util.Scanner;

//49. Calcule o horário final de um experimento (hora inicial + duração em segundos).

public class ex49 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hora inicial (0-23): ");
        int h = sc.nextInt();
        System.out.println("Minuto inicial: ");
        int m = sc.nextInt();
        System.out.println("Segundo inicial: ");
        int s = sc.nextInt();
        System.out.println("Duração em segundos: ");
        int dur = sc.nextInt();

        int total = h * 3600 + m * 60 + s + dur;

        int hf = (total / 3600) % 24;
        int mf = (total % 3600) / 60;
        int sf = total % 60;

        System.out.printf("Horário final: %d:%d:%d\n", hf, mf, sf);
        sc.close();
    }
}