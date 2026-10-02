package Design_Patterns.factoryMethod;

import Design_Patterns.abstractFactory.Notification;
import Design_Patterns.abstractFactory.Template;
import Design_Patterns.abstractFactory.factories.EmailFactory;
import Design_Patterns.abstractFactory.factories.NotificationFactory;
import Design_Patterns.abstractFactory.factories.SmsFactory;

public class OrderService {
    public void process(){
      NotificationFactory notificationFactory = new SmsFactory();
      Notification notification = notificationFactory.processNotification();
        Template template = notificationFactory.processTemplate();
        template.processTemplate();
      notification.sendNotification();
    }
}
