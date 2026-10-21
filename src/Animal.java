public abstract class Animal {
    String name;
    int age;
    int hunger;
    int happiness;
    int time;

    public Animal (String name, int age, int hunger, int happiness, int time) {
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.happiness = happiness;
        this.time = time;
    }

    //methods
    public abstract void eating();

//testing



}
