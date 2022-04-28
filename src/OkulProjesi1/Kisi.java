package OkulProjesi1;

public class Kisi {
    private String isimSoyisim;
    private String kimlikNo;
    private int yas;

    public Kisi() {
    }

    public Kisi(String isimSoyisim, String kimlikNo, int yas) {
        this.isimSoyisim = isimSoyisim;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "isimSoyisim='" + isimSoyisim + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
