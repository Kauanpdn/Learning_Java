package secao08;

public class Funcoes {
    public static void main(String[] args) {
        // 1 -> Criando a primeira função 
        saudacao("Kauan");

        // 2 -> parâmetros
        soma(10, 4);

        // 3 -> Return
        dobrar(3);

        int numero3 = 20;
        int numeroDobrado = dobrar(numero3);
        System.out.println("O numero dobrado é: " + numeroDobrado);
    }


    public static void saudacao(String nome){
        System.out.println("Olá, " +  nome + ", tudo bem?");
    }

    
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("O resultado da soma é: " + resultado);

    }

    public static int dobrar (int n){
        return n * 2;
    }
}


