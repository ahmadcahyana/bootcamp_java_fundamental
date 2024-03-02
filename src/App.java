import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // Benar dan direkomendasikan
        int usia = 25;

        // Salah
        // int 1usia = 25;
        // int usia Karyawan = 25;

        // Non recommended
        int u = 26;

        System.out.println(usia);

        // Literals

        // Boolean Literals
        boolean benar = true;
        boolean salah = false;
        System.err.println(benar);
        System.err.println(salah);

        // Integer Literals
        // Binary Literals
        int nomorBinary = 0b1001;
        System.out.println(nomorBinary);
        // Octal Literals
        int nomorOctal = 0123;
        System.out.println(nomorOctal);
        // Decimal Literals
        int nomorDecimal = 123;
        System.out.println(nomorDecimal);
        // Hexadecimal Literals
        int nomorHexadecimal = 0x123;
        System.out.println(nomorHexadecimal);

        // Floating Point Literals
        float myFloat = 123.4f;
        double myDouble = 123.4;
        System.out.println(myFloat);
        System.out.println(myDouble);

        // Character Literals
        // akan selalu diapit oleh tanda petik tunggal                   
        char a = 'A';
        char b = '1'; 
        System.out.println(a);
        System.out.println(b);

        // String Literals
        // akan selalu diapit oleh tanda petik ganda
        String nama = "Budi";
        System.out.println(nama);

        // Arithmetic Operators

        // Penjumlahan
        int x = 10;
        int y = 5;
        int z = x + y;
        System.out.println(z);

        // Pengurangan
        z = x - y;
        System.out.println(z);

        // Perkalian
        z = x * y;
        System.out.println(z);

        // Pembagian
        z = x / y;
        System.out.println(z);

        // Modulus
        z = x % y;
        System.out.println(z);


        // Assignment Operators
        // =
        int a1 = 10;
        int b1 = 20;

        // +=
        a1 += b1;
        System.out.println(a1);

        // -=
        a1 -= b1;
        System.out.println(a1);

        // *=
        a1 *= b1;
        System.out.println(a1);

        // /=
        a1 /= b1;
        System.out.println(a1);

        // %=
        a1 %= b1;
        System.out.println(a1);


        // Relational Operators
        // ==
        int a2 = 10;
        int b2 = 20;
        System.out.println(a2 == b2);

        // !=
        System.out.println(a2 != b2);

        // >
        System.out.println(a2 > b2);

        // <
        System.out.println(a2 < b2);

        // >=
        System.out.println(a2 >= b2);

        // <=
        System.out.println(a2 <= b2);

        // Logical Operators
        // &&
        boolean c = true;
        boolean d = false;
        System.out.println(c && d);
        
        // ||
        System.out.println(c || d);

        // !
        System.out.println(!d);


        // Unary Operators
        // +
        int a3 = 10;
        System.out.println(+a3);

        // -
        // System.out.println(-a3);

        // ++
        System.out.println(a3++);
        System.out.println(a3++);
        System.out.println(a3++);

        // --
        System.out.println(a3--);
        System.out.println(a3--);
        System.out.println(a3--);


        // Input Output
        System.out.print("Hello, World!");
        System.out.println("Hello, World!");
        
        // printf
        // %d untuk integer
        // %f untuk float
        // %s untuk string
        int a4 = 10;
        float b4 = 20.5f;
        String c4 = "Hello";
        System.out.printf("a4 = %d, b4 = %f, c4 = %s", a4, b4, c4); 
        System.out.println(); 

        // Scanner
        /// import java.util.Scanner;
        // String pekerjaan = "Programmer";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pekerjaan: ");
        String pekerjaan = input.nextLine();
        System.out.println("Pekerjaan: " + pekerjaan);

    }
}