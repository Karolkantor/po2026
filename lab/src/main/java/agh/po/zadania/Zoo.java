package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;

import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];

    // Wypełnienie tablicy losowymi zwierzętami
    void fillAnimals() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    animals[i] = new Parrot("Papuga" + i);   // <-- breakpoint (Zadanie 1)
                    break;
                case 1:
                    animals[i] = new Dog("Pies" + i);
                    break;
                default:
                    animals[i] = new Snake("Waz" + i);
                    break;
            }
        }
    }

    // Suma nóg wszystkich zwierząt
    int countLegs() {
        int sum = 0;
        for (Animal animal : animals) {
            int legs = animal.getLegs();
            sum += legs;
        }
        return sum;
    }

    //2, 4 i 5
    void describeAll() {
        for (Animal animal : animals) {
            String description = animal.getDescription();
            System.out.println(description);
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.fillAnimals();
        zoo.describeAll();
        System.out.println("Suma nóg: " + zoo.countLegs());
    }
}
