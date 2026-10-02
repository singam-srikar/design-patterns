package Design_Patterns.factory;

import java.util.ArrayList;
import java.util.List;

public class NotificationFactory {
    //using static because this class don't have any state so no need to create object but it is non mandatory to use static
    public static Notification processNotification(String type){
        if(type.equals("Email")){
            return new EmailNotification();
        } else if (type.equals("SMS")) {
            return new SMSNotification();
        }
        throw  new UnsupportedOperationException("Notification type not valid");
    }

    public static List<Notification> processNotifications(List<String> types) {
        ArrayList<Notification> arrayList = new ArrayList<>();
        for(String type:types){
            if(type.equals("Email")){
                arrayList.add(new EmailNotification());
            } else if (type.equals("SMS")) {
               arrayList.add(new SMSNotification());
            }
        }
        return arrayList;
    }
}
