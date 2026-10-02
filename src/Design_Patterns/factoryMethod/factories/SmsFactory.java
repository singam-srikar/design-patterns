package Design_Patterns.factoryMethod.factories;

import Design_Patterns.factoryMethod.Notification;
import Design_Patterns.factoryMethod.SMSNotification;

public class SmsFactory implements NotificationFactory {
    @Override
    public Notification processNotification() {
        return new SMSNotification();
    }
}
