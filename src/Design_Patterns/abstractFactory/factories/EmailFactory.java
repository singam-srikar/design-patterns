package Design_Patterns.abstractFactory.factories;

import Design_Patterns.abstractFactory.EmailNotification;
import Design_Patterns.abstractFactory.EmailTemplate;
import Design_Patterns.abstractFactory.Notification;
import Design_Patterns.abstractFactory.Template;

public class EmailFactory implements NotificationFactory {
    @Override
    public Notification processNotification() {
        return new EmailNotification();
    }

    @Override
    public Template processTemplate() {
        return new EmailTemplate();
    }
}
