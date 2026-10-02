package Design_Patterns.factoryMethod;

import Design_Patterns.abstractFactory.Notification;
import Design_Patterns.abstractFactory.Template;
import Design_Patterns.abstractFactory.factories.EmailFactory;
import Design_Patterns.abstractFactory.factories.NotificationFactory;

public class DeliveryService {
    public void process(){
        NotificationFactory notificationFactory = new EmailFactory();
        Notification notification1 = notificationFactory.processNotification();
        Template template = notificationFactory.processTemplate();
        template.processTemplate();
        notification1.sendNotification();
    }
}
