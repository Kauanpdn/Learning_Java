package secao08;

public class FuncoesBuiltIn {
    public static void main(String[] args) {
        // 10 - funções built in de string
        String frase = "Java é muito bom !";

        // length()
        System.out.println(frase.length());

        // substring()
        System.out.println(frase.substring(0, 4));

        // toUpperCase()
        System.out.println(frase.toUpperCase());

        // replaceAll()
        System.out.println(frase.replaceAll("a", "e"));

        // Funções Math

        // Math.sqrt();
        System.out.println(Math.sqrt(256));
        System.out.println(Math.sqrt(26));

        // Math.pow()
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, 50));

        // Math.abs()
        System.out.println(Math.abs(-30));
        System.out.println(Math.abs(30));

        // Math.max()
        System.out.println(Math.max(10, 20));
        System.out.println(Math.max(100, 20));
    }
}
