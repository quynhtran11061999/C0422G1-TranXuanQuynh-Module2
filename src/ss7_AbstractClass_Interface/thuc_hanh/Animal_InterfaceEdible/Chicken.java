package ss7_AbstractClass_Interface.thuc_hanh.Animal_InterfaceEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: chipchip";
    }

    @Override
    public String howToEat() {
        return " ăn trái cây";
    }
}
