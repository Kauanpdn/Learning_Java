import java.util.Scanner;
public class EligibilidadeParaVotar {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia a idade de uma pessoa e verifique se ela é elegível
         * para votar
         * (idade igual ou superior a 18 anos).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        if (idade >= 18) {
            System.out.println("Você com " + idade + " tem idade adequada para votar");
        }else{
            System.out.println("Você com " + idade + " não tem idade adequada para votar");
        }
        
        scanner.close();
    }
}
