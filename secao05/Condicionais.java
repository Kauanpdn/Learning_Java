package secao05;

public class Condicionais {
    public static void main(String[] args) {
        // 1 -> boolean
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue);
        System.out.println(isFalse);

        // 2 -> operadores de comparação
        int x = 10;

        System.out.println( x == 10);

        System.out.println( x == 9);

        System.out.println( x != 5);

        System.out.println( x != 10);

        System.out.println( x > 10);

        System.out.println( x >= 10);

        System.out.println( x < 10);

        System.out.println( x <= 10);

        // 3 -> atribuição e comparação
        int n = 5;
        int m = 10;
        System.out.println(n == m );

        // 4 -> comparando as strigns

        String str1 = "Java";
        String str2 = new String( "Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        
        System.out.println(str1 == "Java");
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));

        // 5 -> conhecendo o if
        int numero = 10;

        // com base em uma comparação, eu executo algo
        if (numero > 5) {
            System.out.println("O número é maior que 5");
        }

        // if com strings
        String test = "Teste";
        if (test.equals("Teste")) {
            System.out.println("O texto é Teste");
        }

        // 6 -> else
        int q = 7;
        if (q > 10) {
            System.out.println("q é maior que 10");
        }else{
            System.out.println("Insira um número maior que 10");
        }
        // todo else precisa de um if, mas nem if precisa de um else

        if (test.equals("Teste2")) {
            System.out.println("O texto é Teste");
        }else{
            System.out.println("O texto não é igual");
        }

        // 7 -> else if
        double nota = 8.5;
        if (nota >= 9) {
            System.out.println("Nota muito boa");
        }else if(nota >=7){
                System.out.println("Acima da média");
        }else{
            System.out.println("Abaixo da média");
        }

        




    }
}
