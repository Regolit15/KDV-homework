import java.util.Scanner;
public class KdvProject {
    public static void main(String[] args) {
        double money,kdv1=0.18,kdv2=0.08,fiyat1,kdvOran,kdvMik;
        boolean kosul;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Tutari Giriniz : ");
        money = input.nextDouble();

        System.out.println("Girilen Tutar : "+money);

        kosul=(0<money) && (1000>money);
        kdvOran = kosul ? 0.18d : 0.08d;

        kdvMik=money*kdvOran;
        fiyat1=(money*kdvOran)+money;

        System.out.println("KDV Orani : " + kdvMik);
        System.out.print("Girilen Tutarin KDV'si Eklenmis olarak : "+ fiyat1);

    }
}
