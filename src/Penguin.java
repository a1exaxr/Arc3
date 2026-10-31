public class Penguin extends Animal{
 private int swimSpeed;
    public Penguin (String name, int age, int hunger, int happiness, int time, int swimSpeed) {
        super(name, age, hunger, happiness, time);
        this.swimSpeed = swimSpeed;
    }


    @Override
    public void eating(){
        System.out.println(getName() + " eats fish.");

    }


    @Override
    public void makeSound(){
        System.out.println(getName() + " squawks!");
    }
}
