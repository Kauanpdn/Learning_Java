package exe;

import java.util.Scanner;

public class ConversaoDeTemperaruta {
    public static void main(String[] args) {
        /*
         * Crie um programa que converta uma temperatura em graus Celsius para
         * Fahrenheit. A
         * fórmula de conversão é: F = (C * 9/5) + 32. Exiba o resultado no console.
         */
        Scanner scanner = new Scanner(System.in);
        // pegando a temperaura em celsius
        System.out.println("Digite a temperatura em °C : ");
        int celsius = scanner.nextInt();
        scanner.nextLine();

        // fazendo a conversão
        double fahrenheit = (celsius * 1.8) + 32;

        // exebindo o resultado na tela
        System.out.println("A conversão de " + celsius + "°C" + " para fahrenheit fica: " + fahrenheit + "°F");


        scanner.close();
    }
}
