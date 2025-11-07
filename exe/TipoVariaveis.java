package exe;

public class TipoVariaveis {
    static int variavelGlobal= 2 ; 
    public static void main(String[] args) {
        /*
         * Escreva um programa que declare variáveis locais e globais (dentro de uma
         * classe).
         * Inicialize e exiba o valor de ambas as variáveis no console.
         */
        System.out.println(variavelGlobal);

        int variavelLocal = 1;

        for(int i = 1; i <= variavelLocal; i++){
            System.out.println("No caso do for a variavel 'i' é local");
        }
    }
}
