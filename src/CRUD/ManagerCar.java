package CRUD;


import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCar {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Car> cars = new ArrayList<>();
    static {
        cars.add(new XeOto("ooooo","mec",2019,"Quynh",7,"dongcooto"));
        cars.add(new XeTai("ttttt","xetai",2020,"Quynh",4));
        cars.add(new XeMay("mmmmm","honda",2021,"Quynh",7));
    }
    void display(){
        for (Car c : cars){
            System.out.println(c);
        }
    }
    void add(){
        System.out.println("Nhập loại xe muốn thêm:");
        System.out.println("1. Xe Oto");
        System.out.println("1. Xe Tải");
        System.out.println("1. Xe máy");
        int choose = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập biển kiểm soát ");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất ");
//        String hangSanXuat
    }


}
