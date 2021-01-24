public class MyFirstGame {
    public static void main(String[] args) {
        int UserNumber = 40;
        int b = 90;
        System.out.println("Guess a Number from 0 to 100");
        while (b !=UserNumber) {
            if (b > UserNumber) {
                System.out.println(UserNumber + " My Number is higher");
                UserNumber++;
            } else if (b < UserNumber) {
                System.out.println(UserNumber + " My Number is lower");
                UserNumber--;
            }
        }
        System.out.println(UserNumber + " You Guess");
    }
}
