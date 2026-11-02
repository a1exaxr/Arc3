public class Lion extends Animal{

    private double territorySizeFt;

    public Lion(String name, int age, int hunger, int happiness, int time, double territorySizeFt) {
        super(name, age, hunger, happiness, time);
        this.territorySizeFt =  territorySizeFt;
    }



@Override
    public void eating(){

    System.out.println(getName() + " eats meat.");

}

    @Override
    public void makeSound(){
        System.out.println(getName() + " roars!");
    }
}
