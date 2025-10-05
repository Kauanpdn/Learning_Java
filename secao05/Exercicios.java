package secao05;
import java.util.Scanner;
public class Exercicios {
    
    /* >Exercício 1: verificação de categoria de preço
        
        Peça ao usuário para inserir o preço de um produto;
        Se o preço for menor que 50, categorize-o como "Barato";
        Se estiver entre 50 e 100, categorize como "caro" exbiba a categoria correspondente;

        >Exercício 2: validação de login
        Peça ao usuário para inserir um nome de usuário e uma senha;
        Verifique se o nome de usuário é "admin" e a senha é "1234";
        Se ambos forem corretos, exiba "Acesso permitido";
        Caso contrário, exiba "Acesso negado";
    */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o valor do produto");
        int preco = scanner.nextInt();
        scanner.nextLine();
        if (preco <= 49) {
            System.out.println("O produto é barato");
        }else if (preco >= 50 && preco <= 100) {
            System.out.println("O produto é caro");
        }

    
        System.out.println("Insira o nome de usuário:");
        String usuario = scanner.nextLine();
        

        System.out.println("Insira à senha:");
        int senha = scanner.nextInt();

        if (usuario.equals("admin") && senha == 1234) {
            System.out.println("Acesso permitido!");
        }else{
            System.out.println("Acesso negado!");
        }

        scanner.close();


    }
}
