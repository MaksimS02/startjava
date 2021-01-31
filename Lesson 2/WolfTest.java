public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setNickName("Cold");
        System.out.println("nickName = " + wolfOne.getNickName());
        wolfOne.setColor("female");
        System.out.println("sex = " + wolfOne.getSex());
        wolfOne.setColor("red");
        System.out.println("color = " + wolfOne.getColor());
        wolfOne.setWeight(85.6f);
        System.out.println("weight = " + wolfOne.getWeight());
        wolfOne.setAge(10);
        System.out.println("age = " + wolfOne.getAge());
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}