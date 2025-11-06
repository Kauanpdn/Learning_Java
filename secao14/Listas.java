package secao14;
import java.util.Arrays;

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

        // 4 - loops com if
        // filtar e somar numeros pares
        int somaPares = 0;
        for(int numero : numeros){
            if (numero % 2 == 0) {
                somaPares += numero;
            }
        }
        System.out.println("Soma pares: " + somaPares);

        // Exibit valores que um determinado valor
        int[] nums = {12,6,18,24,48,5};
        int limite = 10;

        for(int i = 0; i < nums.length; i++){
            
            if (nums[i] > limite) {
                System.out.println("Número maior encontrado " + nums[i]);
            }
        }

        String[] linguagens = {"Java","C","Python","Php"};
        String linguagemAlvo = "Python";

        for(String linguagem : linguagens){
            if (linguagemAlvo == linguagem) {
                System.out.println("Linguagem encontrada! parando o loop");
                break;
            }else{
                System.out.println("Linguagem ainda não encontrada!");
            }
        }

        // 5 - atualização de valores
        for(int i = 0; i < numeros.length; i++ ){
            numeros[i] *= 2;
        }
        System.out.println(numeros[1]);

        for (int numero : numeros) {
            System.out.println("Números dobrados " + numero);
        }

        numeros[5] = 1;
        System.out.println(numeros[5]);

        for (int i = 0; i < frutas.length; i++ ) {
            if (frutas[i].equalsIgnoreCase("Maçã")) {
                frutas[i] = "abacate";
            }
        }
        System.out.println(frutas[0]);

        // 6 - método toString 
        // classe no java, que vão ter métodos utilitatios, o array é uma delas
        String dadosNumeros = Arrays.toString(numeros);
        System.out.println(dadosNumeros);

        String dadosFrutas = Arrays.toString(frutas);
        System.out.println(dadosFrutas);
        


    }
}
