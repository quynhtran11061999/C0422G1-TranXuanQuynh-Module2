package ss5_AccessModifier_StaticMethod_StaticProperty.bai_tap.CRUD;

import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    static Student[] students = new Student[10];

    static {
        students[0] = new Student(1, "Quỳnh", "QN", true, "quynhtran", "C0422G1");
        students[1] = new Student(2, "Huy", "DN", true, "minhhuy", "C0422G1");
        students[2] = new Student(3, "Trung", "DN", true, "quoctrung", "C0422G1");
    }

    //CRUD
    public void display() {
        for (Student s : students) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public void add() {
        boolean flag;
        int id;
        do {
            flag = false;
            System.out.println("Nhập id");
            id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null){
                    if (students[i].getId() == id) {
                        System.out.println("Id bị trùng");
                        flag = true;
                        break;
                    }
                }
            }
        }while (flag);
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập email:");
        String email = scanner.nextLine();
        System.out.println("Nhập lớp:");
        String school = scanner.nextLine();
        Student student = new Student(id, name, address, gender, email, school);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void delete(int index) {
        for (int i = 0; i < students.length; i++) {
            if (index == i) {
                students[i] = null;
                break;
            }
        }
    }
    public void edit(int index1){
        for (int i = 0; i <students.length ; i++) {
            if (index1==i){
                System.out.println("Thay đổi id:");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Thay đổi tên:");
                String name = scanner.nextLine();
                System.out.println("Thay đổi địa chỉ:");
                String address = scanner.nextLine();
                System.out.println("Thay đổi giới tính");
                boolean gender = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Thay đổi email:");
                String email = scanner.nextLine();
                System.out.println("Thay đổi lớp:");
                String school = scanner.nextLine();
             students[i].setId(id);
             students[i].setName(name);
             students[i].setAddress(address);
             students[i].setGender(gender);
             students[i].setEmail(email);
             students[i].setSchool(school);
            }
        }
    }
    public void search(int id){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                break;
            }
            if (students[i].getId()==id){
                System.out.println("Đối tượng có id = " + id + " tồn tại ở vị trí " + i);
                System.out.println(students[i]);
            }
        }
    }
}
