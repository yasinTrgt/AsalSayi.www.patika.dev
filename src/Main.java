import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Bir Sayı Giriniz: ");
        n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal)
                System.out.print(i + ", ");


        }
    }
}
