import java.util.Scanner;

public class ComparacaoSimples {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia dois números inteiros e exiba se o primeiro é
         * maior, menor ou
         * igual ao segundo.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o segundo número");
        int segundoNumero = scanner.nextInt();
        scanner.nextLine();

        if (primeiroNumero > segundoNumero) {
            System.out.println(primeiroNumero + " é maior que " + segundoNumero);
        }
        else if (primeiroNumero < segundoNumero) {
            System.out.println(primeiroNumero + " é menor que " + segundoNumero);
        }
        else {
            System.out.println(primeiroNumero + " é igual a " + segundoNumero);
        }

        scanner.close();
    }
}
