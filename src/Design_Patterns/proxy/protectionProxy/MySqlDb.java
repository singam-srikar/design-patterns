package Design_Patterns.proxy.protectionProxy;

public class MySqlDb implements Database{
    @Override
    public void delete() {
        System.out.println("User deleted");
    }
}
