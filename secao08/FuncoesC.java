package secao08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    public static void main(String[] args) {
        // 12 -Função recursiva
        int soma = somaRecursiva(6);
        System.out.println(soma);

        // 13 - overloand
        System.out.println(soma);

        System.out.println(soma(2,4));
        System.out.println(soma(2,4,6));
        System.out.println(soma(2.2,4.4));

        // 14 - Funções anônimas
        Runnable tarefa = () -> System.out.println("Minha função anonima");
        tarefa.run();

        List<String> nome = Arrays.asList("ana","pedro","paulo"); 
        nome.forEach(nomes -> System.out.println(nomes));
    }

    public static int somaRecursiva(int n){
        if(n == 1){
            return 1;
        }else{
            return n + somaRecursiva(n - 1 );
        }
    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static int soma(int a, int b, int c){
        return a + b + c;
    }

    public static double soma(double a, double b){
        return a + b ;
    }
}
