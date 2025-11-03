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
                int escolha;

                do {
                        System.out.println("------------------------------------");
                        System.out.println("Operações matématicas!");
                        System.out.println("Escolha a operação");
                        System.out.println(" 1 - Soma");
                        System.out.println(" 2 - subtração");
                        System.out.println(" 3 - Multiplicação");
                        System.out.println(" 4 - Divisão");
                        System.out.println(" 5 - Sair");
                        System.out.println("------------------------------------");

                        escolha = scanner.nextInt();
                        scanner.nextLine();

                        if (escolha == 5) {
                                System.out.println("Encerrando a calculadora");
                                break;
                        }

                        if (escolha < 1 || escolha > 5) {
                                System.out.println("Opção inválida");
                                break;
                        }

                        System.out.println("Digite o primeiro número: ");
                        double n1 = scanner.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        double n2 = scanner.nextDouble();

                        if (escolha == 1) {
                                double res = soma(n1, n2);
                                System.out.println("O resultado de  " + n1  + " + " +  n2 + " = " + res);
                        }else if(escolha == 2){
                                double res = subtracao(n1, n2);
                                System.out.println("O resultado de  " + n1  + " - " +  n2 + " = " + res);
                        }else if(escolha == 3){
                                double res = multiplicacao(n1, n2);
                                System.out.println("O resultado de  " + n1  + " * " +  n2 + " = " + res);
                        }else if(escolha == 4){
                                if (n2 == 0) {
                                        System.out.println("Não dá para fazer divisão por 0 ");
                                }else{
                                        double res = divisao(n1, n2);
                                        System.out.println("O resultado de  " + n1  + " / " +  n2 + " = " + res);
                                }
                        }

                } while (escolha != 5);

                scanner.close();
                System.out.println("Programa finalizado!");
        
}

        public static double soma(double a, double b) {
                return a + b;
        }

        public static double subtracao(double a, double b) {
                return a - b;
        }

        public static double multiplicacao(double a, double b) {
                return a * b;
        }

        public static double divisao(double a, double b) {
                return a / b;
        }
}
