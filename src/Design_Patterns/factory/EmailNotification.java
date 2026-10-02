package Design_Patterns.factory;

public class EmailNotification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("Email sent");
    }
}
