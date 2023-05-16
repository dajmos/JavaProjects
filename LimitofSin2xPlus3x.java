/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class LimitofSin2xPlus3x {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double result = Math.sin(2 * t) + Math.sin(3 * t);
        System.out.println(result);
    }
}
