import java.util.Scanner;

public class VerificacaoDeMaioria {
    public static void main(String[] args) {
        /*
         * Escreva um programa que leia a idade de três pessoas e verifique se pelo
         * menos duas
         * delas são maiores de idade (18 anos ou mais).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira idade: ");
        int idade1 = sc.nextInt();

        System.out.println("Digite a segunda idade: ");
        int idade2  = sc.nextInt();

        System.out.println("Digite a terceira idade: ");
        int idade3 = sc.nextInt();

        int maiorIdade = 0;

        if (idade1 >= 18) {maiorIdade++;}
        if (idade2 >= 18) {maiorIdade++;}
        if (idade3 >= 18) {maiorIdade++;}

        if (maiorIdade >=2) {
            System.out.println("Pelo menos dois deles são maiores de idade");
        }else{
            System.out.println("Menos de duas pessoas são maiores de idade!");
        }
        sc.close();
    }
}
