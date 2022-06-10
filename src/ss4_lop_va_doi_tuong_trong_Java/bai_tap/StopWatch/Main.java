package ss4_lop_va_doi_tuong_trong_Java.bai_tap.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Thời gian bắt đầu " + stopWatch.getStartTime());
        for (int i = 0; i < 10000; i++) {

        }
        stopWatch.stop();
        System.out.println("Thời gian kết thúc " + stopWatch.getEndTime());
        System.out.println("Thuận toán thực thi " + stopWatch.getElapsedTime() + "mili giây");
    }
}
