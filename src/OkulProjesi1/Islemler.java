package OkulProjesi1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Kisi> toplamListe=new ArrayList<>();
    static int secim;
    static Scanner scan=new Scanner(System.in);

    static void giris(){
        System.out.println("Lutfen islem turunu seciniz. \nogrenci 1 \nogretmen 2");
        secim=scan.nextInt();

        islemler();


    }

    private static void islemler() {
        System.out.println("Lutfen isleminizi seciniz; \nEkle 1, Listele 2, sil 3, Ara 4, anamenu 5, cıkıs 6");
        int secim=scan.nextInt();

        switch(secim){
            case 1 :
                ekle();
                islemler();
                break;
            case 2 :
                islemler();
                break;
            case 3 :
                islemler();
                break;
            case 4 :
                islemler();
                break;
            case 5 :
                islemler();
                break;
            case 6 :
                islemler();
                break;
            default:
                System.out.println("Hatalı giris");

        }
    }

    private static void ekle() {
        if (secim==1){    //ogrenci ise
            System.out.println("Lutfen isim ve soyısım beraber giriniz");
            scan.next();
            String istenenSoyisim=scan.nextLine();
            System.out.println("Lutfen kimlik no giriniz");
            String kimlikNo=scan.next();
            System.out.println("Lutfen yasınızı giriniz");
            int yas=scan.nextInt();
            System.out.println("Lutfen numarasını giriniz");
            String numara=scan.next();
            System.out.println("Lutfen sınıfını giriniz");
            String sinif=scan.next();

            Ogrenci mazlumOgrenci=new Ogrenci(istenenSoyisim,kimlikNo,yas,numara,sinif);
            toplamListe.add(mazlumOgrenci);
            System.out.println(toplamListe);

        }
    }

}
