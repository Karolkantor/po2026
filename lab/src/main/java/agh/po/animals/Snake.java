package agh.po.animals;

public class Snake extends Animal {
    public Snake(String name) {super(name, 0);}

    @Override
    public String getDescription() {
        return "Waz " + name + " nie ma nog.";
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Sssss!");
    }
}
