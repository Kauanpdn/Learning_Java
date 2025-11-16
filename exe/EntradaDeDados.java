
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        /*
         * Escreva um programa que leia um número inteiro e um número decimal do teclado
         * e, em
         * seguida, exiba a soma desses números no console. 
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite um número decimal: ");
        double secondNumber = scanner.nextDouble();
        scanner.nextLine();

        double result = firstNumber + secondNumber;
        System.out.println("O resultado entre " + firstNumber + " + " + secondNumber + " = " + result);

        scanner.close();
    }
}
