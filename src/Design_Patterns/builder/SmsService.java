package Design_Patterns.builder;

public class SmsService {
    // only 2 params required and we can easily pass without changing user class
    public void sendSms() {
        User user = new User.UserBuilder()
                .setName("Hi")
                .build();
        System.out.println("User----"+user);
    }
}
