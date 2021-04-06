package ro.fasttrackit.curs8.interfaces;

public class Chicken implements Animal{
    @Override
    public String travel(int distance) {
        return "Chicken-walking";
    }

    @Override
    public String eat(String food) {
        return "Chicken-eating";
    }

    @Override
    public String talk(String talking) {
        return "Chicken-talking";
    }
}
