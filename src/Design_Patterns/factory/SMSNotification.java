package Design_Patterns.factory;

public class SMSNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("SMS sent");
    }
}
