import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main{
    public static void main(String[] args){

        //lizt
        ArrayList<Animal> habitat = new ArrayList<>();

        habitat.add(new Lion("Bob", 2, 100, 100, 2, 5.0));
        habitat.add(new Penguin("Pete", 3, 80, 90, 1, 20));
        habitat.add(new Snake("Sly", 4, 60, 70, 3, 10));
        habitat.add(new Dolphin("Dollylolly", 5, 50, 100, 2));
//for
        for (Animal a : habitat) {
            System.out.println(a);
            a.eating();
            a.makeSound();
            System.out.println();
        }

        System.out.println("Swimming Animals:");
        ArrayList<Swimmer> swimmers = new ArrayList<>();

        swimmers.add(new Penguin("Penny", 3, 50, 90, 1, 20));
        swimmers.add(new Dolphin("Dollylolly", 5, 50, 100, 2));
        //for
        for (Swimmer s : swimmers) {
            s.swim();
        }

        try {
            FileWriter writer = new FileWriter("save.txt");
            for (Animal a : habitat) {
                writer.write(a.toCsv() + "\n");
            }
            writer.close();
            System.out.println("Animals successfully saved!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            Scanner fileScanner = new Scanner(new File("save.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                // We'll use these values to recreate each animal.
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }


//

        try {
            Scanner fileScanner = new Scanner(new File("save.txt"));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // ... turn this line into an object ...
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        System.out.println(new File("save.txt").getAbsolutePath());
    }
}

