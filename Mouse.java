package ro.fasttrackit.curs8.interfaces;

public class Mouse implements Animal{
    @Override
    public String travel(int distance) {
        return "mouse-walking";
    }

    @Override
    public String eat(String food) {
        return "mouse-eating";
    }

    @Override
    public String talk(String talking) {
        return "Chitz";
    }
}
