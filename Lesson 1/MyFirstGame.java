public class MyFirstGame {
    public static void main(String[] args) {
        int usernumber = 40;
        int guessnumber = 90;
        System.out.println("Guess a Number from 0 to 100");
        while (guessnumber != usernumber) {
            if (guessnumber > usernumber) {
                System.out.println(usernumber + " My Number is higher");
                usernumber++;
            } else if (guessnumber < usernumber) {
                System.out.println(usernumber + " My Number is lower");
                usernumber--;
            }
        }
        System.out.println(usernumber + " You Guess");
    }
}
