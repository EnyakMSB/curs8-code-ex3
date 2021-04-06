package ro.fasttrackit.curs8.interfaces;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String travel(int distance) {
        System.out.println("Waling like " + name + " dog " + distance + " meters");
    }

    @Override
    public String eat(String food) {
        System.out.println("Dog " + name + " eating " + food);
    }

    @Override
    public String talk(String talking) {
        return "Ham-Ham";
    }
}