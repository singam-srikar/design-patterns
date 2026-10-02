package Design_Patterns.factoryMethod.factories;

import Design_Patterns.factoryMethod.EmailNotification;
import Design_Patterns.factoryMethod.Notification;

public class EmailFactory implements NotificationFactory{
    @Override
    public Notification processNotification() {
        return new EmailNotification();
    }
}
