import java.util.Scanner;

public class TurtleGame {
    private static final int SIZE = 10; // Ukuran grid
    private static final char TURTLE = 'T';
    private static final char EMPTY = '.';
    private int turtleX = SIZE / 2;
    private int turtleY = SIZE / 2;

    private char[][] grid = new char[SIZE][SIZE];

    public TurtleGame() {
        initGrid();
        placeTurtle(turtleX, turtleY);
    }

    // Inisialisasi grid
    private void initGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = EMPTY;
            }
        }
    }

    // Meletakkan kura-kura di posisi tertentu
    private void placeTurtle(int x, int y) {
        grid[y][x] = TURTLE;
    }

    // Menampilkan grid
    private void displayGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Menggerakkan kura-kura
    public void moveTurtle(String command) {
        int newX = turtleX;
        int newY = turtleY;

        switch (command.toUpperCase()) {
            case "W": newY = Math.max(turtleY - 1, 0); break;
            case "A": newX = Math.max(turtleX - 1, 0); break;
            case "S": newY = Math.min(turtleY + 1, SIZE - 1); break;
            case "D": newX = Math.min(turtleX + 1, SIZE - 1); break;
            default: System.out.println("Perintah tidak dikenali. Gunakan W, A, S, atau D untuk menggerakkan kura-kura."); return;
        }

        // Hapus posisi sebelumnya dan update posisi baru
        grid[turtleY][turtleX] = EMPTY;
        turtleX = newX;
        turtleY = newY;
        placeTurtle(turtleX, turtleY);
    }

    public static void main(String[] args) {
        TurtleGame game = new TurtleGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Game Kura-Kura!");
        System.out.println("Gunakan W (atas), A (kiri), S (bawah), D (kanan) untuk menggerakkan kura-kura.");

        while (true) {
            game.displayGrid();
            System.out.print("Gerakkan kura-kura (Q untuk keluar): ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("Q")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            game.moveTurtle(command);
        }
        scanner.close();
    }
}