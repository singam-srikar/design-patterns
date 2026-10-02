package factoryMethod.factories;

import factoryMethod.EmailNotification;
import factoryMethod.Notification;
import factoryMethod.SMSNotification;

public class EmailFactory implements NotificationFactory{
    @Override
    public Notification processNotification() {
        return new EmailNotification();
    }
}
