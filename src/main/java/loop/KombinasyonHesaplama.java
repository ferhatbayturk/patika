package loop;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz  : ");
        int n = input.nextInt();
        System.out.print("ikinci sayiyi giriniz : ");
        int r = input.nextInt();

        int nTotal = 1;
        int rTotal =1;
        int nrTotal = 1;
        int result = 1;

        for (int i = 1; i <=n ; i++) {
            nTotal = nTotal*i;
        }
        System.out.println("birinci sayi faktoriyel degeri : " +nTotal);

        for (int i = 1; i <= r; i++) {
            rTotal=rTotal*i;

        }
        System.out.println("ikinci sayi faktoriyel degeri : "+rTotal);

        for (int i = 1; i <=(n-r) ; i++) {
            nrTotal=nrTotal*i;
        }
        System.out.println("(n-r) kaktoriyel degeri : "+ nrTotal);

        result=nTotal/(rTotal*nrTotal);

        System.out.println("C(n,r) = n! / (r! * (n-r)!) ==> isleminin sonucu : "+result);


    }
}
