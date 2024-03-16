public class JavaArray {
    
    public static void main(String[] args) throws Exception {

        // String[] namaHari = new String[7];
        // namaHari[0] = "Minggu";
        // namaHari[1] = "Senin";
        // namaHari[2] = "Selasa";
        // namaHari[3] = "Rabu";
        // namaHari[4] = "Kamis";
        // namaHari[5] = "Jumat";
        // namaHari[6] = "Sabtu";
        // // System.out.println(namaHari[3]);
        // for (int i = 0; i < namaHari.length; i++) {
        //     System.out.println(namaHari[i]);
        // }
        // // X = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"}
        // int[] angka = {1, 2, 3, 4, 5};
        // for (int i = 0; i < angka.length; i++) {
        //     System.out.println(angka[i]);
        // }

        // exam
        // buat array dengan panjang 10
        // isi array dengan bilangan ganjil
        // tampilkan array tersebut
        // jumlahkan semua bilangan ganjil di dalam array tersebut

        // int[] bilanganGanjil = new int[20];
        // int jumlah = 0;
        // for (int i = 0; i < bilanganGanjil.length; i++) {
        //     bilanganGanjil[i] = i * 2 + 1;
        //     jumlah += bilanganGanjil[i];
        //     System.out.println(bilanganGanjil[i]);
        // }
        // System.out.printf("Jumlah: %d \n", jumlah);

        // Multi Dimensional Array
        // int[][] array2D = new int[5][5];
        int[][] x = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // System.out.println(x[0][1]);
        // System.out.println(x[1][1]);
        // System.out.println(x[2][2]);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println(x[i][j]);
            }
        }

    }
}
