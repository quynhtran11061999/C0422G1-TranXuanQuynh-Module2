package ss2_vong_lap_trong_java.bai_tap;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        int tmp;
        System.out.println("Những số nguyên tố nhỏ hơn 100 là:");
        while (number < 100) {
            tmp = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    tmp++;
                    break;
                }
            }
            if (tmp == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
