package CaseStudy.controllers;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){
        int choiceMenu;
        do {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.println("Choose one option above: ");
            choiceMenu = Integer.parseInt(scanner.nextLine());
            switch (choiceMenu){
                case 1:
                    //Employee Management
                    employeeManagement();
                    break;
                case 2:
                    //Customer Management
                    customerManagement();
                    break;
                case 3:
                    //Facility Management
                    facilityManagement();
                    break;
                case 4:
                    //Booking Management
                    bookingManagerment();
                    break;
                case 5:
                    //Promotion Management
                    promotionManagement();
                    break;
                case 6:
                    //Exit
                    System.out.println("Exit program");
                    System.exit(0);
                default:
                    System.out.println("Enter again!");
            }
        } while (choiceMenu!=6);
    }

    private static void employeeManagement(){
        System.out.println("1 Display list employees\n" +
                "\n" +
                "2 Add new employee\n" +
                "3 Edit employee\n" +
                "4 Return main menu");
        System.out.println("Choose one option above: ");
        int choiceEmployeeMenu = Integer.parseInt(scanner.nextLine());
        do {
            switch (choiceEmployeeMenu){
                case 1:
                    // Display list employees
                    break;
                case 2:
                    //Add new employee
                    break;
                case 3:
                    //Edit employee
                    break;
                case 4:
                    //Return main menu
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (choiceEmployeeMenu!=4);
    }
    private static void customerManagement(){
        System.out.println("1. Display list customers\n" +
                "2. Add new customer\n" +
                "3. Edit customer\n" +
                "4. Return main menu");
        System.out.println("Choose one option above: ");
        int choiceCustomerManagement = Integer.parseInt(scanner.nextLine());
        do {
            switch (choiceCustomerManagement){
                case 1:
                    // Display list customers
                    break;
                case 2:
                    // Add new customer
                    break;
                case 3:
                    //Edit customer
                    break;
                case 4:
                    //Return main menu
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (choiceCustomerManagement!=4);
    }
    private static void facilityManagement(){
        System.out.println("1 Display list facility\n" +
                "2 Add new facility\n" +
                "3 Display list facility maintenance\n" +
                "4 Return main menu");
        System.out.println("Choose one option above: ");
        int choiceFacilityManagement = Integer.parseInt(scanner.nextLine());
        do {
            switch (choiceFacilityManagement){
                case 1:
                    // Display list facility
                    break;
                case 2:
                    // Add new facility
                    break;
                case 3:
                    //Display list facility maintenance
                    break;
                case 4:
                    //Return main menu
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (choiceFacilityManagement!=4);
    }
    private static void bookingManagerment(){
        System.out.println("1. Add new booking\n" +
                "2. Display list booking\n" +
                "3. Create new contracts\n" +
                "4. Display list contracts\n" +
                "5. Edit contracts\n" +
                "6. Return main menu");
        System.out.println("Choose one option above: ");
        int choiceBookingManagerment = Integer.parseInt(scanner.nextLine());
        do {
            switch (choiceBookingManagerment){
                case 1:
                    // Add new booking
                    break;
                case 2:
                    //  Display list booking
                    break;
                case 3:
                    //Create new contracts
                    break;
                case 4:
                    //Display list contracts
                    break;
                case 5:
                    //Edit contracts
                    break;
                case 6:
                    //Return main menu
                default:
                    System.out.println("Enter again");
            }
        } while (choiceBookingManagerment!=6);
    }
    private static void promotionManagement(){
        System.out.println("1. Display list customers use service\n" +
                "2. Display list customers get voucher\n" +
                "3. Return main menu");
        System.out.println("Choose one option above: ");
        int choicePromotionManagement = Integer.parseInt(scanner.nextLine());
        do {
            switch (choicePromotionManagement){
                case 1:
                    // Display list customers use service
                    break;
                case 2:
                    // Display list customers get voucher
                    break;
                case 3:
                    //Return main menu
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (choicePromotionManagement!=3);
    }
}
