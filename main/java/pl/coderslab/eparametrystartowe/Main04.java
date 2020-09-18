package pl.coderslab.eparametrystartowe;

public class Main04 {

    public static void main(String[] args) {
        int max = 0;
        for (String i : args) {
            if (max < Integer.parseInt(i)) max = Integer.parseInt(i);
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == max) {
            if (b + c > a) System.out.println("YES");
            else System.out.println("NO");
        }
        else if (b == max) {
            if (a + c > b) System.out.println("YES");
            else System.out.println("NO");
        }
        else {
            if (a + b > c) System.out.println("YES");
            else System.out.println("NO");
        }

    }

}