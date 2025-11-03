package secao13JogoAdivinha;
import java.util.Scanner;
import java.util.Random;


public class JodoAdivinha {
    public static void main(String[] args) {
        /*
         * Objetivo: O usuário acertar um número aleatorio de 1 e 100.
         * 
         * 1 - Criar um número aleatorio
         * 2 - Pedir o palpie do usuário 
         * 3 - Salvar as tentativas que forem erradas (contagem)
         * 4 - Enquanto o usuário não acerta, exbibir se o número alvo pe maior ou menor que o palpite
         * 5 - exibir mensagem de sucesso se ele acertar, com contagem de tentativas
         * 
        */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0;

        while(palpite != numeroAleatorio){
            System.out.println("Digite o seu palpite: ");
            palpite = scanner.nextInt();
            scanner.nextLine();

            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + " tente novamente.");
            }else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que " + palpite + " tente novamente.");
            }else{
                System.out.println("Parabéns, você ganhou! O número secreto " + numeroAleatorio + " foi encontrado com " + tentativas + " tentativas");
            }
        }

        scanner.close();
    }

}
