package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            String row = "";
            for (int j = 0; j <= i; j++) row += "*";
            for (int j = i; j < n - 1; j++) row += j + 2;
            System.out.println(row);
        }

        for (int i = n; i > 0; i--) {
            String row = "";
            for (int j = 0; j < i; j++) row += "*";
            for (int j = i; j < n; j++) row += j + 1;
            System.out.println(row);
        }
    }

}