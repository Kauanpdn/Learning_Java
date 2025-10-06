package secao05;

public class Ternario {
    public static void main(String[] args) {
        // 1 - Condicional Ternário
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(resultado);

        // 2 - if encadeado
        int idade = 25;
        boolean temCarteira = false;

        if (idade >= 18) {
            if (temCarteira) {
                System.out.println("Pode dirigir!");
            }else{
                System.out.println("Precisa ter a habilitação para dirigir");
            }
        }else{
            System.out.println("Você não pode dirigir");
        }

        // 3 - Precedência
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean resultado2 = a && b || c;
        System.out.println(resultado2);

        boolean resultado3 = a || b && c;
        System.out.println(resultado3);
    }
}
