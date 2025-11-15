package exe;

import java.util.Scanner;

public class ComparacaoDeStrings {
    public static void main(String[] args) {
        /*
         * Desenvolva um programa que leia duas strings do usuário e verifique se elas
         * são iguais.
         * Exiba uma mensagem informando o resultado da comparação.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma String: ");
        String string1 = scanner.nextLine();

        System.out.println("Digite outra String: ");
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("As strings são iguais: ");
        }else{
            System.out.println("As strings não são iguais");
        }

        scanner.close();

    }
}
