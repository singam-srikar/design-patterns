package Design_Patterns.factoryMethod;

public class SMSNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("SMS sent");
    }
}
