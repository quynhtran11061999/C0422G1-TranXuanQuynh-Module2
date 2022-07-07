package CaseStudy.service.Impl;

import CaseStudy.models.Facility;
import CaseStudy.models.Villa;
import CaseStudy.service.IFacilityService;
import CaseStudy.utils.ReadFurama;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {
    private Scanner scanner = new Scanner(System.in);
    public static final String FILE_FACILITY_PATH = "src/CaseStudy/data/facility.csv";

    @Override
    public void add() {
       IFacilityService villa = new VillaServiceImpl();
       IFacilityService house = new HouseServiceImpl();
       IFacilityService room = new RoomServiceImpl();
        boolean flag = true;
        do {
            System.out.println("1 Add New Villa\n" +
                    "2 Add New House\n" +
                    "3 Add New Room\n" +
                    "4 Back to menu");
            System.out.println("Chọn thêm mới: ");
            int choiceAdds = Integer.parseInt(scanner.nextLine());
            switch (choiceAdds) {
                case 1:
                    villa.add();
                    break;
                case 2:
                    house.add();
                    break;
                case 3:
                    room.add();
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println("Enter again");
            }
        } while (flag);
    }

    @Override
    public void remove() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        Map<Facility, Integer> facilityMap = ReadFurama.readFacilityToCSV(FILE_FACILITY_PATH);
        Set<Facility> set = facilityMap.keySet();
        if (facilityMap.isEmpty()){
            System.out.printf("Chưa có dữ liệu mời bạn thêm vào");
        } else {
            for (Facility f: set) {
                System.out.println(f);
            }
        }
    }
}
