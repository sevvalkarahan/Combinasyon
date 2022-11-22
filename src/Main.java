import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kombinasyon formülü: C(n,r)= n!/(r!*(n-r)!)");
        Scanner inp=new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        int n=inp.nextInt();
        System.out.print("r değerini giriniz: ");
        int r=inp.nextInt();
        int faktor_n=1, faktor_r=1, faktor_n_r=1;
        for (int i = 1; i <=n ; i++) {
            faktor_n=faktor_n*i;
        }
        System.out.println(n+"! = "+faktor_n);


        for (int i = 1; i <=r ; i++) {
            faktor_r=faktor_r*i;
        }
        System.out.println(r+"! = "+faktor_r);


        int k=n-r;
        for (int i = 1; i <=k ; i++) {
            faktor_n_r=faktor_n_r*i;
        }
        System.out.println("("+ (n-r) +")"+"! =" +faktor_n_r);
        System.out.println("Combinasyon");
        int combinasyon=faktor_n/(faktor_r*faktor_n_r);
        System.out.println("C(n,r) komninasyon işlemi : "+combinasyon);
    }
}
