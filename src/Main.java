public class Main{
    public static void main(String[] args){

//make animal objects (chidl classes)
        Lion L1 = new Lion("Bob", 2, 100, 100, 2, 5.0);
        Penguin P1 = new Penguin("Pete", 3, 80, 90, 1, 20);
        Snake S1 = new Snake("Sly", 4, 60, 70, 3, 10);
//lion
        System.out.println(L1);
        L1.eating();
        L1.makeSound();
//penguin
        System.out.println(P1);
        P1.eating();
        P1.makeSound();
//snake
        System.out.println(S1);
        S1.eating();
        S1.makeSound();



    }
}