package factoryMethod;

import factoryMethod.factories.EmailFactory;
import factoryMethod.factories.NotificationFactory;
import factoryMethod.factories.SmsFactory;

public class DeliveryService {
    public void process(){
        NotificationFactory notification = new EmailFactory();
        Notification notification1 = notification.processNotification();
        notification1.sendNotification();
    }
}
