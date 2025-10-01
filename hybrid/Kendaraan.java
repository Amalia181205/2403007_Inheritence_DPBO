package hybrid;

public class Kendaraan {
    protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void infoKendaraan() {
        System.out.println("Merk kendaraan: " + merk);
    }
}
