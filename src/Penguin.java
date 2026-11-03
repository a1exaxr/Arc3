public class Penguin extends Animal implements Swimmer{
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

    //implements

    @Override
    public void swim() {
        System.out.println(getName() + " swims through the water!");
    }


    @Override
    public String toCsv(){
        return "Name: " + name + ", Age: " + age + ", Hunger: " + hunger +", Happiness: " + happiness+ ", Time: " + time + ", Swim Speed: " + swimSpeed;


    }
}
