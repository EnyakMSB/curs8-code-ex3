package ro.fasttrackit.curs8.homework;

public class AdvertisingMain {
    public static void main(String[] args) {
        String[] advertisement = {"There is a great deal of advertising that is much better than the product. When that happens, all " +
                "that the good advertising will do is put you out of business faster."};

        ContactPage contactPage = new ContactPage(advertisement);

        contactPage.advertisingMessage(new Email("user69@gmail.com"));
        contactPage.advertisingMessage(new Facebook("Mircea Radu"));
        contactPage.advertisingMessage(new Print("Ceica,Bihor"));
    }
}
