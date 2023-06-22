package loop;

import java.util.Scanner;

public class HarmonikSeriBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" N sayisini giriniz : ");
        double n = input.nextDouble();
        double result = 0;

        for (double i = 1; i <=n ; i++) {
            result+=(1/i);

        }

        System.out.println(result);



    }
}
