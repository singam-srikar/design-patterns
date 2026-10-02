package Design_Patterns.singleton;

public class Calculator {
    public int a;
    public int b;

    private static Calculator obj;
    private Calculator(){
        System.out.println("Instance created");
    }
    public static Calculator getInstance(){
        if(obj == null){
            obj= new Calculator();
        }
        return obj;
    }

    public int sum(){
        return a+b;
    }

}
