package lethekhoi.ltk.hcmus.alertdialog;

public class Banhmi {
    private String loai;
    private  String salad;
    private  String cachua;
    private  String nuocsot;
    private  String nuocuong;
    //alt+ insert goi chuc nang
    //constructor: phuong thuc khoi tao

    public Banhmi(String loai, String salad, String cachua, String nuocsot, String nuocuong) {
        this.loai = loai;
        this.salad = salad;
        this.cachua = cachua;
        this.nuocsot = nuocsot;
        this.nuocuong = nuocuong;
    }

    public String getLoai() {
        return loai;
    }

    public String getSalad() {
        return salad;
    }

    public String getCachua() {
        return cachua;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public void setCachua(String cachua) {
        this.cachua = cachua;
    }

    public void setNuocsot(String nuocsot) {
        this.nuocsot = nuocsot;
    }

    public void setNuocuong(String nuocuong) {
        this.nuocuong = nuocuong;
    }

    public String getNuocsot() {
        return nuocsot;
    }

    public String getNuocuong() {
        return nuocuong;
    }
}
