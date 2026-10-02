package factoryMethod;

import factoryMethod.factories.NotificationFactory;
import factoryMethod.factories.SmsFactory;

import java.util.List;

public class OrderService {
    public void process(){
      NotificationFactory notificationFactory = new SmsFactory();
      Notification notification = notificationFactory.processNotification();
      notification.sendNotification();
    }
}
