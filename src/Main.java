import java.util.Scanner; //kullanicidan veri alabilmek için scanner sınıfını projeye dahil ediyoruz

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);  //kullaınıcıdan (input) veri alabilmek için

        double uzun,kisa,hipotenus;  //değişkenerimizi tanımlıyoruz

        System.out.print("Uzun kenarı giriniz:");
        uzun= input.nextInt();
        System.out.print("Kısa kenarı giriniz:");
        kisa=input.nextInt();
        hipotenus=(kisa*kisa+uzun*uzun);
        System.out.print("Hipotenus uzunluğu:"+Math.sqrt(hipotenus));

    }
}