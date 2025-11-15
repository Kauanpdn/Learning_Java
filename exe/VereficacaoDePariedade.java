package exe;
import java.util.Scanner;

public class VereficacaoDePariedade {
    public static void main(String[] args) {
        /*
         * Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
         * Dica: Você pode utilizar a divisão de resto, com o operador %.
         */ 
        Scanner scanner =  new Scanner(System.in);
        
        // pegando o valor do usuario
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        }else{
            System.out.println(numero + " é ímpar");
        }
        
        scanner.close();

    }
}
