import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        /*
            > Exercício 1: Somatório com for
            Crie um programa que use um loop para calcular
            o somatório dos números de 1 a 100 e exiba o resultado;

            > Exercício 2: Impressão de números pares com while
            Desenvolva um programa que use um loop while para imprimir
            Todos os números paras de 1 a 20;

            > Exercicio 3: Verificação do número primo com for
            Escreva um programa que receba um número do usuáro
            E use um loop for para verificar se ele é primo.

            > Exercício 4: Menu interativo com do-while
            Crie um programa que exiba um menu interativo usando do-while.
            Permitndo ao usuário escolher opções até que decida sair;
        */

        Scanner scanner = new Scanner(System.in);

        // Exercicio 1
        int  soma = 0;
        for(int i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.println(soma);

        // Exercicio 2
        int numero = 1;
        while ( numero <= 20 ) {

            if (numero % 2 == 0){
                System.out.println(numero);
            }

            numero++;
        }

        // System.out.println("Digite um número: ");
        // int n = scanner.nextInt();
        // boolean x = true;

        // if (n <= 1) {
        //     x = false;
        // }else{
        //         for(int i = 2; i < n; i++){
        //             if (n % i == 0) {
        //                 x = false;
        //                 break;
        //             }
        //         }
        // }

        // if (x) {
        //     System.out.println(n + " é um número primo!");
        // }else{
        //     System.out.println(n + " NÃO é um número primo.");
        // }


        int opcao;

        do {
            System.out.println("Exercício 4 - Menu");
            System.out.println("1) Hamburger");
            System.out.println("2) Cachorro quente");
            System.out.println("3) Pizza");
            System.out.println("4) Sair");

            opcao = (int)(Math.random() * 4);

            System.out.println("À opção escolhida foi " + opcao);
        } while (opcao != 3);



        scanner.close();
    }
}
