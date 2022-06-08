package ss2_vong_lap_trong_java.bai_tap;

public class PrimeNumber {
    public static void main(String[] args) {
        int snt = 2;
        int tmp;
        System.out.println("Những số nguyên tố nhỏ hơn 100 là:");
        while (snt < 100) {
            tmp = 0;
            for (int i = 2; i < snt; i++) {
                if (snt % i == 0) {
                    tmp++;
                    break;
                }
            }
            if (tmp == 0) {
                System.out.println(snt);
            }
            snt++;
        }
    }
}
