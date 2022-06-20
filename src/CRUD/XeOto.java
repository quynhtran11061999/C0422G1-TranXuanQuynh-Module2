package CRUD;

public class XeOto extends Car{
   // Số chỗ ngồi, kiểu xe (du lịch, xe khách).
    private int soGhe;
    private String dongCo;

    public XeOto(){
    }
    public XeOto(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu, int soGhe,String dongCo){
        super(bienKiemSoat,tenHangSX,namSX,chuSoHuu);
        this.soGhe = soGhe;
        this.dongCo = dongCo;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getDongCo() {
        return dongCo;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    @Override
    public String toString() {
        return "XeOto{" +
                "soGhe=" + soGhe +
                ", dongCo='" + dongCo + '\'' +
                super.toString()+
                '}';
    }
}
