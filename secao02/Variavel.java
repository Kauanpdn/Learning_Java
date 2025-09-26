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
    }
}
