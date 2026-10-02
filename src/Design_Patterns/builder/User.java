package Design_Patterns.builder;

public class User {
    private String name;
    private int age;
    private String city;
    private Double salary;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.city = userBuilder.city;
        this.salary = userBuilder.salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }
    //using static because we can directly cal this builder using class name
    public static class UserBuilder{
        private String name;
        private int age;
        private String city;
        private Double salary;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder setSalary(Double salary) {
            this.salary = salary;
            return this;
        }

         User build(){
            return new User(this);
        }
    }


}


