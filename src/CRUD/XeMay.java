package CRUD;

public class XeMay extends Car{
    // Công suất
    private int congSuat;

    public XeMay(){
    }
    public XeMay(String bienKiemSoat, String tenHangSX, int namSX, String chuSoHuu, int congSuat){
        super(bienKiemSoat,tenHangSX,namSX,chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat +
                super.toString()+
                '}';
    }
}
