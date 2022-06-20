package CRUD;

public class XeTai extends Car{
    // Trọng tải
    private int trongTai;

    public XeTai(){
    }
    public XeTai(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu, int trongTai){
        super(bienKiemSoat,tenHangSX,namSX,chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                super.toString()+
                '}';
    }
}
