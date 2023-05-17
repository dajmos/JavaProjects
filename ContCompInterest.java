/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ContCompInterest {
    public static void main(String[] args) {

        int p = Integer.parseInt(args[0]);  // principal investment

        int t = Integer.parseInt(args[1]); // time in years

        double r = Double.parseDouble(args[2]); // yearly interest rate

        double result = (p * Math.pow((1 + (r / 100)), t));
        System.out.println(result);
    }
}
