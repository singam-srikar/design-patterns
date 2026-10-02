package Design_Patterns.abstractFactory.factories;

import Design_Patterns.abstractFactory.Notification;
import Design_Patterns.abstractFactory.SMSNotification;
import Design_Patterns.abstractFactory.SMSTemplate;
import Design_Patterns.abstractFactory.Template;

public class SmsFactory implements NotificationFactory {
    @Override
    public Notification processNotification() {
        return new SMSNotification();
    }

    @Override
    public Template processTemplate() {
        return new SMSTemplate();
    }
}
