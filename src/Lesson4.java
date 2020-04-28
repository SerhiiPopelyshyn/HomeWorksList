import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '_';
    private static final int LINE_X = 3;
    private static final int LINE_Y = 3;
    private static final int IN_LINE_TOWIN = 3;

    private static char[][] map = new char[LINE_Y][LINE_X];

    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();

    public static void initMap() {
        for (int i = 0; i < LINE_Y; i++) {
            for (int j = 0; j < LINE_X; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < LINE_Y; i++) {
            System.out.print(" ");
            for (int j = 0; j < LINE_X; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    public static void setSym(int y, int x, char sym) {
        map[y][x] = sym;
    }

    public static void sapiensTurn() {
        int x;
        int y;
        do {
            System.out.println("Поставьте крестик: X (от 1 до " + LINE_X + ")   Y  (от 1 до " + LINE_Y + ")");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, DOT_X);
    }
    // Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
    public static void skynetTurn() {
        //Ищем выигрышный ход компьютера
        for (int i = 0; i < LINE_Y; i++)
            for (int j = 0; j < LINE_X; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, DOT_O);
                    if (checkWin(DOT_O)) return;
                    setSym(i, j, DOT_EMPTY);
                }
            }
        //Проверить игрока на выигрышный ход
        for (int i = 0; i < LINE_Y; i++)
            for (int j = 0; j < LINE_X; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, DOT_X);
                    if (checkWin(DOT_X)) {
                        setSym(i, j, DOT_O);
                        return;
                    }
                    setSym(i, j, DOT_EMPTY);
                }
            }
        //Если ничего выигышного нет, то делаем как на уроке
        int x;
        int y;
        do {
            x = random.nextInt(LINE_X);
            y = random.nextInt(LINE_Y);
        } while (!isCellValid(y, x));
        setSym(y, x, DOT_O);
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > LINE_X - 1 || y > LINE_Y - 1) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static boolean isFull() {
        for (int i = 0; i < LINE_Y; i++) {
            for (int j = 0; j < LINE_X; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    //    2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    //    3. Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.

    private static boolean checkWin(char sym) {
        for (int i = 0; i < LINE_Y; i++) {
            for (int j = 0; j < LINE_X; j++) {
                // проверим линию по х
                if (checkLine(i, j, 0, 1, sym)) return true;
                // проверим по диагонали х у
                if (checkLine(i, j, 1, 1, sym)) return true;
                // проверим линию по у
                if (checkLine(i, j, 1, 0, sym)) return true;
                // проверим по диагонали х -у
                if (checkLine(i, j, -1, 1, sym)) return true;
            }
        }
        return false;
    }
    // проверка линии
    private static boolean checkLine(int y, int x, int vy, int vx, char sym) {
        int wayX = x + (IN_LINE_TOWIN - 1) * vx;
        int wayY = y + (IN_LINE_TOWIN - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > LINE_X - 1 || wayY > LINE_Y - 1) return false;
        for (int i = 0; i < IN_LINE_TOWIN; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (map[itemY][itemX] != sym) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            sapiensTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Ты Homo sapiens - Человек разумный!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья...хуже поражения!");
                break;
            }
            skynetTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Чёртов Скайнет победил!");
                break;
            }
            if (isFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
