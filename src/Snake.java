public class Snake extends Animal{

private int slitherSpeed;
    public Snake (String name, int age, int hunger, int happiness, int time, int slitherSpeed) {
        super(name, age, hunger, happiness, time);
        this.slitherSpeed = slitherSpeed;
    }

    @Override
    public void eating(){
        System.out.println(getName() + " eats whole prey.");

    }


    @Override
    public void makeSound(){
        System.out.println(getName() + " hisses!");
    }
}
