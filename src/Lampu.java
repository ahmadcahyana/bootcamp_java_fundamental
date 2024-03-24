public class Lampu {
    private boolean menyala = false;
    private String warna = "Putih";
    public void Hidupkan() {
        menyala = true;
        System.out.println("Lampu dinyalakan");
    }
    public void Matikan() {
        menyala = false;
        System.out.println("Lampu dimatikan");
    }
    public void GantiWarna(String warnaBaru) {
        warna = warnaBaru;
        System.out.println("Warna lampu diganti menjadi " + warna);
    }

    int Angka(int angka) {
        return angka;
    }
    int Angka(int angka, int angka2) {
        return angka;
    }

    // Constructor
    public Lampu() {
        System.out.println("Lampu dibuat");
    }

    public boolean Menyala(int Hidupkan) {
        System.out.println("Lampu menyala : " + menyala);
        if (Hidupkan == 1) {
            menyala = true;
        } else {
            menyala = false;
        }
        return menyala;
    }
    
    public static void main(String[] args) throws Exception {
        Lampu lampu = new Lampu();
        // lampu.Menyala(1);
        // lampu.Angka(0,2);

        // // Kondisi awal
        // // System.out.println(lampu.menyala);
        // // System.out.println(lampu.warna);

        // // // Hidupkan lampu
        // // lampu.Hidupkan();
        // // System.out.println(lampu.menyala);

        // // // // // Matikan lampu
        // // // lampu.Matikan();
        // // // System.out.println(lampu.menyala);

        // // // // // Ganti warna lampu
        // // // lampu.GantiWarna("Merah");
        // // // System.out.println(lampu.warna);

        // // Lampu lampu2 = new Lampu();
        // // System.out.println(lampu2.menyala);
        // // System.out.println(lampu2.warna);

        // boolean x = lampu.Menyala(1);
        // System.out.println(x);


        
    }
}
