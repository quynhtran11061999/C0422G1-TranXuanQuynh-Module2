package CRUD;

public class Car {
    // Biển kiểm soát , tên hãng sản xuất, năm sản xuất, chủ
    //sở hữu.
    protected String bienKiemSoat;
    protected String tenHangSX;
    protected int namSX;
    protected String chuSoHuu;

    public Car(){
    }
    public Car(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSX = tenHangSX;
        this.namSX = namSX;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHangSX='" + tenHangSX + '\'' +
                ", namSX=" + namSX +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }
}
