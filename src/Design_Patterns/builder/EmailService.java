package Design_Patterns.builder;

public class EmailService {
    public void sendEmail() {
        User user = new User.UserBuilder()
                .setName("Hi")
                .setCity("Hyd")
                .setSalary(90000.0)
                .setAge(28)
                .build();
        System.out.println("User----"+user);
    }
}
