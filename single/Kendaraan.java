package single;

// Kelas Induk (Parent Class)
class Kendaraan {
    String merk;
    int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Method
    public void infoKendaraan() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}

// Kelas Anak (Child Class) yang mewarisi dari Kendaraan
class Mobil extends Kendaraan {
    int jumlahPintu;

    // Constructor
    public Mobil(String merk, int tahun, int jumlahPintu) {
        super(merk, tahun); // memanggil constructor parent
        this.jumlahPintu = jumlahPintu;
    }

    // Method tambahan khusus Mobil
    public void infoMobil() {
        infoKendaraan(); // memanggil method dari parent
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}