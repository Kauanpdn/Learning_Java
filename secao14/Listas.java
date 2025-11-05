package secao14;

public class Listas {
    public static void main(String[] args) {
        //  1 - sintaxe
        int[] numeros = {1,2,3,4,5,6,7,8};
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);

        // Tamanho fixo, só que vazio
        String[] frutas = new String[3];
        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Mamão";
        System.out.println(frutas[0]);

        double[] precos = {1.99,2.00,1.75};
        precos[2] = 5;
        System.out.println(precos[2]);

        // 2 - loops em arrays

        // somar todos os elementos de um array
        int soma = 0;
        for(int i = 0; i < numeros.length; i++ ){
            soma += numeros[i];
        }

        System.out.println("Soma dos elementos " + soma);

        // for each
        for (String fruta : frutas) {
            System.out.println("A fruta da vez: " + fruta);
        }

        // encontrando o maior valor de um array
        int[] valores = {10,25,8,22,1};
        int maiorValor = valores[0];
        int j = 0;

        while (j < valores.length) {
            if (valores[j] > maiorValor) {
                maiorValor = valores[j];
            }

            j++;
        }
        System.out.println("O maior valor é: " + maiorValor);

        // For-each 
        for(int numero : numeros ){
            System.out.println(numero);
        }

        // Concatenar elementos de um array
        String[] palavras = {"Java ", " é ", " bom "};
        String frase = " ";
        for (String palavra : palavras) {
            frase += palavra;
        }
        System.out.println(frase);

        // verificar se valor esta presente em array
        char[] letras = {'a','e','i','o','u'};
        char letraProcurada = 'i';
        
        for (char letra : letras) {
            if (letra == letraProcurada) {
                System.out.println("Encontramos a letra " + letra);
            }
        }
    }
}
