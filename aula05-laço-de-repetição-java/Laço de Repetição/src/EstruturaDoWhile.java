public class EstruturaDoWhile {
    //do...While: Quando precisa executar pelo menos uma vez
    public static void main(String[] args) throws Exception {
        int vezes2 = 0;

        do{
            if(vezes2 % 2 == 0){
                System.out.println("Par (do-while): " + vezes2);
            }
            vezes2++;
        }
        
        while (vezes2 <= 10);
    
    }
}