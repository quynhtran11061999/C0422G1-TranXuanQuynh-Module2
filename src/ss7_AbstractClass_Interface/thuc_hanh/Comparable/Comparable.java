package ss7_AbstractClass_Interface.thuc_hanh.Comparable;
import ss6_ke_thua.bai_tap.Circle_Cylinder.Circle;
public class Comparable extends Circle implements java.lang.Comparable <Comparable> {
   public Comparable(){
   }
   public Comparable(double radius){
       super(radius);
   }

    public Comparable(double radius, String color) {
        super(radius, color);
    }

    @Override
    public int compareTo(Comparable o) {
        if (getRadius()>o.getRadius())return 1;
        else if (getRadius()<o.getRadius())return -1;
        else return 1;
    }
}
