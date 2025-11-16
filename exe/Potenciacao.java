
import java.util.Scanner;

public class Potenciacao {
    public static void main(String[] args) {
        /*
         * Escreva um programa que leia dois números inteiros do usuário e exiba o
         * resultado da
         * potenciação do primeiro número elevado ao segundo número (use o método
         * Math.pow).
         * Dica: pow recebe dois argumentos, o primeiro a base e o segundo o expoente.
         */

        Scanner scanner =  new Scanner(System.in);
        // pegando os dados do usuário
        System.out.println("Digite o primeiro número: ");
        int base = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o segundo número");
        int expoente = scanner.nextInt();
        scanner.nextLine();

        double resultado = Math.pow(base, expoente);

        System.out.println("A potenciação entre " + base + " e " + expoente + " = " + resultado);

        scanner.close();
    }
}
