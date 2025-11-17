import java.util.Scanner;

class VerficandoAnoBixesto {
    public static void main(String[] args) {
        /*
         * Crie um programa que leia um ano e verifique se ele é bissexto. Um ano é
         * bissexto se for
         * divisível por 4, mas não por 100, exceto se for divisível por 400.
         */
        Scanner scanner = new Scanner(System.in);
        // pegando o ano
        System.out.println("Digite um ano: ");
        int ano  = scanner.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0 || ( ano % 400 == 0)){
            System.out.println(ano + " é  bissexto ");
        }else{
            System.out.println(ano + " não é  bissexto ");
        }
        
        scanner.close();
    }
}
