package ss6_ke_thua.bai_tap.Point2D_Point3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){
    }
    public Point2D(float x,float y){
        this.x = x;
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
//        float[] array = new float[2];
//        array[0] = x;
//        array[1] = y;
//
        float[] array = {x,y};
        return array;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getXY()[0] +
                ", y=" + getXY()[1] +
                '}';
    }
}
