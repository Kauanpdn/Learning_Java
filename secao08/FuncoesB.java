package secao08;

public class FuncoesB {

    // Escopo global
    static int globalVar = 20;
    public static void main(String[] args) {
        // 5 -> funções com condicionais
        String res = verificaAcesso(21, true, true);
        System.out.println(res);

        // 6 -> funções com switch
        String resSwitch = obeterDiaDaSemana(3);
        System.out.println(resSwitch);
        
        String resSwitch2 = obeterDiaDaSemana(8);
        System.out.println(resSwitch2);

        // 7 -> System.exit
        autenticacao("adim","1234");
        System.out.println("oi");

        // 8 - Documentando função
        calcularMedia(5, 6, 7);

        // 9 - Escopsos

        // local
        int localVar = 10;
        if (true) {
            System.out.println(localVar);
        }
        
        System.out.println(globalVar);
    }

    public static String verificaAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo){
        if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
            return "Acesso liberado! ";
        }else{
            return"Acesso negado";
        }
    }

    public static String obeterDiaDaSemana(int dia){
        switch (dia) {
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
        
            default:
                return "Nenhum dia selecionado";
        }
    }

    public static void autenticacao(String user, String senha){
        if (user.equals("adim") && senha.equals("1234")) {
            System.out.println("Autenticação falhou!");
            System.exit(1);
        }else{
            System.out.println("Autenticação bem-succedida!");
        }
    }
    
    /**
     * Calcula a média de três números inteiros
     * @param n1 o primeiro número a ser enviado
     * @param n2 o segundo número a ser enviado
     * @param n3 o terceiro número a ser enviado
     * @return á média dos três números
    */
    public static double calcularMedia(int n1, int n2, int n3){
        return (n1 + n2 + n3) / 3;
    }
}
