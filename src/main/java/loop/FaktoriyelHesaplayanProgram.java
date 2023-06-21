package loop;
import java.util.Scanner;
public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in) ;
        System.out.print("Faktoriyel sayisi girin = ");
       int n = input.nextInt();
       int total = 1;

        for (int i = 1; i <=n ; i++) {
            total =total*i;
        }
        System.out.println(n+". Faktoriyel : "+total);




    }
}
