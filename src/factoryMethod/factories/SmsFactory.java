package factoryMethod.factories;

import factoryMethod.Notification;
import factoryMethod.SMSNotification;

public class SmsFactory implements NotificationFactory {
    @Override
    public Notification processNotification() {
        return new SMSNotification();
    }
}
