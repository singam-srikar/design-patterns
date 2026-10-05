package Design_Patterns.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService{

    public void show(){
        User user1 = new User("Hi",22,"Hyd",new ArrayList<>( Arrays.asList("IT","Testing")));
        User user2 = user1.customClone();
        user2.setAge(23);
        List<String> roles = user2.getRoles();
        roles.add("Non-IT");
        System.out.println(user1);
        System.out.println(user2);
    }
}
