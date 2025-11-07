package exe;

import java.util.Scanner;

public class StringsConcatenacao {
    public static void main(String[] args) {
        /*
         * Crie um programa que peça ao usuário para digitar seu nome e sobrenome. O
         * programa
         * deve exibir uma mensagem de boas-vindas concatenando o nome e o sobrenome do
         * usuário.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite um sobrenome");
        String midleName = scanner.nextLine();

        System.out.println("Olá! boas-vindas " + name + " " + midleName);

        scanner.close();
        
    }
}
