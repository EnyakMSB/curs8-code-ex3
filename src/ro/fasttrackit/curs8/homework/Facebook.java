package ro.fasttrackit.curs8.homework;

public class Facebook implements AdvertisingServices {
    private String user;

    public Facebook(String user) {
        this.user = user;
    }

    @Override
    public void advertising(String message) {
        System.out.println("Adding Advertise : " + message + " for " + user + "facebook page");
    }
}
