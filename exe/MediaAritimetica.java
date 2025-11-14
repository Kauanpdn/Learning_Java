package exe;

import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args) {
        /*
         * Escreva um programa que leia três números inteiros do usuário e calcule a
         * média aritmética
         * deles. Exiba o resultado no console.
         */

        Scanner scanner = new Scanner(System.in);
        // pegando as notas do usuário
        System.out.println("Digite a primeira nota: ");
        double nota1 =  scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 =  scanner.nextDouble();
        

        System.out.println("Digite a terceira nota: ");
        double nota3  =  scanner.nextDouble();
        

        // fazendo a conta e atribuindo o resultado a uma variável
        double media = (nota1 + nota2 + nota3) / 3;

        // exibindo o resultado final
        System.out.println("Sua média final é: " + media);

        scanner.close();
    }
}
