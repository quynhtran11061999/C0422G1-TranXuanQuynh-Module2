package ss5_AccessModifier_StaticMethod_StaticProperty.bai_tap.Access_Modifier;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Bán kính:");
        System.out.println(circle.getRadius());
        System.out.println("Diện tích hình tròn:");
        System.out.println(circle.getArea());
        System.out.println(circle);
    }
}
