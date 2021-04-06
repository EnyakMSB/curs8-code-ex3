package ro.fasttrackit.curs8.interfaces;

public class Duck implements Animal{
    @Override
    public String travel(int distance) {
        return "Duck-walking";
    }

    @Override
    public String eat(String food) {
        return "Duck-eating";
    }

    @Override
    public String talk(String talking) {
        return "Duck-talking";
    }
}
