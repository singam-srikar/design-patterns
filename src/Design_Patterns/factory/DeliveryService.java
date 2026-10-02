package Design_Patterns.factory;

public class DeliveryService {
    public void process(String notificationType){
        if(notificationType.equals("Email")){
            new EmailNotification().sendNotification();
        }
        if(notificationType.equals("SMS")){
            new SMSNototification().sendNotification();
        }
    }
}
