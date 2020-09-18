package pl.coderslab.eparametrystartowe;

public class Main06 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if (x < 1 || y < 1) System.out.println("Error, x or y is less than one");
        while (y != 0) {
            int tmp = x;
            x = y;
            y = tmp % y;
        }
        System.out.println(x);
    }

}