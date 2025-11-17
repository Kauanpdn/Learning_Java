import java.util.Scanner;

public class VerificacaoDeNumerosPositivos {
    public static void main(String[] args) {
        /*
         * Escreva um programa que leia três números inteiros e verifique se pelo menos
         * dois deles
         * são positivos.
         */

        Scanner scanner = new Scanner(System.in);
        // pegando os números
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite outro número:  ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o último número: ");
        int num3 = scanner.nextInt();

        int verificandoPositivo = 0;


        if (num1 > 0 ) {verificandoPositivo++;}
        if (num2 > 0 ) {verificandoPositivo++;};
        if (num3 > 0 ) {verificandoPositivo++;}

        if (verificandoPositivo >= 2) {
            System.out.println("Pelo menos dois deles são positivos");
        }else{
            System.out.println("Nenhum deles é positivo");
        }


        scanner.close();
    }
}
