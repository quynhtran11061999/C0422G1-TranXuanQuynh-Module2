package ss7_AbstractClass_Interface.bai_tap.Resizeable;

    public class Square extends Rectangle implements Resizeable, Colorable{
        public Square() {
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public double getSide() {
            return getWidth();
        }

        public void setSide(double side) {
            setWidth(side);
            setHeight(side);
        }
        public double getAreaside(){
            return this.getSide()*2;
        }
        @Override
        public void howToColor() {
            System.out.println("Color all four sides");
        }
        @Override
        public String toString() {
            return "A Square with side="
                    + getSide();
//                    + ", which is a subclass of "
//                    + super.toString();
        }
    }


