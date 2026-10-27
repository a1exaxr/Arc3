public class Snake extends Animal{

private int slitherSpeed;
    public Snake (String name, int age, int hunger, int happiness, int time, int slitherSpeed) {
        super(name, age, hunger, happiness, time);
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.happiness = happiness;
        this.time = time;
        this.slitherSpeed = slitherSpeed;
    }

    @Override
    public void eating(){

    }


    @Override
    public void makeSound(){

    }
}
