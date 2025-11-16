
public class Constante {
    public static void main(String[] args) {
        /*
         * Exercício 6: Constantes
         * Crie um programa que utilize a palavra-chave final para declarar uma
         * constante que
         * representa a velocidade da luz no vácuo. Tente alterar o valor da constante e
         * observe o
         * comportamento do compilador.
         */

        final Long velocidadeDaLuz = 299792458L;
        System.out.println("Velocidade da luz no vácuo: " + velocidadeDaLuz + " m/s");

        // Não dá para alterar o valor da final a IDE acusa erro

    }
}
