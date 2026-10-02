package Design_Patterns.factory;

public class SMSNototification implements Notification{

    @Override
    public void sendNotification() {
        System.out.println("SMS sent");
    }
}
