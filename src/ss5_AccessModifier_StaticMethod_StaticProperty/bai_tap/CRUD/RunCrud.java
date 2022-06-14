package ss5_AccessModifier_StaticMethod_StaticProperty.bai_tap.CRUD;

import java.util.Scanner;

public class RunCrud {
    public static void main(String[] args) {
        displayMenu();
    }

    public static  void displayMenu(){
        StudentManager studentManager = new StudentManager();
        boolean flag =true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Display" +
                    "\n 2. Add" +
                    "\n 3.Delete" +
                    "\n 4. Edit" +
                    "\n 5. Search" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // code display
                    System.out.println("Chức năng hiện thị");
                    studentManager.display();
                    break;
                case 2:
                    // code thêm mới
                    System.out.println("Chức năng thêm mới");
                    studentManager.add();
                    break;
                case 3:
                    // code xóa
                    System.out.println("Chức năng xóa");
                    System.out.println("Nhập vị trí muốn xóa");
                    int chosee = Integer.parseInt(scanner.nextLine());
                    studentManager.delete(chosee);
                    break;
                case 4:
                    // code sửa
                    System.out.println("Chức năng sửa");
                    System.out.println("Nhập vị trí muốn sửa");
                    int index1 = Integer.parseInt(scanner.nextLine());
                    studentManager.edit(index1);
                    break;
                case 5:
                    // code tìm kiếm
                    System.out.println("Chức năng tìm kiếm");
                    System.out.println("Thứ tự muốn tìm kiếm");
                    int id = Integer.parseInt(scanner.nextLine());
                    studentManager.search(id);
                    break;
                case 6:
                    System.exit(6);
                default:
                    flag=false;
            }
        }while (flag);
    }
}
