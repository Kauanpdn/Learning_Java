package exe;
import java.util.Scanner;

public class AreaRetangular {
    public static void main(String[] args) {
        /*
         * Desenvolva um programa que leia a largura e a altura de um retângulo e
         * calcule a área.
         * Exiba o resultado no console.
         * 
         * Dica: area = largura x altura.
         */

        Scanner scanner =  new Scanner(System.in);
        // Pegando os dados
        System.out.println("-------------------------");
        System.out.println("Calculo da área. todos os dados fornecidos serão em M (metros)");
        
        System.out.println("Digite a altura: ");
        int largura = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a altura");
        int altura = scanner.nextInt();
        scanner.nextLine();

        int area = largura * altura;

        System.out.println("A área é: " + area + " m^2");
        
        
        scanner.close();
    }
}
