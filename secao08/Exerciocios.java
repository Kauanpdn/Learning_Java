package secao08;

public class Exerciocios {

    /*
        >Exercício 1: Função Converter Temperatura
        Crie uma função que converta uma temperatura de celsius para fahrenheit
        A função deve receber a temperatura em celsius como argumento
        e retornar o valor correspondente em Fahrenheit
        Exiba o resultado encapsulado em uma variavel

        >Exercio 2: Função para calcular o fatorial de um número
        Crie uma função que calcule o fatorial de um númeor inteiro;
        Teste a função com um númeor de sua escolha;

    */
    public static void main(String[] args) {
        
        // Ex 1:
        double resEncapsulado = conversaoDeTemperatura(1);
        System.out.println(resEncapsulado);

        // Ex 2:
        int resFatorial = fatorial(5);
        System.out.println(resFatorial);
    }

    public static double conversaoDeTemperatura(double tempCelsius){
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        return tempFahrenheit;
    }

    public static int fatorial(int n){
        if (n == 0) {
            return 1;
        }else{
            return n * fatorial(n - 1);
        }
    }
}
