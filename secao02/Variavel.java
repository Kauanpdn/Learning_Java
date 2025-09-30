package secao02;

public class Variavel {
    public static void main(String[] args) {
        // 1 -> o que são variável 
        // tipo -> atribuir valor
        String name = "Kauan";
        System.out.println(name);

        int n1 = 2 ;
        int n2 = 3;
        System.out.println(n1 + n2);

        // 2 -> atribuição de varaivel com outra
        String teste = "Teste";
        
        String testando = teste;
        System.out.println(testando);

        Long numeroGrande  = 9999999999999999L;
        System.out.println(numeroGrande);

        // CONCATENAÇÃO DE STRINGS COM O OPERADOR +
        String firstName = "Isa";
        String lastName = "Nascimento";
        System.out.println(firstName + " " + lastName);

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // 5 -> Char 
        char letra = 'M';
        System.out.println(letra);

        // 6 -> Int 
        int n = 42;
        System.out.println(n);
        System.out.println(n + 4);
        System.out.println(n / 2);

        int soma = n + 100;
        System.out.println(soma);

        // 7 -> Long 
        long populaçãoMundial = 78000000000000000L;
        System.out.println(populaçãoMundial);
        long grandeNumero = 100_000_000_000_000_0000L;
        System.err.println(grandeNumero);

        // 8 -> Double
        double preco = 19.99;
        System.out.println(preco);
        System.out.println(preco + 10);
        System.out.println(preco / 2);
        System.out.println(preco - 12);

        double pi = 3.147_592_123;
        System.out.println(pi);
        
        double doubleComD = 60.99D;
        System.out.println(doubleComD);

        // 9 -> Operadores aritmético
        System.out.println(50 + 50);
        System.out.println(100 - 2);
        System.out.println(2 * 10);
        System.out.println(500 / 2);
        System.out.println(10 % 4);

        // Para ter um número quebrado (1.5), pelo menos 1 númeoro da divisão tem que ser double 
        System.out.println(10.0 / 3); /*ex: 3.3333333333333335 */
        
        // 10 -> Operadores aritmético part 2 
        int a = 5;
        a++;
        System.out.println(a);
        
        int b = 5;
        a--;
        System.out.println(b);

        int c = 10;
        c += 5; //Ele ppega o primeiro valor dado e adiciona mais o valor indicado nessa linha 
        System.out.println(c); 

        int d = 10;
        d -= 5; //Ele pega o primeiro valor e subtrai por esse 
        System.out.println(d);

        System.out.println(c - d);

        // 11 -> Type Casting
        int numero2 = 42;
        long numeroLong = numero2;

        double numeroDouble = numero2;

        System.out.println(numeroLong);
        System.out.println(numeroDouble);

        // Explícito (narrowing)
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble;
        System.out.println(valorInt);

        char letraA = 'A';
        int codigoChar = (int) letraA;
        System.out.println(codigoChar);

        // 12 -> Constantes
        final int DIAS_DA_SEMANA = 7;
        System.out.println("Dias da semana:  " + DIAS_DA_SEMANA);

        // 13 -> Infência de tipos (var)
        var z = 10;
        System.out.println(z);

        z = 5;
        System.out.println(z);

        var text0 = "test";
        System.out.println(text0);
                

    }
}
