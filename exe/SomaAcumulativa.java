import java.util.Scanner;

public class SomaAcumulativa {
    public static void main(String[] args) {
        /*
         * Enunciado: Desenvolva um programa que leia cinco números inteiros do usuário,
         * um por
         * vez, e acumule a soma deles usando o operador de atribuição +=. Exiba o total
         * acumulado
         * ao final.
         * Dica: Utilize o Scanner para pedir os dados, e você pode utilizar um loop for
         * para repetir a
         * solicitação de dados cinco vezes.
         */
        
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("-------------------");
            System.out.println("SOMA ACUMULAIVA");
            System.out.println("-------------------");

            System.out.println("Escolha uma das opções");
            System.out.println("1) ir para operação: ");
            System.out.println("2) sair: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Escolha o primeiro número: ");
                int num1 = scanner.nextInt();

                System.out.println("Escolha o segundo número: ");
                int num2 = scanner.nextInt();

                System.out.println("Escolha o terceiro número: ");
                int num3 = scanner.nextInt();

                System.out.println("Escolha o quarto número: ");
                int num4 = scanner.nextInt();

                System.out.println("Escolha o quinto número: ");
                int num5 = scanner.nextInt();

                int resultado = num1 += num2 += num3 += num4 += num5;

                System.out.println("A soma de todos os fica: " + resultado);
            }

        } while (opcao != 2);


        scanner.close();

    }
}
