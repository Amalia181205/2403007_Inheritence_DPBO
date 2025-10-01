package hybrid;

public class Main {
    public static void main(String[] args) {
        MobilBalap ferrari = new MobilBalap("Ferrari F8");

        ferrari.infoKendaraan();     // Dari Kendaraan
        ferrari.jenisMobil();        // Dari Mobil
        ferrari.infoMobilBalap();    // Dari MobilBalap
        ferrari.aktifkanTurbo();     // Dari Interface FiturTambahan
        ferrari.aktifkanGPS();       // Dari Interface FiturTambahan
    }
}
