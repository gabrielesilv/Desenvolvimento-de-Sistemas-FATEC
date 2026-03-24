//While: quando não sabe quantas repetições

public class EstruturaWhile {
    public static void main(String[] args) throws Exception {
        int vezes = 0;

        while (vezes <= 10){
            if(vezes % 2 == 0){
                System.out.println("Par (while): " + vezes);
            }
            vezes++;
        }
    }
}