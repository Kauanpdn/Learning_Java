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
         *          Explorando o else
         * else executa um bloco de código quando a condição do if é falsa;
         * Proporciona uma alternativa no fluxo de execução do programa;
         * Sintaxe: O bloco else vem logo após um bloco if;
         * Bloco único: Somente um bloco else pode seguir um if;
         * Importante: Sempre use {} para delimitar o bloco de código do else;
         * 
         *          Utilizando o else if
         * else if permite testar códigos adicionais após um if;
         * Sintaxe: Coloque a condição entre parênteses após a palavra-chave else if;
         * Uso comum: Qunado há várias condições mutuamente exclusivas;
         * Encadeamento: Vários blocos else if podem ser usados após um if;
         * Bloco final opcional: Pode ser seguindo de um else para lidar com qualquer caso não coberto;
         * 
         *          Operadores lógicos 
         *  && (E lógico): Retorna true se ambas as condições forem verdadeiras;
         *  || (OR lógico): Retorna true se pelo menos uma das condições for verdadeira;
         *  !(NÃO lógico): Inverte o valor lógico: retorna true se a condição for falsa e vice-versa;
         * Combinação: Pode combinar múltiplas condições em um única expressão lógica;
         * 
         *         Tabela verdade
         * A  tabela verdade simula todas as combinações possíveis dos operadores lógicos, e exibe oos resultados:
         * 
         *  P | Q | P AND Q   -----  P | Q | P OR Q   ------ P | Q | P NOT Q
         *  
         *  V | V | V         -----  V | V | V        ------ V | F 
         *  V | F | F         -----  V | F | V        ------ F | V
         *  F | V | F         -----  F | V | V        ------
         *  F | F | F         -----  F | F | F        ------
         *  
         *  * 
         * 
         *        Operador lógico AND (&&)
         * O operador && (AND  lógico) retorna true se ambas as condições forem verdadeiras;
         * Sintaxe: Condição1 && Condição2;
         * Curto-circuito: Se a primeira condição for false, a segunda condição não é avaliada;
         * Uso comum: Combinação de múltiplas condições que precisam ser verdadeiras ao mesmo tempo; 
         * 
         *      Operador lógico OR (||)
         * O operador || (OR lógico) retorna true se pelo menos uma das condições for verdadeira;
         * Sintaxe: Condição || Condição 2;
         * Curto-circuito: Se a primeira condição for true, a segunda condição não é avaliada;
        //  * Uso comum: Verificação de múltiplas condições onde apenas uma precisa ser verdadeira

         *      Operador lógico NOT (!)
         * O operador ! (NOT lógico) inverte o valor lógico de uma expressão
         * Sintaxe: ! seguindo da condição ou expressão;
         * Uso comum: Negar uma condição para tomar decisões baseadas no oposto;
         * Útil em validações: Verificar se uma condição é falsa, ao invés de verdadeira;
         * Combinação: pode ser combinado com outros operadores lógicos (&&,||) para criar expressões mais complexas;
         *
         *      Estrutua switch em java: case e break
         * switch: Estrutura de controle que permite escolher entre várias opções com base no valor de uma exprressão
         * case: Define uma possível opção ou caminho dentro do switch. Cada case é segudo por um valor específico que é comparado
         *      com a expressão do switch;
         * break: Utilizado para encerrar a execução de um bloco case. Evita que o cógido "caia" nos casos seguintes;
         * Importante: Cada case deve terminar com um break (ou outro comando de desvio) para evitar a execução de outros casos;
         * Valores exclusivos: Os valores em case devem ser excludivos e correspondentes ao tipo da expressão do switch;
         * 
         *      Estrutua switch em java: default
         * default: O bloco default é executado quando nenhum dos valores especificados nos case corresponde á expressão do switch
         * Opcional: O uso de default é opcional, mas recomendado para capturar todos os casos não previstos;
         * Posição: Normalmente é colocado no final do switch, mas pode aparecer em qualquer lugar dentro do bloco;
         * Sem brak becessário: Como default geralmente é o ultimo bloco, não é necessário usar break, mas pode ser incluído se o default não for o último;
         * Fornece um comportamento padrão ou uma mensagem de erro quando nenhum case específico é atendido;
         * 
         *      Switch sem breake
         * fall-through: Sem break, o switch continua executando os blocos subsequentes, mesmo que o caso correspondete já tenha sido encontrado;
         * Efeito inesperado: Pode levar à execução múltilpos casos,causando resultados inesperados;
         * Necessário break: Para interromper a execução após o bloco case correspondete evitando o efeito de fall-through;
         * Uso intecional: Em raros casos, o fall-thourgh pode ser usado intecionalmente, mas é menos comum ser break documantado;
         * Boa prática: Sempre incluir break para previnir comportamentos indesejados a emnos que o fall-through seja intencional;
         * 
         *      Quando Usar if vs switch
         * Usar if:
         *  -Ideal para expressões booleanas simples;
         *  -Perfeito para condições que envolvem operadores lógicos(&&,||) e comparação entre diferentes váriaveis;
         *  -Útil quando a condição depende de um intervalo de valores(ex: x > 10);
         *  -Útil para comparar objetos, strings com equals(), ou outras condições não númericas;
         * Usar switch:
         *  -Melhor para escolhher entre várias opções discretas baseadas em um único valor;
         *  -Ideal quando você está lidando com  um conjunto limitado de valores, como enumeração ou dias da semana;
         *  -Facilita a leitura e a manutenção há muitas opções (mais 3 ou 4 casos);
         *  -Funciona bem com expressões baseadas em inteiros, caractere,strign ou enums;
         * 
         *      Condicionais ternárias
         * Uma forma de compacta de expressar uma condição if-else;
         * Sintaxe: Condição ? expressão : expressão 2;
         * Funcionamento: Avalia a condição, se for verdadeira, retorna expressão 1,caso contrário,retorna expressão 2;
         * Ideal para atribuição simples e condições em linha;
         * Limitação: Dever ser usado apenas em expressões simples para manter a legibilidade;
         * 
         *      If e else aninhado 
         * Estrutura onde um if ou else contém outro bloco if-else
         * Uso comum: Para testar múltiplas condições que depedem umas das outras;
         * Útil para lidar com decisões complexas, mas pode prejudicar a legibilidade se usado em exesso;
         * Sintaxe: Blocos if e else podem conter outros if-else,criando um encadeamento de condições;
         * Boa prática: Matenha o código claro e evite encadeamnetos profundos;
         * 
         *      Precedência de Operadores lógicos
         * A ordem em que os operadores lógicos e de comparação são avaliados em uma expressão
         * Ordem de precedência:
         *      - 1 (): Parêntese têm maior precedência e são avaliados primeiro;
         *      - 2 !: Operador Not lógico tem a segunda maior precedência;
         *      - 3 &&: Operador And lógico é avaliado antes de ||;
         * '    - 4 ||: Operador Or lógico é avaliado por último:
         * Compreender a precedência evita erros lógiicos e garante que as expressões sejam avaliadas conforme esperado;
         * Uso de parênteses: Parênteses podem ser usados para alterar a ordem de avaliação melhorar a clareza do código;
         * 
         *      O que é uma função?
         * Um bloco de código que realiza uma tareda específica e pode ser chamada para ser executado;
         * Divide o código em partes menores, tornando-o  mais organizado e fácil de manter;
         * Permite reutilizar código em diferentes partes do programa sem precisar reescrever as mesmas instruções;
         * Parâmetro e retono: Pode receber dados de entrada (Parâmetros) e retornar um resultado após a execução;
         * As variáveis declaradas dentro de uma função são locais e não afetam o restante do programa;
         * 
         *      Criando a primeira função
         * Normalmente uma função Java é definida com um tipo de retorno, um nome e pode ou não receber parâmetros;
         * A função pode ser criada sem parãmetros e sem retorno, ideal para tarefas simples que não requer entrada ou saída;
         * Sintaxe Básica: Consiste em um cabeçalho que inclui o tipo de retorno (void para sem retorno) e o corpo da função, onde o código é executado;
         * Chamando a função: A função é invocada pelo seu nome, e o código dentro dela é executado sempre que chamada;
         * 
         *      Difernça entre a função main e outras funções
         * Função main:
         *  É o ponto de entrada do programa, onde a execusão começa:
         *  Deve ter a assinatura exta public static void main(String[] args);
         *  Todo programa java precisa de uma função main para ser executado;
         *  A função main pode chamar outras funçõçes e métodos dentro do programa;
         * Outras funções:
         *  Criadas para dividir o código em partes menores e genenciáveis
         *  Podem ter diferentes tipos de retorno, nomes e receber parãmentros;
         *  Podem ser chamadas várias vezes em diferentes partes do programa;
         * São executadas apenas chamadas pelo código, ao contrário do main qye é executado automaticamente; 
         * 
         *     Argumentos em funções
         * Dados que você passa para uma função ao chamá-lá, permintindo que a função processe informações específicas;
         * Parâmetros são variáveis definidas na assinatura da função para receber os argumentos;
         * Funções podem receber nenhum, um ou vários argumentos, dependendo da tarefa realizam;
         * Argumentos tornam as funções mais flexíveis e reutilizáveis em diferentes contextos com dados diferentes;
         * Tipos de argumentos: podem ser de qualquer tipo primitivo(int,double,etc) ou objetos;
         * 
         *     Uso do return em funções
         * Uma instrução que finaliza a execução de uma função e, opcionalmente, devolve um valor ao ponto onde a função foi chamada;
         * Finalização de função: Qunado o return é executado, a função para de executar, e o controle é devolvido ao chamador;
         * Tipos de retorno: O return pode retornar valores de qualquer tipo, incluindo tipos primitivos, objetoss, ou nehum valor(void):
         * O return permite que funções realizem cálculos ou operações e enviem o resultado de volta para ser utilizado em outras partes do programa;
         * 
         *      Funções com x sem retorno
         * Funçõez com retorno:
         * Permite que uma operação seja realizada e seu resultado seja utilizado em outras partes do programa;
         * Cálculo, validação, e operações que produzem um resultado necessário para outras funções ou partes do código;
         * Exemplo: Calcular a soma de dois números e retornar o resultado para ser exibido ou usado em outro cálculos;
         * Funções sem retorno:
         * Executem uma ação sem precisar devolver um resultaddo, ideal para tarefa como exibição de dados ou alterações diretas no estado do programa;
         * Exibir mensagem,modificar variáveis globais, ou realizar operações que não requerem um retorno:
         * Exmplo: Exibir uma mensagem de boas-vindas ou  atualizar o valor de uma variável de controle;
         * 
         *      Encapsulando retorno em variável
         * O processo de armazenar o resultado de um função em uma variável para uso posterior;
         * Permite reutilizar o valor retornado por um função em várias partes do código, aumentando a modularidade e a legibilidade;
         * Uso comum: Armazenar resultado de cálculos, verificação ou operações complexas para evitar chamadas repetidas á mesma função;
         * Encapsular o retorno em uma variávle pode ajudar a simplificar o código e reduzir a necessidade de executar a função;
         *  
         *      Funções com if/else e condicionais complexas
         * Estruturas de controle if/else dentro de funções permitem tomar decisões complexas baseadas em múltiplas condições;
         * Condicionais complexas: Permitem combinar múltiplas condições usando operadores lógicos (&&,||) e comparações para determinar o fluxo de execução;
         * Uso comum: Verficição de múltiplos critérios, tomadas de decisão em processos complexos e validações de entradas de usuários;   
         * Funções com if/else organizam e centralizam a lógica de decisão, tornando o código mais modular e fácil de manter;
         *
         *      Funções com switch
         * O swit h é uma estrutura de controle que permite a execução de diferentes blocos de código com base no valor de uma expressão;
         * O switch dentro de um função é útil quando há múltiplas condições discretas (casos) a serem verificadas,como valores inteiros, caaaracteres ou strings;
         * Benefícios: Simplifica a lógica quando comparado a múltiplos if-else, tornando o código mais organizado e fácil de entender;
         * Boa prática: Sempre incluir um default para tratar valores inesoerados ou casos não cobertos;
         *  
         *      Funções com System.exit
         * O que é System.exit:
         * O método System.exit(int status) encerra imediatamente a execução do programa, finalizando todas as operações em andamento;
         * O argumento int status indica o estado do término do programa, um valor de 0 geralmente indica uma saída bem-sucedida, enquanto valores diferentes de 0 indicam erros;
         * Como o System.exit termina o programa abruptamente, deve ser usado com cuidado normalmente em situações de erro crítico ou quando não há mais nada a ser feito;
         * Casos de uso:
         * Tratamento de erro: Em cenparios onde o programa não pode continuar devido a um erro crítico;
         * Interrupção controlada: Quando o programa atinge um estado em que deve ser encerrado imediatamente, como após confirmar a saída de usuário;
         *  
         *      Escopos em java
         * Escopo refere-ser á visibilidade e ao tempo de vida de variáveis e objetos dentro de um programa;
         * Escopo local: váriaveis declaradas dentro de métodos, blocos if,for, ou while só são acessíveis dentro desses blocos;
         * Escopo global: Váriaveis declaradas fora de métodos, mas dentro de uma classe, são acessíveis por todos os métodos dessa classe;
         * Escopo de parãmetro: parâmetro de função são tratados como variáveis locais dentro do escopo de função;
         * Encapsulamento: O escopo ajuda a proteger variáveis e métodos de acessos indesejados fora do seu contexto apropriado;
         * 
         *      O que são funções built-in java?
         * São funções já incorporadas na linguagem java que fornecem funcionalidades comuns e essenciais. Elas são prontas para uso e não precisam ser definidas pelo programador;
         * Estão disponíveis automaticamente sem necessidade de importação ou definição;
         * Para que servem: manipulação de strings, operaç~es matématicas, conversão de dados entre outras funcionalidades;
         * Geralmente, as funções built-in são altamente otimizadas para desempenho;
         * 
         *      Funções built-in de strings
         * length(): retorna o comprimento de uma string, ou seja, o número de caractere;
         * Substring( int beginlndex, int endlndex): Extrai uma subsequência da string, começando no índice beginlndex e terminando em enindex;
         * toUpperCase(): Converte todos os caracteres da string para letras maiúsculas;
         * replace(char oldChar, char newChar): Substitui todas as ocorrências de uma caratere especificado por outro ;
         * 
         *      Funções built-in de números (Math)
         * Math.sqet (double a): Calcula a raiz quadrada de um número; 
         * Math.pow (double a, double b): Eleva um númeor a à potência b;
         * Math.abs(int a): Retorna o valor absoluto de um número;
         * Math.max(int a, int b): Retonar o maior de dois númeors;
         * 
         *      Funções recursivas
         * Recursão é a técnica onde uma função chama a si mesma para resolver um problema que pode ser dividido em subproblemas menores e semelhantes ao original
         * Um caso base/cenário é essencial para terminar a recursão, sem ele, a função entraria em um loop infinito;
         * Como Funciona: O problema é dividido em subproblemas menores até atingir o caso base, após o qual a solução começa a ser contruída ao 
         * "subir" a pilha de chamadas;
         * Pode ser ineficienete em termos de tempo e memória, especialmente para problemas grandes, devido à sobrecarga de chamadas de função
         * 
         *      Sobrecarga de funções (method overloading)
         * Sobrecarga de funções permite definir várias funções com o mesmo nome, desde que tenham assinaturas diferentes(números ou tipo de parâmetros);
         * Vantagens:
         *      Permite criar diferentes versões de uma função para lidar com diferentes tipos de dados ou diferentes quantidades de argumentos;
         *      Mantém o código limpo e organizado, reutilizando o nome da função para tarefa relacionadas;
         * Regras para sobrecargas:
         *      Números de parâmetros: As funções devem defiri no númeor de parãmetros;
         *      Tipos de parâmetros: As funções podem ter o mesmo número de parãmetros, desde que o tipo sejam diferentes;
         *      Tipo de retorno: Não pode ser usado sozinho para diferenciar funções sobrecarreagadas;
         * 
         *      Funções anônimas (lambda expressions)
         * Lambdas são funções anônimas, ou seja, funções sem nome, que podem ser usadas para expressar brevemente pequenas operações ou blocos de código, especialmetne em programção funcional;
         * Introduzidas no java8, as lambdas são uma parte central da API Stream e permitem uma programação mais funcional;
         * Sintaxe: Formato: (parâmetros) -> {corpo da função}
         * Para expressões simples, o corpo da fução pode ser uma única çinha sem {}
         * Vantagens:
         *      Lambdas permitem escrever códigos mais conciso e legível 
         *      São amplamente utilizadas em conjuntos com streamas e interfaces funcionais com runna e comparator;
         * 
         *      Estrutura de repetição
         * O que são estruturas de repetição?
         * Estrutura de repetição, ou loops, são comandos que permitem a execução repetida de um bloco de código enquanto uma condição específica for verdadeira;
         * para que servem:
         *      Automatizar a execução de tarefas repetitivas, economizar tempo e esforço ao evitar a necessidade de escrever o mesmo código várias vezes;
         *      Permitem iterar sobre coleções de dados, realizar operações com número sequenciais, e processar entradas de forma eficiente;
         * As mais utilizadas:
         *      for: Ideal para quando se sabe o número exaro de interações a serem realizadas. Permite o controle de varáveis de início, condição de continuidade e incremento;
         *      while: Executa um bloco de código enquanto uma condição é verdadeira. Útil quando o número de interações não é conhecido antecipadamente 
         *      do-while: Similiar ao while, mas garante que o blobo de código seja executado pelo menos uma vez pois a condição é verificada após a execução
         * 
         *      Estrutura for
         * for é uma estrutura de repetição que permite executar um blobo de código um número determinado de vezes;
         * Ideal para quando se sabe o número exato de iterações;
         * Consiste em três partes: inicialização, condição e incrementos.
         * Oferece controle sobre o fluxo de repetição com variáveis de início e incremento;
         * 
         *      Estrutura de repetição while
         * while é uma estrutura de repetiçõa que executa um bloco de código repetidamente enquanto uma condiçõa específica for verdadeira;
         * Sintaxe: while(condição){bloco de código};
         * Execução contínua até que uma condição seja falsa, ideial para quando o número de iteraçõess não é conhecido antecipadamente;
         * 
         *      Loop infinito
         * Um loop infinito é uma estrutura de repetição que nunca termina, continuando a executar indefinidamente porque a condição de término nunca é atendida;
         * Causas comum: Condição de saída mai definida, ausência de incremento ou decremento de variáveis de controle;
         * Cuida: pode causar travamento do programa ou consumo execessivo de recursos exigindo atenção na implementação;
         * 
         *      Do while
         * do-while é uma estrura de repetição que garante que o bloco de código seja:
         *      executado pelo menos uma vez, verificando a condição após a execução
         * Sintaxe do{bloco de código} while(condição);
         * Ideal quando é necessário executar o código ao mesmo uma vez antes de verificar a condição;
         * 
         *      Break em loops 
         * break é uma instrução usada para interroper um loop imediatamente,mesmo que a condição de término original não tenha sido atingida;
         * Frequentemente usado para sair de loops antecepadamente quando uma condição específica é satisfeita;
         * Termina o loop atual e continua a execução do código após o loop;
         * 
         *      Continue me loops
         * Continue é uma instrução que interrompe a interação atual do loop e pula para a próxima, ignorando o restante do código dentro do bloco do loop para aquela iteração;
         * Usando para pular certas iterações quando uma condição específicada é atendida, sem interromper o loop completo;
         * Continua a execução do loop na próxima iteração, ignorando as instruções após o continue na interação atual;
         * 
         *      Nested loops
         * Nested loops ocorrem quando um loop é colocado dentro de outro loop, permitindo que o loop interno seja executado completamente para cada iteração do loop externo;
         * Frequentemente usados para manipulação de matrizes, tabelas e para iterar sobre estruturas de dados mais complexas;
         * Pode ser menos eficientes e mais complexos de enteder, exigindo cuidado para evitar loops infinitos ou comportamento inesperado;
         * 
         * */
        ;
    }
}
