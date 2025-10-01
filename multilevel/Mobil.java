package multilevel;

public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    public Mobil(String merk, int jumlahPintu) {
        super(merk);
        this.jumlahPintu = jumlahPintu;
    }

    public void infoMobil() {
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}
