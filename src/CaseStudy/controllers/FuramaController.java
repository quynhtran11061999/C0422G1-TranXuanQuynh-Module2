package CaseStudy.controllers;

import CaseStudy.service.ICustomerService;
import CaseStudy.service.IEmployeeService;
import CaseStudy.service.IFacilityService;
import CaseStudy.service.Impl.CustomerServiceImpl;
import CaseStudy.service.Impl.EmployeeServiceImpl;
import CaseStudy.service.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        String choiceMenu;
        do {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.println("Choose one option above: ");
            choiceMenu = scanner.nextLine();
            switch (choiceMenu) {
                case "1":
                    //Employee Management
                    employeeManagement();
                    break;
                case "2":
                    //Customer Management
                    customerManagement();
                    break;
                case "3":
                    //Facility Management
                    facilityManagement();
                    break;
                case "4":
                    //Booking Management
                    bookingManagerment();
                    break;
                case "5":
                    //Promotion Management
                    promotionManagement();
                    break;
                case "6":
                    //Exit
                    System.out.println("Exit program");
                    System.exit(0);
                default:
                    System.out.println("Enter again!");
            }
        } while (!choiceMenu.equals("6"));
    }

    private static void employeeManagement() {
        IEmployeeService employeeService = null;
        String choiceEmployeeMenu = null;
        do {
            System.out.println("1 Display list employees\n" +
                    "2 Add new employee\n" +
                    "3 Edit employee\n" +
                    "4 Return main menu");
            System.out.println("Choose one option above:");
            employeeService = new EmployeeServiceImpl();
            choiceEmployeeMenu = scanner.nextLine();
            switch (choiceEmployeeMenu) {
                case "1":
                    // Display list employees
                    employeeService.display();
                    break;
                case "2":
                    //Add new employee
                    employeeService.add();
                    break;
                case "3":
                    //Edit employee
                    employeeService.edit();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Enter again");
            }
        } while (!choiceEmployeeMenu.equals("4"));
    }

    private static void customerManagement() {
        ICustomerService customerService = null;
        String choiceCustomerManagement = null;
        do {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            System.out.println("Choose one option above: ");
            choiceCustomerManagement = scanner.nextLine();
            customerService = new CustomerServiceImpl();
            switch (choiceCustomerManagement) {
                case "1":
                    // Display list customers
                    customerService.display();
                    break;
                case "2":
                    // Add new customer
                    customerService.add();
                    break;
                case "3":
                    //Edit customer
                    customerService.edit();
                    break;
                case "4":
                    //Return main menu
                    return;
                default:
                    System.out.println("Enter again");
            }
        } while (!choiceCustomerManagement.equals("4"));
    }

    private static void facilityManagement() {
        IFacilityService facilityService = null;
        String choiceFacilityManagement = null;
        do {
            System.out.println("\n1 Display list facility\n" +
                    "2 Add new facility\n" +
                    "3 Display list facility maintenance\n" +
                    "4 Return main menu");
            System.out.println("Choose one option above: ");
            choiceFacilityManagement = scanner.nextLine();
            facilityService = new FacilityServiceImpl();
            switch (choiceFacilityManagement) {
                case "1":
                    // Display list facility
                    facilityService.display();
                    break;
                case "2":
                    // Add new facility
                    facilityService.add();
                    break;
                case "3":
                    //Display list facility maintenance
                    break;
                case "4":
                    //Return main menu
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (!choiceFacilityManagement.equals("4"));
    }

    private static void bookingManagerment() {
        String choiceBookingManagerment;
        do {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            System.out.println("Choose one option above: ");
            choiceBookingManagerment = scanner.nextLine();
            switch (choiceBookingManagerment) {
                case "1":
                    // Add new booking
                    break;
                case "2":
                    //  Display list booking
                    break;
                case "3":
                    //Create new contracts
                    break;
                case "4":
                    //Display list contracts
                    break;
                case "5":
                    //Edit contracts
                    break;
                case "6":
                    //Return main menu
                default:
                    System.out.println("Enter again");
            }
        } while (!choiceBookingManagerment.equals("6"));
    }

    private static void promotionManagement() {
        String choicePromotionManagement;
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            System.out.println("Choose one option above: ");
            choicePromotionManagement = scanner.nextLine();
            switch (choicePromotionManagement) {
                case "1":
                    // Display list customers use service
                    break;
                case "2":
                    // Display list customers get voucher
                    break;
                case "3":
                    //Return main menu
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (!choicePromotionManagement.equals("3"));
    }
}
