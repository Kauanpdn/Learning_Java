package secao07_Classificacao_De_Produto;
import java.util.Scanner;

public class ClassificacaoProduto {
    /*
    Ter três produtos catalogados => nome
    Pedir o nome do produto
    Se sim, podemos escolher altera o preço ou não
        se alterar o preço, exibir classificação (abaixo)
        Se não alterar, Encerrar programa
    Se não, pedir o preçõ do produto
        exibir classificação
    Classificação preco < 50 = barato, 50 a 100 = moderado, maior que 100 = caro
    Exibir no fim nome do produto e preço
    */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String produto1 = "bolsa";
        String produto2 = "camisa";
        String produto3 = "calca";
        double preco = 0;

        System.out.println("Digite o nome do produto? ");
        String nomeProduto = scanner.nextLine();


        if (produto1.equals(nomeProduto) || produto2.equals(nomeProduto) || produto3.equals(nomeProduto)){
            System.out.println("Produto já existi. Quer atualizar o preço ? (sim/não)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                System.out.println("Insira o novo preço");
                preco = scanner.nextDouble();

            }else{
                System.out.println("Preço não atualizado");
                scanner.close();
                return;
            }
        }else{
            System.out.println("Insira o preço:");
            preco = scanner.nextDouble();
        }

        if (preco < 50) {
            System.out.println("Barato");
        }else if (preco >= 50 && preco <= 100) {
            System.out.println("Moderado");
        }else{
            System.out.println("Caro");
        }

        System.out.println("Produto: " + nomeProduto + ". Preço:" + preco);


        scanner.close();
    }
}
