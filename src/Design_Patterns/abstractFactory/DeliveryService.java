package Design_Patterns.abstractFactory;

import Design_Patterns.abstractFactory.factories.EmailFactory;
import Design_Patterns.abstractFactory.factories.NotificationFactory;

public class DeliveryService {
    public void process(){
        NotificationFactory notification = new EmailFactory();
        Notification notification1 = notification.processNotification();
        notification1.sendNotification();
    }
}
