package Design_Patterns.singleton;

public class Calculator {
    public int a;
    public int b;

    private static Calculator obj;

    private Calculator() {
        System.out.println("Instance created");
    }
    // we can simply use synchronized keyword here
//    public static synchronized Calculator getInstance(){
//        if(obj == null){
//            obj= new Calculator();
//        }
//        return obj;
//    }

    //once obj created no need to wait other threads due to synchronized keyword to avoid this we use block
    public static Calculator getInstance() {
        if (obj == null) {//2nd time it won't check after obj created once
            synchronized (Calculator.class) {
                if (obj == null) {
                    obj = new Calculator();
                }
            }
        }
        return obj;
    }

//    public int sum(){
//        return a+b;
//    }

}
