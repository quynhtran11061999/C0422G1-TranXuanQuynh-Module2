package ss5_AccessModifier_StaticMethod_StaticProperty.bai_tap.Access_Modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return (this.radius * this.radius) * Math.PI;
    }
}
