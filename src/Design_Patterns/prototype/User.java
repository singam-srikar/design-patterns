package Design_Patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class User implements Clonable<User>{
    private String name;
    private int age;
    private String city;
    private List<String> roles;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    //in general we have lot of initialization and heavy file operations in constructor in general
    //it is a one time activity and calling it every time obj created will not required.
    //So we use copy constructor and create objects in prototype pattern
    public User(String name, int age, String city, List<String> roles) {
        System.out.println("Calling constructor 1st time");
        System.out.println("-----------------------------");
        this.name = name;
        this.age = age;
        this.city = city;
        this.roles = roles;
    }
    private User(User user){
        this.name=user.name;
        this.age=user.age;
        this.city=user.city;//shallow copy - all obj shares same data - immutable type
        this.roles=new ArrayList<>(user.roles); //deep copy - separate data - mutable type
    }

    @Override
    public User customClone() {
        return new User(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", roles=" + roles +
                '}';
    }
}
