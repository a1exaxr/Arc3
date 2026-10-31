public class Dolphin extends Animal implements Swimmer {

    public Dolphin(String name, int age, int hunger,int happiness, int time) {
        super(name, age, hunger, happiness, time);
    }

    //methodsmethodsmethods
    @Override
    public void eating() {
        System.out.println(getName() + " eats fish.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " clicks and whistles!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims through the ocean!");
    }
}
