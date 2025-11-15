package exe;
import java.util.Scanner;

public class VerificandoIntervalo {
    public static void main(String[] args) {
        /*
         * Escreva um programa que leia um número inteiro e verifique se ele está entre
         * 10 e 20
         * (inclusive). Exiba uma mensagem informando se o número está dentro ou fora do
         * intervalo.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um um número: ");
        int num = scanner.nextInt();

        if (num >= 10 && num <=20) {
            System.out.println(num + " está dento do intervalo entre 10 e 20");
        }else{
            System.out.println(num + " não está dento do intervalo entre 10 e 20");
        }
        
        scanner.close();
        
    }
}
