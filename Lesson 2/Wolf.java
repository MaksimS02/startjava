public class Wolf {

    private String nickName = "Fire";
    private String sex = "male";
    private String color = "grey";
    private float weight = 65.5f;
    private int age = 4;

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getNickName() {
        return nickName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setWeight(float weight) {
        if(weight > 100) {
            System.out.println("Uncorrect weight");
        } else {
        this.weight = weight;
        }
    }
    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Uncorrect age");
        } else {
        this.age = age;
        }
    }
    public int getAge() {
        return age;
    }

    public void go() {
        System.out.println("Fire go 5 steps forward");
    }

    public void sit() {
        System.out.println("Fire sit ");
    }

    public void run() {
        System.out.println("Fire run 25 steps");
    }

    public boolean howl() {
        System.out.println("Fire howl");
        return true;
    }

    public String hunt() {
        System.out.println("Fire hunt");
        return "yes";
    }
}