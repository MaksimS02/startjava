  
public class Wolf {

    String nickName = "Fire";
    String sex = "male";
    String color = "grey";
    float weight = 65.5f;
    int age = 4;
    
    void go() {
        System.out.println("Fire go 5 steps forward");
    }

    void sit() {
        System.out.println("Fire sit ");
    }

    void run() {
        System.out.println("Fire run 25 steps");
    }

    boolean howl() {
        System.out.println("Fire howl");
        return true;

    }
    
    String hunt() {
        System.out.println("Fire hunt");
        return "yes";
    }
}