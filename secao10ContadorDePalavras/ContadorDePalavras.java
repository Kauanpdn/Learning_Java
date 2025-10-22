package secao10ContadorDePalavras;

import java.util.Scanner;;

/*
    Objetivo - criar um projeto que conta as palavras de uma frase
    1 - Obter uma frase do usuário
    2 - Contar as palavras da frase e exibir o resultado
    3 - Se sim, repetir lógica 1 e 2
    4 - Se não, encerrar programa
*/
public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Digite sua frase:");
            String texto = scanner.nextLine();

            System.out.println("Número de palavras: " + validacao(texto));

            System.out.println("Deseja digitar outra frase? (S/N)");
            continuar = scanner.nextLine();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static int validacao(String frase) {
        return (frase == null || frase.isEmpty() ? 0 : frase.trim().split("\\s+").length);
    }

}

/*
 * frase == null || frase.isEmpty() → garante que uma frase vazia ou nula
 * retorne 0.
 * replaceAll("[^\\p{L}\\p{N}]+", " ") → substitui qualquer caractere que não
 * seja letra ou número por espaço, removendo pontuação.
 * trim() → remove espaços extras no começo e no fim.
 * split("\\s+") → divide a frase em palavras pelo espaço.
 * length → retorna a quantidade de palavras.
 */