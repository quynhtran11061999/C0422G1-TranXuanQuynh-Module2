package Luyen_tap.static_luyentap;

public class StaticTest {
    //tim so lon nhat trong 2 so

    public static int ham = 2;
    //biến static


    static {

    }//khối static

    public static int sosanh(int num1, int num2){
        if (num1>num2)return num1;
        else return num2;
    }//hàm này thuộc về class StaticTest
    //phương thức static//static method
    //static method chỉ gọi được biến static, static method

    public static int sosanh(int num1, int num2, int num3){
        if (num1>num2)return num1;
        else return num3;
    }
    //nap chong



    public int hieu2so(int num1, int num2){
        return sosanh(123,456);
    }//ko có static > có static
    //phương thức bình thường //method
    //có thể gọi được method và static method

//    public int sosanh(int num1, int num2){
//        if (num1>num2)return num1;
//        else return num2;
//    }//hàm này thuộc về object được khởi tạo từ class StaticTest


    public static void main(String[] args) {

        int a = 10;
        int b = 99;

        int[] mang = {1,2,3};


//        StaticTest staticTest = new StaticTest();
//        System.out.println(staticTest.sosanh(123,456));

        sosanh(14,182736);//có chạy được ko?

        System.out.println(sosanh(a,b));
    }
}
