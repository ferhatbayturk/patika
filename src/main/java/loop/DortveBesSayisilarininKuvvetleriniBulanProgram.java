package loop;

import java.util.Scanner;

public class DortveBesSayisilarininKuvvetleriniBulanProgram {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz = ");
        n = input.nextInt();

        for (int i = 1; i <=n ; i*=4) {
            System.out.println("4'un kuvvetleri = " + i);
        }
        System.out.println();
        for (int i = 1; i <=n ; i*=5) {
            System.out.println("5'in kuvvetleri = " + i);

        }
        




    }
}
