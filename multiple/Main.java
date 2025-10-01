package multiple;

// Kelas Anak yang menggunakan komposisi
class Mobil {
    private String merk;
    private Mesin mesin;   // Mobil punya Mesin
    private Radio radio;   // Mobil punya Radio

    public Mobil(String merk) {
        this.merk = merk;
        this.mesin = new Mesin();
        this.radio = new Radio();
    }

    public void hidupkanMesin() {
        System.out.print(merk + " -> ");
        mesin.hidupkanMesin();
    }

    public void nyalakanRadio() {
        System.out.print(merk + " -> ");
        radio.nyalakanRadio();
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota");

        mobil1.hidupkanMesin();
        mobil1.nyalakanRadio();
    }
}
