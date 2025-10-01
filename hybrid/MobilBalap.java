package hybrid;

public class MobilBalap extends Mobil implements FiturTambahan {
    public MobilBalap(String merk) {
        super(merk); // memanggil constructor Mobil → constructor Kendaraan
    }

    @Override
    public void aktifkanTurbo() {
        System.out.println("Turbo diaktifkan! ");
    }

    @Override
    public void aktifkanGPS() {
        System.out.println("GPS diaktifkan! ");
    }

    public void infoMobilBalap() {
        System.out.println("Ini adalah mobil balap dengan fitur tambahan.");
    }
}
