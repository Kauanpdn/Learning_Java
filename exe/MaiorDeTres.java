package exe;

import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        /*
         * Desenvolva um programa que leia três números inteiros e exiba o maior deles.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        int maiorValor = Math.max(num1, Math.max(num2, num3));

        System.out.println("O maior valor entre " + num1 + " , " + num2 + " , " + num3 + " é " + maiorValor);

        scanner.close();
    }
}
