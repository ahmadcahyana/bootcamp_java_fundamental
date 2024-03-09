import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) throws Exception {
        // int usia = 22;
        // if (usia > 18) {
        //     if (usia > 21) {
        //         System.out.println("Anda sudah dewasa");
        //     } else {
        //         System.out.println("Anda masih muda");
        //     }
        // } else {
        //     System.out.println("Anda masih anak-anak");
        // }

        // Harga tiket bioskop
        // 1. Jika anak dibawah 13 tahun dan adalah weekend, harga tiket Rp. 25.000
        // 2. Jika anak dibawah 13 tahun dan adalah bukan weekend, harga tiket Rp. 20.000 
        // 3. Jika dewasa (13 sampai 60 tahun) dan adalah weekend, harga tiket Rp. 50.000
        // 4. Jika dewasa (13 sampai 60 tahun) dan adalah bukan weekend, harga tiket Rp. 40.000
        // 5. Jika dewasa diatas 60 tahun, harga tiket Rp. 35.000

        // variable usia dan weekend
        // if 13 tahun kebawah 
        // if weekend, harga tiket Rp. 25.000
        // else, harga tiket Rp. 20.000
        // else if 13 sampai 60 tahun
        // if weekend, harga tiket Rp. 50.000
        // else, harga tiket Rp. 40.000
        // else, harga tiket Rp. 35.000

        Scanner inputWeekEnd = new Scanner(System.in);
        System.out.println("Apakah hari ini weekend? (true/false)");
        boolean isWeekend = inputWeekEnd.nextBoolean();
        Scanner inputUsia = new Scanner(System.in);
        System.out.println("Berapa usia anda?");
        int usia = inputUsia.nextInt();
        if (usia < 13) {
            if (isWeekend) {
                System.out.println("Harga tiket Rp. 25.000");
            } else {
                System.out.println("Harga tiket Rp. 20.000");
            }
        } else if (usia >= 13 && usia <= 60) {
            if (isWeekend) {
                System.out.println("Harga tiket Rp. 50.000");
            } else {
                System.out.println("Harga tiket Rp. 40.000");
            }
        } else {
            System.out.println("Harga tiket Rp. 35.000");
        }
        
    }
}
