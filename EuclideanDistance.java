/******************************************************************************
 *  Compilation:  javac EuclideanDistance.java
 *  Execution:    java EuclideanDistance x y
 *
 *  Prints Euclidean distance between origin (0,0) and the point (x,y).
 ******************************************************************************/

public class EuclideanDistance {
    public static void main(String[] args) {

        // reads first argument from command line
        int x = Integer.parseInt(args[0]);

        // reads second argument from command line
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt((x * x) + (y * y));

        System.out.println(distance);
    }
}
