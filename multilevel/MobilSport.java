package multilevel;

public class MobilSport extends Mobil {
    private int kecepatanMaks;

    public MobilSport(String merk, int jumlahPintu, int kecepatanMaks) {
        super(merk, jumlahPintu);
        this.kecepatanMaks = kecepatanMaks;
    }

    public void infoMobilSport() {
        System.out.println("Kecepatan maksimum: " + kecepatanMaks + " km/jam");
    }
}
