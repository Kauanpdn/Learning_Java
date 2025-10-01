package secao02;
import java.util.Scanner;

public class TestandoScanner {
    public static void main(String[] args) {
        
        // tesntado Scanner

        // chamando o scanner
        Scanner scanner = new Scanner(System.in);
        // mensagem que o usuário precisa digitar 
        System.out.println("Digite o seu nome");
        // guardando o valor digitado pelo usuario
        String nome = scanner.nextLine();
        // exibindo o valor 
        System.out.println("Olá " + nome + "!");
        

        System.out.println("Digite um número");
        int n1 = scanner.nextInt();
        scanner.nextInt();

        System.out.println("Digite o segundo número");
        int n2 = scanner.nextInt();
        scanner.nextInt();

        int soma = n1 + n2;

        System.out.println("O resultado da soma de " + n1 + " + " + n2 + " = " + soma );

    
        scanner.close();
    

    }
}
