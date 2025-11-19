package secao17;

public class Poo {
    public static void main(String[] args) {
         // 1 - criat clsse
    // criação de Carro.java

    // 2 - instanciar a classe
    Carro fusca = new Carro();

    // Acessar props e métodos sintaxe
    // NOMEOBJETO.PROP E NOMEOBJETO.METODO()
    fusca.marca = "W";
    fusca.modelo = "Fusca";
    fusca.ano = 1964;

    fusca.acerelar();
    fusca.exibirInfo();

    Carro carro2 = new Carro();
    carro2.marca = "fiat";
    carro2.exibirInfo();
    }
}
