package secao05;

import java.util.Scanner;

public class Exercicios {

    /*
     * >Exercício 1: verificação de categoria de preço
     * 
     * Peça ao usuário para inserir o preço de um produto;
     * Se o preço for menor que 50, categorize-o como "Barato";
     * Se estiver entre 50 e 100, categorize como "caro" exbiba a categoria
     * correspondente;
     * 
     * >Exercício 2: validação de login
     * Peça ao usuário para inserir um nome de usuário e uma senha;
     * Verifique se o nome de usuário é "admin" e a senha é "1234";
     * Se ambos forem corretos, exiba "Acesso permitido";
     * Caso contrário, exiba "Acesso negado";
     * 
     * >Exercício3: Identificação de pariedade com Strigs
     * Peça ao usuário para inserir um número;
     * Verifique se o número é par ou ímpar, e exiba a palavra "Par" ou "Impar";
     * Use uma string para armazenar o resultado e exibi-la;
     * 
     * >Exercício4:Identificação de dia útil
     * Peça ao usuário para inserir um número de 1 a 7;
     * Representando os dias da semana(1 para domingo,2 para segunda, etc...);
     * Use switch para verificar se o dia é um dia útil (segunda a sexta)
     * Ou final de semana( sábado e domingo)
     * Exiba uma mensagem correspondente
     * 
     * >Exercício 5: Verificação de Intervalo com AND
     * Peça ao usuário para inserir um número;
     * Verifique se o número está no intervalor de 10 a 20, inclusive.
     * Se estiver exiba "Dentro do intervalo." caso contrário, exiba
     * "Fora do intervalo"
     * 
     * >Exercício 6:Classificação de letra
     * Peça ao usuário para inserir uma letra
     * Verifique se a letra é vogal (a,e,i,o,u) ou consoante;
     * exbiba "Vogal" ou "consoante" de acordo com a entrada;
     * Considere tanto letras maísculas quanto minúsculas;
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do produto");
        int preco = scanner.nextInt();
        scanner.nextLine();
        if (preco <= 49) {
            System.out.println("O produto é barato");
        } else if (preco >= 50 && preco <= 100) {
            System.out.println("O produto é caro");
        }

        System.out.println("Insira o nome de usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Insira à senha:");
        int senha = scanner.nextInt();

        if (usuario.equals("admin") && senha == 1234) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        System.out.println("Digite um número");
        int numeroDigitado = scanner.nextInt();
        scanner.nextLine();
        String resultado;

        if (numeroDigitado % 2 == 0) {
            resultado = "Par";
            System.out.println("O número  " + numeroDigitado + " " + "é " + resultado);
        } else {
            resultado = "Ímpar";
            System.out.println("O número " + numeroDigitado + " " + "é " + resultado);
        }
        System.out.println("Digite um número entre 1 a 7");
        int vericadoX = scanner.nextInt();
        switch (vericadoX) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sebádo-feira, fim de semana");
                break;
            case 7:
                System.out.println("domigo-feira, fim de semana");
                break;

            default:
                System.out.println("Número digitado não foi solicitado/Erro");
                break;
        }

        System.out.println("Digite um número");
        int y = scanner.nextInt();
        scanner.nextLine();

        if (y >= 10 & y <= 20) {
            System.out.println(y + " Está dentro do Intevalo de 10 a 20");
        } else {
            System.out.println(y + " Não está dentro do Intervalo");
        }
        scanner.close();

        System.out.println("Insira uma letra");
        char letra = scanner.next().charAt(0);
        letra = Character.toLowerCase(letra);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("Vogal");
        } else if (Character.isLetter(letra)) {
            System.out.println("Consoante");
        } else {
            System.out.println("Não é uma letra válida!");
        }

    }
}
