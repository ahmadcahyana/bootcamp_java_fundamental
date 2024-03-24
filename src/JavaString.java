public class JavaString {
    public static void main(String[] args) {
        String namaDepan = "Budi";
        String namaBelakang = "Susanto";
        String namaLengkap = namaDepan.concat(namaBelakang);
        System.out.println(namaLengkap);
        String manipulasiNama = namaLengkap.replace(namaBelakang, "Joko");
        System.out.println(manipulasiNama);

    }
}
