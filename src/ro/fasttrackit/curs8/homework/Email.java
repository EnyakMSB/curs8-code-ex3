package ro.fasttrackit.curs8.homework;

public class Email implements AdvertisingServices {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void advertising(String message) {
        System.out.println("Sending email : " + message + " to " + email);
    }
}
