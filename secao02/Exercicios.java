package secao02;

public class Exercicios {
    {
        /*
         * Exercício 1:
         * Crie uma variável int para armazenar o valor 18;
         * Crie uma segunda variável int que armazene o dobre do valor da primeira
         * variável
         * usando operadores aritméticos
         * 
         * exiba o resultado
         * 
         * Exercício 2:
         * Declare uma variável char que armazene 'B';
         * Faça o casting explícito dessa variável para int e exiba o valor númerico correspondente
         * 
         * Exercício 3:
         * Declare duas variáveis double para armazena os valores 15.75 & 20.40;
         * Some os valores dessas variável e armazena o resultado em uma nova variável double;
         * exiba o resultado
         * 
         * Exercício 4:
         * Declare uma variável long para armazenar o número 2 bilhoões (2_000_000_000);
         * Em seguida, declare uma variável int e faça o casting explícito do valor long para int;
         * Exiba o resultado
         * 
         * Execício 5:
         * Escreva um programa que crie uma variável String com o valor "Olá, mundo";
         * Em seguida, crie outra variável String que concatena a primeira variável com o texto "Bem vindo ao Java"
         * Exiba o resultado
         */}


    public static void main(String[] args) {
        int a = 18;
        int res1 = a * 2;
        System.out.println(res1);

        char b = 'B';
        int res2 = (int) b;
        System.out.println(res2);

        double c = 15.75;
        double d = 20.40;    
        double res3 = c + d;
        System.out.println(res3);

        long e = 2_000_000_000L;
        int f = (int) e;
        System.out.println(f);

        String helloWorld = "Olá,mundo";
        String welcome = "Seja bem vindo ao java";
        System.out.println(helloWorld + " " + welcome);
    }

}
