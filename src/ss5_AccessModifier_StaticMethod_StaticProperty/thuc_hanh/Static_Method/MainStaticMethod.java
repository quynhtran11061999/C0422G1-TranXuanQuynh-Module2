package ss5_AccessModifier_StaticMethod_StaticProperty.thuc_hanh.Static_Method;

public class MainStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change(); //gọi phương thức thay đổi
        // tạo đối tượng
        StaticMethod s1 = new StaticMethod(111, "Hoang");
        StaticMethod s2 = new StaticMethod(222, "Khanh");
        StaticMethod s3 = new StaticMethod(333, "Nam");
        // gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
