import java.util.ArrayList;




public class Main{
    public static void main(String[] args){


        //lizt
        ArrayList<Animal> habitat = new ArrayList<>();


        habitat.add(new Lion("Bob", 2, 100, 100, 2, 5.0));
        habitat.add(new Penguin("Pete", 3, 80, 90, 1, 20));
        habitat.add(new Snake("Sly", 4, 60, 70, 3, 10));
        //dolphin
        habitat.add(new Dolphin("Dollylolly", 5, 50, 100, 2));
//for
        for (Animal a : habitat) {
            System.out.println(a);
            a.eating();
            a.makeSound();
            System.out.println();
        }

//make animal objects (chidl classes)
       // Lion L1 = new Lion("Bob", 2, 100, 100, 2, 5.0);
     //   Penguin P1 = new Penguin("Pete", 3, 80, 90, 1, 20);
       // Snake S1 = new Snake("Sly", 4, 60, 70, 3, 10);
//lion
      //  System.out.println(L1);
      //  L1.eating();
      //  L1.makeSound();
//penguin
      //  System.out.println(P1);
      //  P1.eating();
      //  P1.makeSound();
//snak//e
      //  System.out.println(S1);
      //  S1.eating();
      //  S1.makeSound();

        System.out.println("Swimming Animals:");
        ArrayList<Swimmer> swimmers = new ArrayList<>();

        swimmers.add(new Penguin("Penny", 3, 50, 90, 1, 20));
        swimmers.add(new Dolphin("Dollylolly", 5, 50, 100, 2));
        //for
        for (Swimmer s : swimmers) {
            s.swim();
        }

    }
}