/******************************************************************************
 *  Compilation:  javac RandomNumberAandB.java
 *  Execution:    java RandomNumberAandB a b
 *
 *  Prints random integer number inclusive between a & b.
 ******************************************************************************/

public class RandomNumberAandB {
    public static void main(String[] args) {

        // reads in first value from command line
        int a = Integer.parseInt(args[0]);

        // reads in second value from command line
        int b = Integer.parseInt(args[1]);

        // calculates random number inclusive between a & b
        int random = (int) Math.floor(Math.random() * (b - a + 1) + a);
        System.out.println(random);

    }
}
