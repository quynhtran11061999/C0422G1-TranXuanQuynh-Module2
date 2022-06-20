package Luyen_tap.inheritance;

public class Test {
    public static void main(String[] args) {
        Hinh[] hinhs = new Hinh[2];
        hinhs[0] = new HinhTron(2.0);
        hinhs[1] = new ChuNhat(3.0,4.0);

        for (int i = 0; i < hinhs.length; i++) {
            System.out.println("dien tich hinh "+ i +" la "+ hinhs[i].getArea());
        }

        System.out.println(hinhs[0].getArea());
        System.out.println(hinhs[1].getArea());
    }
}
