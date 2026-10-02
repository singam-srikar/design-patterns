package Design_Patterns.abstractFactory;

import Design_Patterns.abstractFactory.factories.NotificationFactory;
import Design_Patterns.abstractFactory.factories.SmsFactory;

public class OrderService {
    public void process(){
      NotificationFactory notificationFactory = new SmsFactory();
      Notification notification = notificationFactory.processNotification();
      notification.sendNotification();
      Template template = notificationFactory.processTemplate();
      template.processTemplate();
    }
}
