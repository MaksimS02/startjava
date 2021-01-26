public class Person {

    String name = "Jim";
    String sex = "male";
    int height = 195;
    float weight = 90.5f;
    int age = 30;
    
    void go() {
        System.out.println("Jim go 10 steps forward");
    }

    void sit() {
        System.out.println("Jim sit on the chair");
    }

    void run() {
        System.out.println("Jim run 20 steps");
    }

    boolean talk() {
        System.out.println("Jim talk");
        return true;

    }
    
    String learnJava() {
        System.out.println("Jim learn Java");
        return "yes";
    }
}