package ss5_AccessModifier_StaticMethod_StaticProperty.bai_tap.Xay_dung_lop_chi_ghi_trong_Java;

public class MainStudent {
    public static void main(String[] args) {
       Student student = new Student();
        System.out.println(student.getName());
        student.setName("Quỳnh");
        System.out.println("Tên sau khi sửa: "+student.getName());
        System.out.println(student.getClasses());
        student.setClasses("CO422G1");
        System.out.println("Lớp sau khi sửa: "+student.getClasses());
    }
}
