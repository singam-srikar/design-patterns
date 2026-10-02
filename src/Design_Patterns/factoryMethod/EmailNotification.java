package Design_Patterns.factoryMethod;

public class EmailNotification implements Notification {

    public void sendNotification() {
        System.out.println("Email sent");
    }
}
