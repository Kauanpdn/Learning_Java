import java.util.Scanner;

public class ConversorDeTemperatura {

    /*
    Obejetivo Criar um conversor de Celsius para Fahrenheit e de Fhrenheit para Celsius

    Etapas do projeto

    1 - Obter do usuário se ele quer converter Celsius ou Fahrenheit
    2 - Criar duas funções, uma para cada conversão
    3 - Obter a temperatura em cada uma das funções escolhidas
    4 - Exibir uma mensagem com a temperatura, ez: De x C para Y F
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá escolha o método que você deseja converter 'C' (Celsius) e 'F' (Fahrenheit)");

        String metedo = scanner.nextLine();
        if (metedo.equalsIgnoreCase("C")) {
                System.out.println("Digite a temperatura em Celsius:");
                    double tempCelsius = scanner.nextDouble();
                    double resultado = conversaoCelsius(tempCelsius);
                        System.out.println(tempCelsius + "°C equivalem a " + resultado + "°F");
        }else if (metedo.equalsIgnoreCase("F")) {
            System.out.println("Digite a temperatura em Fahrenheit");
                    double tempFahrenheit = scanner.nextDouble();
                    double resultado = conversaoFahrenhit(tempFahrenheit);
                        System.out.println(tempFahrenheit + "°F equivalem a " + resultado + "°C");
        }else{
            System.out.println("Método inválido!");
        }

        scanner.close();
    }

    public static double conversaoCelsius(double celsius){
            double fahrenheit = (celsius * 1.8) + 32;
            return fahrenheit;
    }

    public static double conversaoFahrenhit(double fahrenheit){
            double celsius = (fahrenheit - 32) * 1.8;
            return celsius;
    }
}
