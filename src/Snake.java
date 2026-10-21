public class Snake extends Animal{


    public Snake (String name, int age, int hunger, int happiness, int time) {
        super(name, age, hunger, happiness, time);
        this.name = name;
        this.age = age;
        this.hunger = hunger;
        this.happiness = happiness;
        this.time = time;
    }

    @Override
    public void eating(){

    }
}
