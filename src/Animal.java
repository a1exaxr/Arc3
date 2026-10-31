public abstract class Animal{
   private String name;
    private int age;
    private int hunger;
    private int happiness;
    private int time;

    public Animal (String name, int age, int hunger, int happiness, int time) {
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.happiness = happiness;
        this.time = time;
    }

    //methods
    public abstract void eating();

    public abstract void makeSound();

    public void feed() {
        hunger = hunger - 10;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Hunger: " + hunger +", Happiness: " + happiness+ ", Time: " + time;
    }



//testing
    //testing 2



}
