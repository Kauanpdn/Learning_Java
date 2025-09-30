package secao00;

public class Documentacao {
    public static void main(String[] args) {
        // Anotação de todos os pontos e estudos sobre o java 

        /*
         * 
         *  
         *              STRINGS
         *  strings são sequencias de caracteres usadas para armazenar e manipular texto
         *  Classes String: Em Java, as Strings são objetos da classe String e oferecem métodos 
         *  para manipulação de texto.
         *  Uma string pode ser alterada, qualquer modificação gera uma nova string.
         *  Podemos concatenar (unir) duas strings com o operador + .
         * 
         *              Char
         *  Char é um tipo de dado primitivo que armazena um único caractere;
         *  O char pode armazenar qualquer caracter UNICODE, incluindo letras, números e símbolo
         *  Ocupa 2bytes de memória, permitindo armazenar 65.536 caracter diferente.
         * 
         *              Int 
         *  Int é um tipo de dado primitivvo ultilizando para armazenar númeors inteiros;
         *  Tamanho fixo: Ocupa 4bytes de memória
         *  Ideal para operações aritiméticas e contadores em loops;
         *              
         *              Long 
         * Long é tipo de dado primitivo usado para armazernar números inteiros muito grande;
         * Ocupa 8bytes de memória
         * Ideial para calculos financeiros, contagem de tempo, ou quando o tipo int não é suficiente 
         * Valores literais do tipo long devem ser seguidos por L (maiúsculo) para indicar o tipo;
         * O sublinhando pode ser usado para melhorar a legibilidade em números longos, separando grupos
         *  de dígitos (ex: 123_456_789_012_345L);
         * 
         *              Double
         *  Double é um tipo de dado primitivo usado para armazenar números de ponto flutuante (decimal) com dupla precisão;
         * Ocupar 8bytes de memória permitindo armazenar uma ampla gama de valores decimais 
         * Ideal para operações matempaticas que requerem precisão, como cálculos científico e finaceiros;
         * Valores literais podem ser seguidos por d ou D, embora nãõ seja obrigatório;
         * O sublinhado pode ser usado para separar grupos de dígitos em númeors longos para melhorar a legibilidade 
         * 
         *               Operadores aritmétricos
         * Adição (+): Soma de dois valores;
         * Subtração (-): Subtração de um valor pelo outro;
         * Multiplicação (*): Multiplicação de dois valores;
         * Divisão(/): Divisão de um valor pelo outro ;
         * Módulo (%): Resto da divisão de dois valores;
         * Icremento (++): invcrementa o valor de uma várialve em 1;
         * Decremento (--): Decrementa o valor de uma variável em 1;
         * Atribuição aditiva(+=): Subtrai e atribiu o resultado a uma variavel
         * 
         *              Type casting 
         * Casting implícito (widening): converte automaticamen te tipos menores para tipos maiores (por exemplo,int para long), sem perda de dados;
         * Casting explícito (narrowing): necessário quando se converte tipos maiores para tipos menores (por exemplo,double para int), podemos resultar em perda de dados;
         * Para realizar um casting explícito, é necessário especificar o tipo destino entre parêntese;           
         * 
         *              Constantes
         * final: Define uma variável como constante, impedindo que seu valor seja alterado após a inicialização;
         * Uma ves atribuído, o valor nõa pode ser modificado;
         * Boas práticas: Usando para valores que não devem mudar durante a execução do programa, como PI ou taxas de juros
         * Conversão de nnomes: Constantes geralmente são nomeadas em letras maiúsculas, com palavras separadas por sublinados(_);
         * 
         *              Inferência de tipo com var em Java
         * var: Introduzido no java 10, permite ao compilador inferir o tipo da variável com base no valor atribuido;
         * Reduz a necessidade de escrever tipos longos e complexos, aumentando a legibilidade do código;
         * Tipo estático: Embora o tipo seja inferido, ele é fico após a atrubuição e não pode ser alterado
         * Regras: deve ser inicializado no momento da declaração, e não pode ser usado para variável não inicializadas
         * Boas práticas: Útil para tipos complexos ou quando o tipo é óbivo a partir do contexto; 
         * */;
    }
}
