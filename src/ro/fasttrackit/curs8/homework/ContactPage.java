package ro.fasttrackit.curs8.homework;

public class ContactPage {
    private String[] message;

    public ContactPage(String[] message) {
        this.message = message;
    }

    public void advertisingMessage(AdvertisingServices platform){
        for(String msg:message ){
            platform.advertising(msg);
        }
    }
}
