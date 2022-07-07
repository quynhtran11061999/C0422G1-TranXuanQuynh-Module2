package CaseStudy.utils;

import CaseStudy.models.*;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFurama {
    private static List<String> readObjectToCSV(String pathFile) {
        List<String> list = new ArrayList<>();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static List<Employee> readEmployee(String pathFile) {

        List<Employee> employeeList = new ArrayList<>();
        List<String> list = readObjectToCSV(pathFile);
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            //    public Employee(String name, int birthDay, String gender, int idCode, int phoneNumber, String email, int employeeCode, String level, String location, double wage) {
            employeeList.add(new Employee(arr[0], LocalDate.parse(arr[1]), arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]), arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employeeList;
    }

    public static List<Customer> readCustomer(String pathFile) {
        List<Customer> customerList = new ArrayList<>();
        List<String> list = readObjectToCSV(pathFile);
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            customerList.add(new Customer(arr[0], LocalDate.parse(arr[1]), arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]), arr[7], arr[8]));
        }
        return customerList;
    }

    public static Map<Facility, Integer> readFacilityToCSV(String pathFile) {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        List<String> strings = readObjectToCSV(pathFile);
        String[] arr;
        String name = "";
        for (String str : strings) {
            arr = str.split(",");
            if (arr[0].contains("VL")) {
                // String idFacility, String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalTyle, String roomStandard, String poolArea, int numberFloors
                facilityMap.put(new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], Integer.parseInt(arr[8])), Integer.parseInt(arr[9]));
            } else if (arr[0].contains("HO")) {
                facilityMap.put(new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7])), Integer.parseInt(arr[8]));
            } else {
                facilityMap.put(new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]), Integer.parseInt(arr[7]));
            }
        }
        return facilityMap;
    }
}
