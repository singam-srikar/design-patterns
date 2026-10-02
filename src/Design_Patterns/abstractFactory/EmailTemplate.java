package Design_Patterns.abstractFactory;

public class EmailTemplate implements Template{
    @Override
    public void processTemplate() {
        System.out.println("Processing Email template");
    }
}
