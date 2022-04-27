package OkulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan=new Scanner(System.in);
    static Map<String ,String> ogretmenlerMap=new HashMap<>();
    public static void feykOgretmenEkle(){
        ogretmenlerMap.put("123456789411","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456789412","Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456789413","Ayse, Can, 1982, Kimya ");
        ogretmenlerMap.put("123456789414","Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456789415","Alp, Yan, 1984, Matematik");
    }

    public static void ogretmenmenu() throws InterruptedException {
        String tercih="";
        do {
            System.out.println("============YILDIZ KOLEJI============\n" +
                    "==============OGRETMEN MENU===============\n" +
                    "\n"+
                    "\t   1-Ogretmenler Listesi Yazdir\t\n"+
                    "\t   2-Soyisimden Ogretmen Bulma\n"+
                    "\t   3-Branstan Ogretmen Bulma\n"+
                    "\t   4-Bilgileri Girerek Ogrtemen Ekleme\n"+
                    "\t   5-Kimlik No Ile Kayit Silme\t\n"+
                    "\t   A-ANAMENU\n"+
                    "\t   Q-Cıkıs\n");
            tercih=scan.nextLine();

            switch(tercih){
                case "1" :
                    OgretmenlerListesiYazdir();
                    break;
                case "2" :
                    soyisimdenOgretmenBulma();
                    break;
                case "3" :
                    branstanOgretmenBulma();
                    break;
                case "4" :
                    bilgileriGirerekOgrtemenEkleme();
                    break;
                case "5" ://Kimlik No Ile Kayit Silme
                    kimlikNoIleKayitSilme();
                    break;
                case "a" :
                case "A" :
                    Depo.anaMenu();
                    break;
                case "q" :
                case "Q" :
                    break;
            }
        }while(!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void kimlikNoIleKayitSilme() {
        System.out.println("silinecek ögretmen kimlik no giriniz");
        String silinecekOgretmen=scan.nextLine();
        String silinecekValue=ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue=ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc=sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("istediginiz tc ile ogretmen bulunamadı");
        }

    }

    public static void bilgileriGirerekOgrtemenEkleme() {
        System.out.println("Tc no");
        String tcNo=scan.nextLine();
        System.out.printf("isim");
        String isim=scan.nextLine();
        System.out.printf("soyisim");
        String soyisim=scan.nextLine();
        System.out.printf("Dogum Yılı");
        String dYili=scan.nextLine();
        System.out.printf("Brans");
        String brans=scan.nextLine();

        String eklenecekValue=isim+", "+soyisim+", "+dYili+", "+brans;
        ogretmenlerMap.put(tcNo,eklenecekValue);
    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.printf("Aradıgınız ogretmenin bransını giriniz\n");
        String istenenSoyisim=scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet=ogretmenlerMap.entrySet();
        System.out.println("============YILDIZ KOLEJI============\n" +
                "==========BRANS İLE OGRETMEN ARAMA========\n"+
                "TcNo         Isim   Soyisim   D.Yili  Branş");

        for (Map.Entry<String,String> each:ogretmenEntrySet) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValuearr[]=eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuearr[3])){
                System.out.printf("%11s %-6s  %-8s %4s   %s \n", eachKey,eachValuearr[0],eachValuearr[1],eachValuearr[2],eachValuearr[3] );
            }
        }
        Thread.sleep(5000);
    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.printf("Aradıgınız ogretmenin soyısmini giriniz\n");
        String istenenSoyisim=scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet=ogretmenlerMap.entrySet();
        System.out.println("============YILDIZ KOLEJI============\n" +
                "==========SOYISIM İLE OGRETMEN ARAMA========\n"+
                "TcNo         Isim   Soyisim   D.Yili  Branş");

        for (Map.Entry<String,String> each:ogretmenEntrySet) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValuearr[]=eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuearr[1])){
                System.out.printf("%11s %-6s  %-8s %4s   %s \n", eachKey,eachValuearr[0],eachValuearr[1],eachValuearr[2],eachValuearr[3] );
            }
        }
        Thread.sleep(5000);
    }

    public static void OgretmenlerListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String,String>> ogretmenEntrySet=ogretmenlerMap.entrySet();
        System.out.println("============YILDIZ KOLEJI============\n" +
                "==============OGRETMEN LİSTESİ==============\n"+
        "TcNo         Isim   Soyisim   D.Yili  Branş");

        for (Map.Entry<String,String> each:ogretmenEntrySet) {
           String eachKey=each.getKey();
           String eachValue=each.getValue();

           String eachValuearr[]=eachValue.split(", ");
            System.out.printf("%11s %-6s  %-8s %4s   %s \n", eachKey,eachValuearr[0],eachValuearr[1],eachValuearr[2],eachValuearr[3] );
        }
        Thread.sleep(5000);
    }
}
