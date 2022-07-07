package CaseStudy.utils;

import CaseStudy.models.Customer;
import CaseStudy.models.Employee;
import CaseStudy.models.Facility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteFurama {
    private static void writeObjectToCSV(List<String> list, String pathFile, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String strings : list) {
                bufferedWriter.write(strings);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeEmployee(List<Employee> employeeList, String pathFile, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Employee employee : employeeList) {
            strings.add(employee.getInfoEmployee());
        }
        writeObjectToCSV(strings, pathFile, append);
    }
    public static void writeCustomer(List<Customer>customerList,String pathFile,boolean append){
        List<String> strings = new ArrayList<>();
        for (Customer customer: customerList) {
            strings.add(customer.getInfoCustomer());
        }
        writeObjectToCSV(strings, pathFile, append);
    }
    public static void writeFacilityToCSV(Map<Facility, Integer> facilityMap, String pathFile, boolean append) {
        List<String> strings = new ArrayList<>();
        Set<Facility> set = facilityMap.keySet();
        for (Facility facility : set) {
            strings.add(facility.getInfo() + "," + facilityMap.get(facility));
        }
        writeObjectToCSV(strings, pathFile, append);
    }
}
