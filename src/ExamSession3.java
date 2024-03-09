import java.util.Scanner;

public class ExamSession3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan usia anda: ");
        int usia = input.nextInt();
        System.out.println("Usia anda adalah " + usia);
        if (usia > 18) {
        System.out.println("Usia anda lebih dari 18 tahun");
        } else {
        System.out.println("Usia anda kurang dari 18 tahun");
        }

        // Exam Program If Else
        // Buat program yang meminta user untuk memasukkan nilai ujian.
        // Jika nilai ujian lebih dari 70, maka tampilkan "Selamat, Anda lulus ujian".
        // Jika nilai ujian kurang dari 70, maka tampilkan "Maaf, Anda tidak lulus
        // ujian".

        // If Else If
        Scanner input_2 = new Scanner(System.in);
        System.out.println("Masukkan nilai ujian: ");
        int nilai_2 = input_2.nextInt();
        if (nilai_2 == 100) {
            System.out.println("Anda lulus ujian dengan nilai sempurna");
        } else if (nilai_2 > 70) {
            System.out.println("Selamat, Anda lulus ujian");
        } else {
            System.out.println("Maaf, Anda tidak lulus ujian");
        }

        // Exam Program If Else If
        // Buat program yang meminta user untuk memasukkan nilai ujian.
        // Jika nilai ujian 100, maka tampilkan Nilai A+.
        // Jika nilai ujian Lebih dari atau sama dengan 90, maka tampilkan Nilai A.
        // Jika nilai ujian Lebih dari atau sama dengan 80, maka tampilkan Nilai B.
        // Jika nilai ujian Lebih dari atau sama dengan 60, maka tampilkan Nilai C.
        // Jika nilai ujian Lebih dari atau sama dengan 40, maka tampilkan Nilai D.
        // Jika nilai ujian Kurang dari 40, maka tampilkan Nilai E.

        Scanner input_3 = new Scanner(System.in);
        System.out.println("Masukkan nilai ujian: ");
        int nilai_3 = input_3.nextInt();
        if (nilai_3 > 100) {
            System.out.println("Nilai tidak valid");
        }
        else if (nilai_3 == 100) {
            System.out.println("Nilai A+");
        } else if (nilai_3 >= 90) {
            System.out.println("Nilai A");
        } else if (nilai_3 >= 80) {
            System.out.println("Nilai B");
        } else if (nilai_3 >= 60) {
            System.out.println("Nilai C");
        } else if (nilai_3 >= 50) {
            System.out.println("Nilai D");
        } else if (nilai_3 < 50) {
            System.out.println("Nilai E");
        } else {
            System.out.println("Nilai tidak valid");
        }

    }
}
