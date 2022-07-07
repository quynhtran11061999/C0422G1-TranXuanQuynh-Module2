package CaseStudy.service.Impl;

import CaseStudy.common.CheckException;
import CaseStudy.common.CheckRegex;
import CaseStudy.models.Facility;
import CaseStudy.models.Room;
import CaseStudy.utils.ReadFurama;
import CaseStudy.utils.WriteFurama;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RoomServiceImpl extends FacilityServiceImpl {
    private final String FILE_FACILITY_PATH = "src/CaseStudy/data/facility.csv";

    public void add() {
        Scanner scanner = new Scanner(System.in);
        Map<Facility, Integer> facilityMap = ReadFurama.readFacilityToCSV(FILE_FACILITY_PATH);
        Set<Facility> set = facilityMap.keySet();
        String serviceName;
        do {
            System.out.print("Nhập tên dịch vụ: ");
            serviceName = scanner.nextLine();
        } while (!CheckRegex.checkRegexNameService(serviceName));
        for (Facility facility : set) {
            if (facility.getServiceName().equalsIgnoreCase(serviceName)) {
                System.out.println("Dịch vụ này đã có!");
            }
        }

        String id;
        do {
            id = "SVRO-";
            System.out.print("Nhập mã dịch vụ (gồm có 4 số): ");
            id += scanner.nextLine();
        } while (!CheckRegex.checkRegexFacilityId(id));

        double usableArea;
        while (true) {
            try {
                System.out.print("Nhập diện tích sử dụng: ");
                usableArea = Double.parseDouble(scanner.nextLine());
                CheckException.checkArea(usableArea);
                break;
            } catch (NumberFormatException | CaseStudy.common.UserException exception) {
                System.err.println(exception.getMessage());
            }
        }

        double rentalCosts;
        while (true) {
            try {
                System.out.print("Nhập chi phí thuê: ");
                rentalCosts = Double.parseDouble(scanner.nextLine());
                CheckException.checkDouble(rentalCosts);
                break;
            } catch (NumberFormatException | CaseStudy.common.UserException exception) {
                System.err.println(exception.getMessage());
            }
        }

        int maxPeople;
        while (true) {
            try {
                System.out.print("Số người tối đa: ");
                maxPeople = Integer.parseInt(scanner.nextLine());
                CheckException.checkMaxOfPeople(maxPeople);
                break;
            } catch (NumberFormatException | CaseStudy.common.UserException exception) {
                System.err.println(exception.getMessage());
            }
        }

        String rentalType = "";
        do {
            System.out.println("Chọn kiểu thuê\n" +
                    "1. Thuê theo năm\n" +
                    "2. Thuê theo tháng\n" +
                    "3. Thuê theo ngày\n" +
                    "4. Thuê theo giờ.");
            System.out.print("Mời bạn chọn: ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    rentalType = "Thuê theo năm";
                    break;
                case "2":
                    rentalType = "Thuê theo tháng";
                    break;
                case "3":
                    rentalType = "Thuê theo ngày";
                    break;
                case "4":
                    rentalType = "Thuê theo giờ";
                    break;
                default:
                    System.out.println("Bạn chọn lại kiểu thuê!");
            }
        } while (rentalType.equals(""));
        System.out.println("Dịch vụ miễn phí đi kèm: ");
        String freeService = scanner.nextLine();
        Room room = new Room(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, freeService);
        facilityMap.put(room, 0);
        WriteFurama.writeFacilityToCSV(facilityMap, FILE_FACILITY_PATH, false);
        System.out.println("Bạn đã thêm mới thành công");
    }
}
