package secao05;

public class Switch {
    public static void main(String[] args) {
        // 11 -> switch case e break
        
        int diaDaSemana = 3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3: 
                System.out.println("Terça");
            case 4: 
                System.out.println("Quarta");
            case 5: 
                System.out.println("Quinta");
            break;
            default:
                break;
        }

        // 12 -> default
        int n = 10;
        switch (n) {
            case 1:
                    System.out.println("1");
                break;
            case 2:
                    System.out.println("2");
                break;
            case 3:
                    System.out.println("3");
                break;
        
            default:
                    System.out.println("Número não encontrado");
                break;
        }
    }
}
