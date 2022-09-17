import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi=scanner.nextInt();
        boolean asalmi=true;
        //1 sayısı ve negatif sayolar asal olmadığından ekrana değildir yazdırırız
        if (sayi<1){
            System.out.println("Yanlış sayı girdiniz");
            return;
        }

        if (sayi==1){
            System.out.println("sayı asal değildir");
            return;
        }
        //girilen sayıya kadar olan tüm sayılara bölüyoruz böylece asal olup olmadığını anlıyoruz
        for (int i=2;i<sayi;i++){
            if (sayi % i==0){
                asalmi=false;
            }
        }
        if (asalmi){
            System.out.println("sayı asladır");
        }else {
            System.out.println("sayı asal değildir");
        }
    }
}