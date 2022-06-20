package Luyen_tap.static_luyentap;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return getVolume();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+super.toString();
    }
}
