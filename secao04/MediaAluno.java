package secao04;
import java.util.Scanner;

// Obter nome do aluno e 3 notas 
// Exibir mensagem com nome e médial final
// Bônus: se a nota for maior ou igual a 7, imprimar Aprovado, se não: Reprovado

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a primeira nota: ");
        int n1 = scanner.nextInt();

        System.out.println("Informe a segunda nota: ");
        int n2 = scanner.nextInt();

        System.out.println("Informe a terceira nota: ");
        int n3 = scanner.nextInt();

        scanner.close();

        int media =  (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println(nome + " você foi aprovado! seu média é " + media);
        }else{
            System.out.println(nome + " você foi reprovado! seu média é " + media);
        }

    }
}
