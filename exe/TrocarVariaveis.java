package exe;

public class TrocarVariaveis {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int temporaria = a;
        a = b;
        b = temporaria;
        System.out.println("a = " + a + " " + "b = " + b  );

    }
}
