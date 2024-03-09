import java.util.Scanner;


public class IfStatement {
    public static void main(String[] args) throws Exception {
        // If Statement
        // if (boolean expression) {
        //     // statement
        // }
        // if (boolean expression) {
        //     // statement
        // } else {
        //     // statement
        // }
        // if (boolean expression) {
        //     // statement
        // } else if (boolean expression) {
        //     // statement
        // } else {
        //     // statement
        // }

        int number = 10;
        if (number < 0) {
            // statement
        }
        else {
            // statement
        }

        // statement setelah if

        // Contoh
        int x = 10;
        if (x > 5) {
            System.out.println("x lebih besar dari 5");
        }

        // Contoh
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a lebih besar dari b");
        } else {
            System.out.println("a lebih kecil dari b");
        }

        // Contoh
        int a2 = 10;
        int b2 = 20;
        if (a2 > b2) {
            System.out.println("a2 lebih besar dari b2");
        } else if (a2 < b2) {
            System.out.println("a2 lebih kecil dari b2");
        } else {
            System.out.println("a2 sama dengan b2");
        }

        



        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai mahasiswa: ");
        int angka = scanner.nextInt();
        String nilai;

        if (angka >= 90) {
            nilai = "A";
        } else if (angka >= 80) {
            nilai = "B";
        } else if (angka >= 70) {
            nilai = "C";
        } else if (angka >= 60) {
            nilai = "D";
        } else {
            nilai = "E";
        }

        System.out.println("Nilai mahasiswa: " + nilai);
    }

}
