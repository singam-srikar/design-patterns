package Design_Patterns.factory;

import java.util.List;

public class OrderService {
    public void process(String notificationType){
       Notification notification = NotificationFactory.processNotification(notificationType);
       notification.sendNotification();
    }
    public void processMultipleNotifications(List<String> types){
        List<Notification> notifications = NotificationFactory.processNotifications(types);
        for(Notification notification:notifications){
            notification.sendNotification();
        }
    }
}
