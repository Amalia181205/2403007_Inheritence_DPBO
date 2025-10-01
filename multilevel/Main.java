package multilevel;

public class Main {
    public static void main(String[] args) {
        MobilSport mobil1 = new MobilSport("Ferrari", 2, 350);

        mobil1.infoKendaraan();      // Dari kelas Kendaraan
        mobil1.infoMobil();          // Dari kelas Mobil
        mobil1.infoMobilSport();     // Dari kelas MobilSport
    }
}
