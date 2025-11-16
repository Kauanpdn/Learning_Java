
import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        int n2 = sc.nextInt();

        int res = soma(n1, n2);
        System.out.println("O resultado da soma é: " + res);

        sc.close();
        
    }

    public static int soma(int a,int b){
        return a + b;
    }
}
