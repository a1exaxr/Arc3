public class Penguin extends Animal{
 private int swimSpeed;
    public Penguin (String name, int age, int hunger, int happiness, int time, int swimSpeed) {
        super(name, age, hunger, happiness, time);
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.happiness = happiness;
        this.time = time;
        this.swimSpeed = swimSpeed;
    }


    @Override
    public void eating(){

    }


    @Override
    public void makeSound(){

    }
}
