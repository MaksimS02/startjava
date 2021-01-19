public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if (age > 20) { 
            System.out.println ("adult");
        }

        boolean male = true;
        if (male) { 
            System.out.println ("men");
        }
        if (!male) { 
            System.out.println ("women");
        }

        double high = 1.86;
        if (high < 1.80) { 
            System.out.println ("small");
        } else {
            System.out.println ("tall");
        }

        char firstletter = 'I';
        if (firstletter == 'M') {
            System.out.println ("First Letter is M");
        } else if (firstletter == 'I') {
            System.out.println ("First Letter is I");
        } else {
            System.out.println ("not letter M or I");
        }
    }
}
