import java.util.Scanner;


public class PapanCatur {
    
    public static void tampilkanPapan(char[][] papan) {        
        for (int i = 0; i < papan.length; i++) {
            System.out.print(papan.length - i + " ");
            for (int j = 0; j < papan[i].length; j++) {
                System.out.print(papan[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");
    }

    public static void pindah(char[][] papan, String dari, String ke) {
        int dariX = dari.charAt(0) - 'A';
        int dariY = 8 - (dari.charAt(1) - '0');
        int keX = ke.charAt(0) - 'A';
        int keY = 8 - (ke.charAt(1) - '0');
        papan[keY][keX] = papan[dariY][dariX];
        papan[dariY][dariX] = ' ';
    }

    public static void main(String[] args) {
        char[][] papan = {
            {'B', 'N', 'G', 'Q', 'R', 'G', 'N', 'B'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'B', 'N', 'G', 'Q', 'R', 'G', 'N', 'B'},
        };
        tampilkanPapan(papan);
        do {
            // input
            Scanner input = new Scanner(System.in);
            System.out.println("Pindah dari: ");
            String dari = input.nextLine();
            System.out.println("Pindah ke: ");
            String ke = input.nextLine();
            // pindah
            pindah(papan, dari, ke);
            // tampilkan papan
            tampilkanPapan(papan);
            
        } while (true);


    }
}