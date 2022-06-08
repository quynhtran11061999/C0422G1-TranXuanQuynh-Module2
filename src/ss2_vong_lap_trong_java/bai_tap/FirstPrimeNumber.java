package ss2_vong_lap_trong_java.bai_tap;


public class FirstPrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        int tmp;
        System.out.println("20 số nguyên tố đầu tiên là: ");
        while (count < 20) {
            tmp = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    tmp++;
                    break;
                }
            }
            if (tmp == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
