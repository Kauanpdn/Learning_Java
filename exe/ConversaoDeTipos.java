
public class ConversaoDeTipos {
    public static void main(String[] args) {
        /*
         * Exercício 4: Conversão de Tipos
         * Escreva um programa que converta um valor double em int e outro valor int em
         * double.
         * Exiba os resultados das conversões e explique a diferença entre conversão
         * explícita e
         * implícita.
         * Dica: procure por type casting em Java.
         */

        double n1 =  17.5;
        int conversaoDoN1 = (int)(n1);

        int myInt = 20;
        Long myLong = (long) myInt;

        System.out.println(conversaoDoN1);
        System.out.println(myLong);
    }
}
