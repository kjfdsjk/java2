
public class bai3 {
    public static void main(String[] args) {
        System.out.println("Hiển thị các số nguyên tố nhỏ hơn 100");
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
