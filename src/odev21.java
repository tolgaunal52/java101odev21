import java.util.Scanner;

public class odev21 {
    public static void main(String[] args) {
        int a, b, i, c = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Girilen Sayinin Ussunu Alma");
        System.out.print("\nTaban Sayisini Girin : ");
        b = input.nextInt();
        System.out.print("Us Sayisini Girin : ");
        a = input.nextInt();

        for (i = 1; i <= a; i++) {
            c *= b;
        }
        System.out.println("\n"+b+"^"+a+" = " + c);
    }
}
