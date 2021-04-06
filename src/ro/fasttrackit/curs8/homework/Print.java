package ro.fasttrackit.curs8.homework;

public class Print implements AdvertisingServices{
    private final String adress;

    public Print(String adress){
        this.adress=adress;
    }

    @Override
    public void advertising(String message) {
        System.out.println("The printed advertise : " + message + "was sent to the adress " + adress);
    }
}
