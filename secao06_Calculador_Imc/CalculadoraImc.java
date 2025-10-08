package secao06_Calculador_Imc;
import java.util.Scanner;

public class CalculadoraImc {

    /**
        1 -> Pedir peso em kg 
        2 -> Pedir altura em M
        3 -> Calcular IMC => peso / (altura * altura)
        4 -> Exibir classificação:
                <18.5 => abaixo do peso
                >=18.5 e <=24.9 => peso normal
                >= 25 e <29.9 => sobrepeso
                Mais que isso obesidade
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu peso ? (em kg)");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual é sua altura ? (em metros)");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println(" Abaixo do peso");
        }else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println(" Peso normal");
        }else if(imc >= 25 && imc <=29.9 ){
            System.out.println( " Sobrepeso");
        }else{
            System.out.println( " Obesidade");
        }

        scanner.close();
    }
}
