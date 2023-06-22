package loop;

import java.util.Scanner;

public class BasamakSayilariniToplama {
    public static void main(String[] args) {

       // Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

       // Örnek : 1643 = 1 + 6 + 4 + 3 = 14


        Scanner input = new Scanner(System.in);

        System.out.print("sayi giriniz : ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue =0;
        int result =0;
        int basPow;

        while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }

        tempNumber=number;
        while (tempNumber!=0){
            basValue+=tempNumber%10;
            tempNumber/=10;
        }
        System.out.println(number + " sayisinin basamak sayilarinin toplami : " + basValue);
    }
}
