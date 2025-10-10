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

        // 4 - retorno em variável
        String r1 = verificarPar(numero3);
        String r2 = verificarPar(3);
        System.out.println(r1);
        System.out.println(r2);
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


    public static String verificarPar(int n){
        if(n % 2 == 0){
            return "O número " + n + "é par";
        }else{
            return "O número " + n + " não é par";
        }
    }
}


