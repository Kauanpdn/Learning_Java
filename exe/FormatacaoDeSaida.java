package exe;

public class FormatacaoDeSaida {
    public static void main(String[] args) {
        /*
         * Desenvolva um programa que exiba o valor de uma variável double com duas
         * casas
         * decimais. Utilize formatação para garantir que o valor seja exibido
         * corretamente.
         */

        double valor = 5.9997999999;
        String formatar = String.format("%.2f", valor);
        System.out.printf(formatar);
    }
}
