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
         * 
         *              A classe Scanner
         * A classe Scanner é utilizada para ler a entrada de dados do usuário via console/terminal
         * Parte do pacote java.util: para usar o Scanaer, é necessário importar a classe do pacote java.util;
         * Scanner pode ler diferentes tipos de dados, como int,double,String, etc;
         * Métodos comuns:
         *          nextLine() lê uma linha inteira de texto 
         *          nextInt() lê um valor inteiro
         *          nextDouble() lê um valor decimal (ponto flutuante)
         *          next() lê uma única palavra 
         * 
         *              Fechamento de Scanner 
         * O Scanner consome recursos de entradda,como fluxo de dados do teclado;
         * Fechar o Scanner libera esses recursos, evitando problemas de perfomace;
         * Deixar o Scanner aberto pode causar vazamento de memória ou travamento;
         * close() é uma boa prática recomendada após a leitura dos dados;
         * O fechamento do Scannet ajuda a manter a aplicação eficiente e estável;
         * 
         *              Problema do nextLine
         * nextLine() lê a linha inteira até encontrar um Enter;
         * Problema ocorre ao usar nextLine() após nextInt(), nextDouble(),etc;
         * nextLine() captura o caractere  Enter remanescente, resultando em uma leitura vazia;
         * Isso faz o programa parecer "pular" a entrada de texto
         * Solução: adicionar um nextLine() extra após a leitura de números
         * 
         * 
         *             O que é boolean?
         *  boolean é um tipo de dado primitivo em java que pode armazenar apenas dois valores true or false;
         * Utilizado para controlar o fluxo de execução em estruturas de controle com if,while e for;
         * Suporta operadores lógicos como && (AND), || (OR), ! (NOT) para combinar e inverter valores booleanos;
         * Uma expressão booleana é qualquer expressão que resulta em um valor true or false;
         * Emobra seja representado como true ou false no código, internamente é tratado como 1 (true ) ou 0 (false);
         * 
         *          Operadores de comparação 
         *  == (igual a): Verifica se dois valores são iguais;
         *  != (Diferente de): Verifica se á dois valores são diferentes;
         *  > (Maior que): Verifica se o valor á esquerda é maior que o valor á direita;
         *  < (Menor que): Verifica se o valor á esquerda é menor que o valore da direita;
         *  >= (Maior ou igual a): Verifica se o valor `a esqueda é maior ou igual o valor `a direira;
         *  <= (Menor ou igual a): Verifica se o valor á esquerda é menor ou igual o valor a direira;
         * 
         *         Difernça entre comparação e atribuição 
         *  Atribuição (=):
         *          -Atribuit valor a uma variável;
         *          -Usado para defifnir ou altera o valor armazenado em uma variável;
         *          -Exemplo: int a = 5;
         * Comparação (==):
         *          -Compara dois valores para verificar se são iguais;
         *          -Retorna true sse os valores forem iguais e false se forem diferentes
         *          -Exemplo: 5==5 retorna true;
         * 
         *          Comparação de strings
         * Problema com == ;
         * O operador ==  compara as referências de memória. não o conteúdo das strings;
         * Pode retonrar false mesmo que o conteúdo das strigns seja igual, se referências forem diferentes;
         * Uso do método equals():
         * equals() compara o contéudo das strings, caractere:
         * É a maneira correta e segura de verificar se duas strigns são iguais em valor;
         * equalsIgnoreCase():
         * Variante de equals() que ignora diferenças e entre maiúscula e minúsculas;
         * 
         *          Estrutura de condição 
         *  if: Executa um bloco de código se a condição for verdadeira;
         *  else: Executa um bloco de código se alternativo se a condição if for falsa;
         *  else if: Verifica outra condição se as condições anteriores forem falsas;
         *  switch: Seleciona e executa um bloco de código entre várias opções com base no valor de uma expressão;
         *  Importante: Todas essas estruturas permitem controlar o fluxo de execução com base em condições lógicas
         * 
         *          Conhecendo o if 
         * if executa um bloco de código se a condição for verdadeira;
         * Coloque a condição entre parêntese após a palavra-chave if;
         * Uso comum: comparações lógicas ou arítméticas para tomar decisões no código;
         * Importante: O bloco de código dentro de if é delimitado por chves{};
         * 
         * 
         * 
         * 
         * 
         * 
         * */
        
        
        ;
    }
}
