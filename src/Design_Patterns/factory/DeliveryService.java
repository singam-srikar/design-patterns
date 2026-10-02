package Design_Patterns.factory;

public class DeliveryService {
    public void process(String notificationType){
        Notification notification = NotificationFactory.processNotification(notificationType);
        notification.sendNotification();
    }
}
