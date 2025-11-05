public class LoopsB {
    public static void main(String[] args) {
        // 8 - loops com rótulos

        // Rótulos externos e interno

        externo:
        for(int i; i < 3; i++){
            
            for(int k; k < 3; k++){
                if (i == 1 & k == 1) {
                    break externo;
                }
            }

            System.out.println("i " + i + "j " );
        }

    }
}
