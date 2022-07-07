package CaseStudy.service.Impl;

import CaseStudy.common.CheckException;
import CaseStudy.common.CheckRegex;
import CaseStudy.common.UserException;
import CaseStudy.models.Employee;
import CaseStudy.service.IEmployeeService;
import CaseStudy.utils.ReadFurama;
import CaseStudy.utils.WriteFurama;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private final String FILE_EMPLOYEE_PATH = "src/CaseStudy/data/employee.csv";

    @Override
    public void add() {
        List<Employee> employees = ReadFurama.readEmployee(FILE_EMPLOYEE_PATH);
        boolean flag;
        int employeeCode;
        do {
            flag = false;
            System.out.println("Nhập mã nhân viên");
            employeeCode = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getEmployeeCode() == employeeCode) {
                    System.out.println("Mã nhân viên bị trùng");
                    flag = true;
                    break;
                }
            }
        } while (flag);

        String name;
        do {
            System.out.print("Nhập tên nhân viên: ");
            name = scanner.nextLine();
            if (!CheckRegex.checkRegexPersonName(name)) {
                System.err.println("Tên phải viết hoa chữ cái đầu, không được có kí tự số và kí tự đặc biệt!");
            }
        } while (!CheckRegex.checkRegexPersonName(name));

        LocalDate birthDay;
        do {
            try {
                System.out.print("Nhập ngày tháng năm sinh theo định dạng dd-MM-yyyy: ");
                birthDay = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                CheckException.checkDateOfBirth(birthDay);
                break;
            } catch (DateTimeParseException e) {
                System.err.println("Định dạng ngày tháng năm 'dd-MM-yyyy'!");
            } catch (UserException userException) {
                userException.printStackTrace();
            }
        }while (true);

        String gender = "";
        do {
            System.out.println("Chọn giới tính\n" +
                    "1. Nam\n" +
                    "2. Nữ\n" +
                    "3. Giới tính khác");
            System.out.print("Mời bạn chọn: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    gender = "Nam";
                    break;
                case "2":
                    gender = "Nữ";
                    break;
                case "3":
                    gender = "Giới tính khác";
                    break;
                default:
                    System.out.println("Bạn chọn chưa đúng! Vui lòng chọn lại");
            }
        } while (gender.equals(""));

        Integer idCode;
        do {
            do {
                System.out.print("Nhập số CMND(gồm 9 chữ số): ");
                idCode = Integer.parseInt(scanner.nextLine());
            } while (!CheckRegex.checkRegexIdentityCard(idCode.toString()));
            for (Employee employee : employees) {
                flag = false;
                if (employee.getIdCode() == (idCode)) {
                    System.out.println("Số CMND đã tồn tại");
                    flag = true;
                    break;
                }
            }
        } while (flag);

        String phoneNumber1;
        do {
            System.out.println("Nhập số điện thoại");
            phoneNumber1 = scanner.nextLine();
        } while (!CheckRegex.checkRegexPhone(phoneNumber1));
       int phoneNumber= Integer.parseInt(phoneNumber1);

        String email;
        do {
            System.out.println("Nhập Email");
            email = scanner.nextLine();
        }while (!CheckRegex.checkRegexEmail(email));


        System.out.println("Nhập trình độ nhân viên");
        String level = "";
        do {
            System.out.println("1 Trung cấp\n" +
                    "2 Cao đẳng\n" +
                    "3 Đại học\n" +
                    "4 Sau đại học");
            System.out.println("Chọn trình độ: ");
            String choiceLevel = scanner.nextLine();
            switch (choiceLevel) {
                case "1":
                    level = "Trung cấp";
                    break;
                case "2":
                    level = "Cao đẳng";
                    break;
                case "3":
                    level = "Đại học";
                    break;
                case "4":
                    level = "Sau đại học";
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (level.equals(""));
        System.out.println("Nhập vị trí");
        String location = "";
        do {
            System.out.println("1 Lễ tân\n" +
                    "2 Phục vụ\n" +
                    "3 Chuyên viên\n" +
                    "4 Giám sát\n" +
                    "5 Quán lý\n" +
                    "6 Giám đốc");
            System.out.println("Chọn trình độ:");
            String choicelocation = scanner.nextLine();
            switch (choicelocation) {
                case "1":
                    location = "Lễ tân";
                    break;
                case "2":
                    location = "Phục vụ";
                    break;
                case "3":
                    location = "Chuyên viên";
                    break;
                case "4":
                    location = "Giám sát";
                    break;
                case "5":
                    location = "Quán lý";
                    break;
                case "6":
                    location = "Giám đốc";
                    break;
                default:
                    System.out.println("Enter again");
            }
        } while (location.equals(""));
        double wage = 0;
        try {
            System.out.println("Nhập lương");
            wage = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException exception){
            System.err.println("Vui lòng nhập số!");
        }

        employees.add(new Employee(name, birthDay, gender, idCode, phoneNumber, email, employeeCode, level, location, wage));
        WriteFurama.writeEmployee(employees, FILE_EMPLOYEE_PATH, false);
    }


    @Override
    public void remove() {
    }

    @Override
    public void edit() {
        List<Employee> employees = ReadFurama.readEmployee(FILE_EMPLOYEE_PATH);
        boolean flag = true;
        System.out.println("Nhập mã nhân viên bạn muốn sửa");
        int employeeCode1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employees.size(); i++) {
            if (employeeCode1 == employees.get(i).getEmployeeCode()) {
                String name;
                do {
                    System.out.print("Sửa tên nhân viên: ");
                    name = scanner.nextLine();
                    if (!CheckRegex.checkRegexPersonName(name)) {
                        System.err.println("Tên phải viết hoa chữ cái đầu, không được có kí tự số và kí tự đặc biệt!");
                    }
                } while (!CheckRegex.checkRegexPersonName(name));
                employees.get(i).setName(name);

                LocalDate birthDay;
                do {
                    try {
                        System.out.print("Nhập ngày tháng năm sinh theo định dạng dd-MM-yyyy: ");
                        birthDay = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                        CheckException.checkDateOfBirth(birthDay);
                        break;
                    } catch (DateTimeParseException e) {
                        System.err.println("Định dạng ngày tháng năm 'dd-MM-yyyy'!");
                    } catch (UserException userException) {
                        userException.printStackTrace();
                    }
                }while (true);
                employees.get(i).setBirthDay(birthDay);

                String gender = "";
                do {
                    System.out.println("Sửa giới tính\n" +
                            "1. Nam\n" +
                            "2. Nữ\n" +
                            "3. Giới tính khác");
                    System.out.print("Mời bạn chọn: ");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            gender = "Nam";
                            break;
                        case "2":
                            gender = "Nữ";
                            break;
                        case "3":
                            gender = "Giới tính khác";
                            break;
                        default:
                            System.out.println("Bạn chọn chưa đúng! Vui lòng chọn lại");
                    }
                } while (gender.equals(""));
                employees.get(i).setGender(gender);

                Integer idCode;
                do {
                    do {
                        System.out.print("Nhập số CMND(gồm 9 chữ số): ");
                        idCode = Integer.parseInt(scanner.nextLine());
                    } while (!CheckRegex.checkRegexIdentityCard(idCode.toString()));
                    for (Employee employee : employees) {
                        flag = false;
                        if (employee.getIdCode() == (idCode)) {
                            System.out.println("Số CMND đã tồn tại");
                            flag = true;
                            break;
                        }
                    }
                } while (flag);
                employees.get(i).setIdCode(idCode);

                String phoneNumber1;
                do {
                    System.out.println("Nhập số điện thoại");
                    phoneNumber1 = scanner.nextLine();
                } while (!CheckRegex.checkRegexPhone(phoneNumber1));
                int phoneNumber= Integer.parseInt(phoneNumber1);
                employees.get(i).setPhoneNumber(phoneNumber);

                String email;
                do {
                    System.out.println("Nhập Email");
                    email = scanner.nextLine();
                }while (!CheckRegex.checkRegexEmail(email));

                System.out.println("Sửa trình độ nhân viên");
                String level = "";
                System.out.println("1 Trung cấp\n" +
                        "2 Cao đẳng\n" +
                        "3 Đại học\n" +
                        "4 Sau đại học");
                System.out.println("Chọn trình độ: ");
                String choiceLevel = scanner.nextLine();
                do {
                    switch (choiceLevel) {
                        case "1":
                            level = "Trung cấp";
                            break;
                        case "2":
                            level = "Cao đẳng";
                            break;
                        case "3":
                            level = "Đại học";
                            break;
                        case "4":
                            level = "Sau đại học";
                            break;
                        default:
                            System.out.println("Enter again");
                    }
                } while (level.equals(""));
                employees.get(i).setLevel(level);
                System.out.println("Sửa vị trí nhân viên");
                String location = "";
                System.out.println("1 Lễ tân\n" +
                        "2 Phục vụ\n" +
                        "3 Chuyên viên\n" +
                        "4 Giám sát\n" +
                        "5 Quản lý\n" +
                        "6 Giám đốc");
                System.out.println("Chọn vị trí: ");
                String choiceLocation = scanner.nextLine();
                do {
                    switch (choiceLocation) {
                        case "1":
                            location = "Lễ tân";
                            break;
                        case "2":
                            location = "Phục vụ";
                            break;
                        case "3":
                            location = "Chuyên viên";
                            break;
                        case "4":
                            location = "Giám sát";
                            break;
                        case "5":
                            location = "Quản lí";
                            break;
                        case "6":
                            location = "Giám đốc";
                        default:
                            System.out.println("Enter again");
                    }
                } while (level.equals(""));
                employees.get(i).setLocation(location);

                double wage = 0;
                try {
                    System.out.println("Sửa lương");
                    wage = Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException exception){
                    System.err.println("Vui lòng nhập số!");
                }
                employees.get(i).setWage(wage);
                WriteFurama.writeEmployee(employees, FILE_EMPLOYEE_PATH, false);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("mã nhân viên bạn nhập không có trong danh sách");
        }
    }

    @Override
    public void display() {
        List<Employee> employees = ReadFurama.readEmployee(FILE_EMPLOYEE_PATH);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
