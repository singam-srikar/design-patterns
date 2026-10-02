package Design_Patterns.abstractFactory.factories;

import Design_Patterns.abstractFactory.Notification;
import Design_Patterns.abstractFactory.Template;

public interface NotificationFactory {
   Notification processNotification();
   Template processTemplate();
}
