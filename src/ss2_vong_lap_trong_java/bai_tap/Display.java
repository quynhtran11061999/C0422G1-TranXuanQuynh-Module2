package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
       while (true){
           int choise = scanner.nextInt();
               switch (choise){
                   case 1:
                       for (int i = 0; i <3 ; i++) {
                           for (int j = 0; j < 7; j++) {
                               System.out.print("*");
                           }
                           System.out.println();
                       }
                       break;
                   case 2:
                       for (int i = 1; i <=5 ; i++) {
                           for (int j = 1; j <= i; j++) {
                               System.out.print("*");
                           }
                           System.out.println();
                       }
                       break;
                   case 3:
                       for (int i = 7; i >=1 ; i--) {
                           for (int j = 1; j <i ; j++) {
                               System.out.print("*");
                           }
                           System.out.println();
                       }
                       break;
                   case 4:
                       System.exit(4);
                   default:
                       System.out.println("No choice!");
               }
           }
       }
    }

