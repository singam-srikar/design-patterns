package Design_Patterns.abstractFactory;

public class EmailNotification implements Notification {

    public void sendNotification() {
        System.out.println("Email sent");
    }
}
