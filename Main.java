package ro.fasttrackit.curs8.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Dog("Azorel");
        animal.eat(" carne ");
        animal=new Cat();
        animal.eat("Carne");
        plimbaAnimalul(new Dog("Nero"));
        plimbaAnimalul(new Cat());
    }

    public static void plimbaAnimalul(Animal pet){
        pet.travel(100);
    }
}
