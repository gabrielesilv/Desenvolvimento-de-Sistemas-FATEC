//39. Divida R$ 780.000,00 entre três ganhadores:
//1o: 46%
//2o: 32%
//3o: restante

public class ex39 {
    public static void main(String[] args) throws Exception {
        double total = 780000;
        double p1 = total * 0.46;
        double p2 = total * 0.32;
        double p3 = total - (p1 + p2);
        System.out.printf("1º: %.2f | 2º: %.2f | 3º: %.2f\n", p1, p2, p3);
    }
}