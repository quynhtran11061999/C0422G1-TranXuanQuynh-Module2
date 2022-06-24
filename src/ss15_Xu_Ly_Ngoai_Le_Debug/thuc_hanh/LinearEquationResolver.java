package ss15_Xu_Ly_Ngoai_Le_Debug.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation 'a*x+b=0'");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b");
        double b = Double.parseDouble(scanner.nextLine());
        if (a != 0){
            double solution = -b/a;
            System.out.println("The solution is: "+solution);
        } else {
            if (b==0){
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
