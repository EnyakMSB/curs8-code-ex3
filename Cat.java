package ro.fasttrackit.curs8.interfaces;

public class Cat implements Animal {
    @Override
    public String travel(int distance) {
        return "Cat-walking";
    }

    @Override
    public String eat(String food) {
        if (food.equalsIgnoreCase("cat food")) {
            System.out.println("Eating " + food);
        } else {
            System.out.println("Not eating " + food);
        }
    }

    @Override
    public String talk(String talking) {
        return "Miau";
    }
}