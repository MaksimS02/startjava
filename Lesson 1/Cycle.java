public class Cycle {
    public static void main(String[] args) {
            System.out.println ("TASK 1");
        int count;
        for(count = 0; count < 21 ; count = count + 1 )
            System.out.println (count);

            System.out.println ("TASK 2");
        int e = 6;
        while (e >= -6){
            System.out.println (e);
            e=e-2;
        }
            System.out.println ("TASK 3");
        int b = 10;
        int SUMM = 0;
        do{
            b++;
            if(b % 2 != 0){
                SUMM = SUMM + b;
           }
        } while (b < 20);
            System.out.println("Summ Odd Number " + SUMM);
    }
}
