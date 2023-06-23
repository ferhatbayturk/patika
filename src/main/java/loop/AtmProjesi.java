package loop;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
/*
        while (right > 0) {
            System.out.print("Kullanici adinizi giriniz : ");
            userName = input.nextLine();
            System.out.print("Parolanizi giriniz : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("sisteme giris yaptiniz...FB bankasina Hosgeldiniz...");
                do {

                    System.out.println("1- Para Yatirma\n" +
                            "2- Para Cekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Para miktari : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Para miktari : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz");

                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);

                    }
                } while (select != 4);
                System.out.println("Tekrar gorusmek uzere ...");
                break;

            } else {
                right--;
                System.out.println("kullanici adi veya password hatali. Tekrar deneyiniz...");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur .Lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz : " + right);
                }

            }
        }

 */
        while (right > 0) {
            System.out.print("Kullanici adinizi giriniz : ");
            userName = input.nextLine();
            System.out.print("Parolanizi giriniz : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("123")) {
                System.out.println("sisteme giris yaptiniz...FB bankasina Hosgeldiniz...");
                do {

                    System.out.println("1- Para Yatirma\n" +
                            "2- Para Cekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para miktari : ");
                            int price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.println("Para miktari : ");
                            int pric = input.nextInt();
                            if (pric > balance) {
                                System.out.println("Bakiye yetersiz");

                            } else {
                                balance -= pric;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                }
                        while (select != 4) ;
                        System.out.println("Tekrar gorusmek uzere ...");
                        break;

                } else{
                    right--;
                    System.out.println("kullanici adi veya password hatali. Tekrar deneyiniz...");
                    if (right == 0) {
                        System.out.println("Hesabiniz bloke olmustur .Lutfen banka ile iletisime geciniz.");
                    } else {
                        System.out.println("Kalan hakkiniz : " + right);


                }
            }

        }
    }
}
