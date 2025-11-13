package exe;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia dois números inteiros do usuário e exiba a soma,
         * subtração,
         * multiplicação, divisão e o módulo desses números no console.
         */

        Scanner scanner = new Scanner(System.in);
         // Pegar o número do usuário 
        System.out.println("Digite um número inteiro: ");
        int primeiroNumero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite outro número inteiro: ");
        int segundoNumero = scanner.nextInt();
        scanner.nextLine();

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        int divisao = primeiroNumero / segundoNumero;
        int modulo = primeiroNumero % segundoNumero;
        

        System.out.println("A soma de " + primeiroNumero + " + " + segundoNumero + " = " + soma );
        System.out.println("A subtração de " + primeiroNumero + " - " + segundoNumero + " = " + subtracao );
        System.out.println("A multiplicação de " + primeiroNumero + " * " + segundoNumero + " = " + multiplicacao );
        System.out.println("A divisão de " + primeiroNumero + " / " + segundoNumero + " = " + divisao );
        System.out.println("O módulo de " + primeiroNumero + " % " + segundoNumero + " = " + modulo );

        scanner.close();
    }
}
