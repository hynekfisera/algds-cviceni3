import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*int c1 = input.nextInt();
        int c2 = input.nextInt();
        System.out.println(getSoucin(c1, c2));*/

        /*int c1 = input.nextInt();
        System.out.println(jeSude(c1));*/

        /*int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        System.out.println(alg(x, y, z));*/

        /*int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(jeTrojuhelnik(a, b, c));*/

        /*int prvni = input.nextInt();
        int druhy = input.nextInt();
        System.out.println(jeSplnen(prvni, druhy));*/

        int a = 12;
        int b = 10;
        int c = -9;
        a = c; // -9
        b = a + 2; // -7
        int d = (b + a) * 2 + c; // (-7-9)*2-9 = -41
        System.out.println("The result is: " + d);
    }

    public static boolean jeSplnen(int prvni, int druhy) {
        return prvni >= 50 && druhy >= 50 && (prvni + druhy) / 2 >= 60;
    }

    public static boolean jeTrojuhelnik(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static int alg(int x, int y, int z) {
        if (x > z) {
            return y + z;
        } else {
            return y * x;
        }
    }

    public static boolean jeSude(int a) {
        return a % 2 == 0;
    }

    public static int getSoucin(int a, int b) {
        return a * b;
    }
}