package ss6_ke_thua.bai_tap.Point_MoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){
    }
    public MoveablePoint(float xSpeed, float ySpeed,float x,float y){
        super(x, y);
        this.xSpeed =xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] array1 = {getxSpeed(),getySpeed()};
        return  array1;
    }

//    @Override
//    public String toString() {
//        return "MoveablePoint{" +
//                "xSpeed=" + xSpeed +
//                ", ySpeed=" + ySpeed +
//                "x =" +super.getX()+ "y ="+super.getY()+
//                '}';

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + super.getX() +
                ", y=" + super.getY() +
                '}';
    }

    public MoveablePoint move(){
        super.setX(super.getX()+xSpeed);
        super.setY(super.getY()+ySpeed);
        return this;
    }
}
