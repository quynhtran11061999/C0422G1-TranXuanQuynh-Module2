package ss5_AccessModifier_StaticMethod_StaticProperty.thuc_hanh.Static_Property;

public class MainCar {
    public static void main(String[] args) {
        Car car1  = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.getNumberOfCars());
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.getNumberOfCars());
    }
}
