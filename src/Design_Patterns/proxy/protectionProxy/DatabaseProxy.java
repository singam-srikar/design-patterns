package Design_Patterns.proxy.protectionProxy;

import java.util.Objects;

public class DatabaseProxy implements Database{
    private final Database database;
    private final String role;

    public DatabaseProxy(String role) {
        this.database = new MySqlDb();
        this.role = role;
    }

    @Override
    public void delete() {
        //it is protecting access to real object
        if(Objects.equals(role, "ADMIN")){
            database.delete();
        }
        else System.out.println("Unauthorised user - "+role);
    }
}
