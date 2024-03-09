import java.util.Scanner;
public class SwitchCaseStatement {
    public static void main(String[] args) throws Exception {
        // Switch Case Statement
        // Buat program yang meminta user untuk memasukkan nilai ujian.
        // Jika nilai ujian 100, maka tampilkan Nilai A+.
        // Jika nilai ujian 90, maka tampilkan Nilai A.
        // Jika nilai ujian 80, maka tampilkan Nilai B.
        // Jika nilai ujian 60, maka tampilkan Nilai C.
        // Jika nilai ujian 50, maka tampilkan Nilai D.
        // Jika nilai ujian 40, maka tampilkan Nilai E.
        // Jika nilai ujian kurang dari 40, maka tampilkan Nilai F.
        // Jika nilai ujian tidak valid, maka tampilkan "Nilai tidak valid".
        // Gunakan switch case statement.
        // Hint: Gunakan break statement untuk menghentikan proses seleksi case.
        // Hint: Gunakan default
        // Scanner inputNilai = new Scanner(System.in);
        // System.out.println("Masukkan nilai ujian: ");
        // int nilai = inputNilai.nextInt();
        // switch (nilai) {
        //     case 100:
        //         System.out.println("Nilai A+");
        //         break;
        //     case 90:
        //         System.out.println("Nilai A");
        //         break;
        //     case 80:
        //         System.out.println("Nilai B");
        //         break;
        //     case 60:
        //         System.out.println("Nilai C");
        //         break;
        //     case 50:
        //         System.out.println("Nilai D");
        //         break;
        //     case 40:
        //         System.out.println("Nilai E");
        //         break;
        //     default:
        //         System.out.println("Nilai tidak valid");
        //         break;
        // }


        // Switch Case Statement
        // Buat program yang meminta user untuk memasukkan absen
        // Jika absen hadir, maka tampilkan "Hari ini anda hadir"
        // Jika absen tidak hadir, maka tampilkan "Hari ini anda tidak hadir"

        // variable absen

        Scanner inputAbsen = new Scanner(System.in);
        System.out.println("Apakah anda hadir? (1/0)");
        int isHadir = inputAbsen.nextInt();

        switch (isHadir) {
            case 1:
                System.out.println("Hari ini anda hadir");
                break;
            case 0:
                System.out.println("Hari ini anda tidak hadir");
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }

    }
}
