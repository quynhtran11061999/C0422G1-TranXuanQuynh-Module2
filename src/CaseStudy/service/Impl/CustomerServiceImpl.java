package CaseStudy.service.Impl;

import CaseStudy.models.Customer;
import CaseStudy.service.ICustomerService;
import CaseStudy.utils.ReadFurama;
import CaseStudy.utils.WriteFurama;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    private final String FILE_CUSTOMER_PATH = "src/CaseStudy/data/customer.csv";
    @Override
    public void add() {
        List<Customer> customers = ReadFurama.readCustomer(FILE_CUSTOMER_PATH);
        boolean flag;
        int customerCode;
        do {
            flag = false;
            System.out.println("Nhập mã khách hàng");
            customerCode = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getCustomerCode() == customerCode) {
                    System.out.println("Mã khách hàng bị trùng");
                    flag = true;
                    break;
                }

            }
        } while (flag);
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh khách hàng");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập giới tính khách hàng");
        String gender = scanner.nextLine();
        boolean flag2;
        int idCode;
        do {
            flag2 = false;
            System.out.println("Nhập số CMND");
            idCode = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getIdCode() == idCode) {
                    System.out.println("CMND bị trùng");
                    flag2 = true;
                    break;
                }
            }
        } while (flag2);
        System.out.println("Nhập số điện thoại");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Email");
        String email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng");
        String clientType = "";
        do {
            System.out.println("1 Diamond\n" +
                    "2 Platinium\n" +
                    "3 Gold\n" +
                    "4 Silver\n" +
                    "5 Member");
            System.out.println("Chọn loại khách hàng: ");
            String choiceClientType = scanner.nextLine();
            switch (choiceClientType) {
                case "1":
                    clientType = "Diamond";
                    break;
                case "2":
                    clientType = "Platinium";
                    break;
                case "3":
                    clientType = "Gold";
                    break;
                case "4":
                    clientType = "Silver";
                    break;
                case "5":
                    clientType = "Member";
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (clientType.equals(""));
        System.out.println("Nhập địa chỉ khách hàng");
        String address = scanner.nextLine();
        customers.add(new Customer(name, birthday, gender, idCode, phoneNumber, email, customerCode, clientType, address));
        WriteFurama.writeCustomer(customers,FILE_CUSTOMER_PATH,false);
    }

    @Override
    public void remove() {

    }

    @Override
    public void edit() {
        List<Customer> customers = ReadFurama.readCustomer(FILE_CUSTOMER_PATH);
        System.out.println("Nhập mã khách hàng bạn muốn sửa");
        int customerCode1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customers.size(); i++) {
            if (customerCode1 == customers.get(i).getCustomerCode()) {
                System.out.println("Sửa tên khách hàng");
                customers.get(i).setName(scanner.nextLine());
                System.out.println("Sửa ngày sinh khách hàng");
                customers.get(i).setBirthDay(LocalDate.parse(scanner.nextLine()));
                System.out.println("Sửa giới tính khách hàng");
                customers.get(i).setGender(scanner.nextLine());
                System.out.println("Sửa số CMND khách hàng");
                customers.get(i).setIdCode(Integer.parseInt(scanner.nextLine()));
                System.out.println("Sửa số điện thoại khách hàng");
                customers.get(i).setPhoneNumber(Integer.parseInt(scanner.nextLine()));
                System.out.println("Sửa email khách hàng");
                customers.get(i).setEmail(scanner.nextLine());
                System.out.println("Sửa loại khách hàng");
                String clientType1 = "";
                do {
                    System.out.println("1 Diamond\n" +
                            "2 Platinium\n" +
                            "3 Gold\n" +
                            "4 Silver\n" +
                            "5 Member");
                    System.out.println("Chọn loại khách hàng: ");
                    String choiceClientType = scanner.nextLine();
                    switch (choiceClientType) {
                        case "1":
                            clientType1 = "Diamond";
                            break;
                        case "2":
                            clientType1 = "Platinium";
                            break;
                        case "3":
                            clientType1 = "Gold";
                            break;
                        case "4":
                            clientType1 = "Silver";
                            break;
                        case "5":
                            clientType1 = "Member";
                            break;
                        default:
                            System.out.println("Enter again");
                    }
                } while (clientType1.equals(""));
                customers.get(i).setClientType(clientType1);
                System.out.println("Sửa địa chỉ khách hàng");
                customers.get(i).setAddress(scanner.nextLine());
                WriteFurama.writeCustomer(customers, FILE_CUSTOMER_PATH, false);
                return;
            }
        }
        System.out.println("Mã khách hàng bạn nhập không có trong danh sách");
    }
    @Override
    public void display() {
        List<Customer> customers = ReadFurama.readCustomer(FILE_CUSTOMER_PATH);
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }
}
