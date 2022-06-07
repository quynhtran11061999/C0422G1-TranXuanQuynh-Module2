package ss1_introduct_to_java.thuc_hanh;

import java.util.Scanner;

public class WeightIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.println("Nhập cân nặng:");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều cao:");
        height = Double.parseDouble(scanner.nextLine());
        bmi = weight/Math.pow(height,2);
        System.out.println("BMI is: " + bmi);
        if (bmi<18.5){
            System.out.println("BMI: Underweight");
        } else if (bmi<25.0){
            System.out.println("BMI: Normal");
        } else if (bmi<30.0){
            System.out.println("BMI: Overweight");
        } else {
            System.out.println("BMI: Obese");
        }
    }
}
