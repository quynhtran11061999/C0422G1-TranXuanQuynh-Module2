package ss5_AccessModifier_StaticMethod_StaticProperty.thuc_hanh.Static_Method;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    // hàm khởi tạo để khởi tạo biến
    StaticMethod(int r, String n) {
        rollno = r;
        name = n;
    }
    // thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }
    // phương pháp hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
