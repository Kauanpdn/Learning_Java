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
    }
}
