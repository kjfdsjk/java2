import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Nhập một số:");
        int number = x.nextInt();
        int n = 2;
        int count = 0;

        while (count < number) {
            boolean isPrime = true;

            if (n == 0 || n == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}