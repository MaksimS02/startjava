public class Cycle {
    public static void main(String[] args) {
        System.out.println("TASK 1");
        for (int i = 0; i < 21; i++) {
            System.out.println (i);
        }

        System.out.println("TASK 2");
        int e = 6;
        while (e >= -6) {
            System.out.println(e);
            e-=2;
        }

        System.out.println("TASK 3");
        int b = 10;
        int sum = 0;
        do {
            b++;
            if(b % 2 != 0) {
            sum +=b;
            }
        } while (b < 20);
            System.out.println("Summ Odd Number " + sum);
    }
}
