public class Lampu {
    boolean menyala = false;
    String warna = "Putih";
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
    public static void main(String[] args) throws Exception {
        Lampu lampu = new Lampu();

        // Kondisi awal
        System.out.println(lampu.menyala);
        System.out.println(lampu.warna);

        // Hidupkan lampu
        lampu.Hidupkan();
        System.out.println(lampu.menyala);

        // // Matikan lampu
        // lampu.Matikan();
        // System.out.println(lampu.menyala);

        // // Ganti warna lampu
        // lampu.GantiWarna("Merah");
        // System.out.println(lampu.warna);
        
    }
}
