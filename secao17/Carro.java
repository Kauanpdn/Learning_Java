package secao17;

public class Carro {
    
    // atributos ou prioridades
    String marca;
    String modelo;
    int ano;

    // métodos
    void acerelar(){
        System.out.println("Estamos acelerando o carro");
    }

    void exibirInfo(){
        System.out.println("Marca: " + marca + " , modelo: " + modelo + " , ano: " + ano);
    }
}
