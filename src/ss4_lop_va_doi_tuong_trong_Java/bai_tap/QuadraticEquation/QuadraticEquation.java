package ss4_lop_va_doi_tuong_trong_Java.bai_tap.QuadraticEquation;

public class QuadraticEquation {
    Double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }
    public double getRoot1(){
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5))/(2*this.a) ;
    }
    public double getRoot2(){
        return (-this.b - Math.pow(this.getDiscriminant(), 0.5))/(2*this.a) ;
    }

    public String display() {
        return "a: " + a + ", b: " + b + ", c: " + c;
    }
}
