package secao05;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        // 8 - AND
        int idade = 18;
        boolean temCarteiraDeMotorista = true;
        
        // true == true
        System.out.println(idade >= 18 && temCarteiraDeMotorista);

        int a = 10;
        int b = 20;
        if (a > 5 && b > 10) {
            System.out.println("Deu certo");
        }

        // 9 -> OR
        boolean estaChovendo = true;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva);
        System.out.println(false || false);

        int idade2 = 16;
        boolean ehMembro = true;

        if (idade2 > 16 || ehMembro) {
            System.out.println("Você pode entrar");
        }else{
            System.out.println("Entrada negada");
        }

        // 10 -> NOT
        System.out.println(!estaChovendo);

        System.out.println(!estaChovendo || !temGuardaChuva);



    }
}
