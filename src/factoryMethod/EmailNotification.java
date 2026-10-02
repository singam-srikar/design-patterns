package factoryMethod;

import factoryMethod.factories.EmailFactory;

public class EmailNotification implements Notification {

    public void sendNotification() {
        System.out.println("Email sent");
    }
}
