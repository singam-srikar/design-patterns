package Design_Patterns.abstractFactory;

public class SMSTemplate implements Template{
    @Override
    public void processTemplate() {
        System.out.println("Processing Sms template");
    }
}
