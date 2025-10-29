package secao12Calculadora;
import java.util.Scanner;;

/*
 *  Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subração
 * 
 *  1 - Pedir dois números para o usuário (double)
 *  2 - Apresentar uma tabela/texto para escolher a operação
 *  3 - Resgatar a operação que o usuário selecionou
 *  4 - Realiza o calculo
 *  5 - Exibar o resultado
 *  6 - Se a operação escolhida for inválida, exbida a mensagem de erro
 * 
*/

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Operações matématicas!");

            System.out.println("Digite o primeiro número: ");
            double n1 = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            double n2 = scanner.nextDouble();

            System.out.println("Escolha a operação");
            System.out.println(" 1 - Soma");
            System.out.println(" 2 - subtração");
            System.out.println(" 3 - Multiplicação");
            System.out.println(" 4 - Divisão");

            int escolha = scanner.nextInt();
            scanner.nextLine();

        } while (condition);


        scanner.close();

    }

    public static double soma(double a, double b){
            return a + b;
    }

    public static double subtracao(double a, double b){
            return a - b;
    }

    public static double multiplicacao(double a, double b){
            return a * b;
    }

    public static double divisao(double a, double b){
            return a / b;
    }
}
