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

        >Exercício 3: Função com if-else para verificar Paridade
        Crie uma função que receba um número inteiro
        E retorne uma String indicando se o número é "Par" ou "Impar"
        Use condicionais if-else para determinar a paridade.

        >Exercício 4: Função com switch para classificar notas
        Crie um função que receba uma nota de 0 a 10
        E retorne uma classificaçõa de letra (A,B,C,D,F) udando um switch
        sendo: 10 e 9 = A, 8 e 7 = B, 6 = C  5 = D, restante <= 4 = F
        Inclua uma verificação para garantir que a nota está dentro do intervalor válido

        >Exercício 5: Função com system.exit para verificar idade
        Crie um função que receba a idade de uma pessoa
        Se a idade for menor que 18, use System.exit(0)
        para encerrar o programa com uma mensagem de "Acesso negado";
        Caso contrário, exiba "Acesso permitido"

        >Exercício 5: (Desafio): Função que receba um array e retona o maior númeor
        Crie uma função que receba um array de inteiros e retorne o maior númeor no array.
        ultilizze um loop para percorrer os elementos do array e indetificar o maior valor.

    */
    public static void main(String[] args) {
        
        // Ex 1:
        double resEncapsulado = conversaoDeTemperatura(1);
        System.out.println(resEncapsulado);

        // Ex 2:
        int resFatorial = fatorial(5);
        System.out.println(resFatorial);

        // Ex 3:
        System.out.println(paridade(3));
        System.out.println(paridade(10));

        // Ex 4: 
        System.out.println(nota(10));
        System.out.println(nota(7));
        System.out.println(nota(6));
        System.out.println(nota(5));
        System.out.println(nota(3));
    
        // Ex 5:
        validadorIdade(20);
        validadorIdade(17);

        // Ex 6:
        int[] numeros = {10,4,22,5};
        System.out.println(array(numeros));
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

    public static String paridade(int n){
        if (n % 2 == 0 ) {
            return "O número " + n + " é Par";
        }else{
            return "O número " + n + " é Ímpar";
        }
    }

    public static String nota(int n){
            switch (n) {
                case 10:
                case 9:
                    return "A";
                case 8:
                case 7:
                    return "B";
                case 6:
                    return "C";
                case 5:
                    return "D";
                case 4:
                case 3:
                case 2:
                case 1:
                    return "F";
                default:
                    return "Número inválido!";
            }
    }

    public static void validadorIdade(int n){
        if (n < 18) {
            System.out.println("Acesso negado!");
            System.exit(0);
        }else{
            System.out.println("Acesso liberado !"); ;
        }
    }

    public static int array(int[] numeros){
        int maior = numeros[0];
        for (int i = 1; 1 < numeros.length; i++){
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
    
    
}
