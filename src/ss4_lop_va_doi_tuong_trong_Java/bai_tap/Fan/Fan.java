package ss4_lop_va_doi_tuong_trong_Java.bai_tap.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW; // mặc định tốc độ chậm
    private boolean on = false; // mặc định quạt tắt
    private double radius = 5;  // mặc định bán kinh là 5
    private String color = "blue"; // mặc định quạt màu xanh

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
    }
    public String toString() {
        if (isOn() == true) {
            return "Tốc độ quạt: " + this.speed + ", quạt có màu: " + this.color + ", quạt có kích thước: " + this.radius + " quạt đang bật";
        }
        else return "Quạt có màu: " + this.color + ", quạt có kích thước: " + this.radius + " quạt đang tắt";
    }
}
