package Exercises;
import java.util.Random;
import java.util.Scanner;

public class lesson {

    static class TicTacToe {
        final char SIGN_X = 'x';
        final char SIGN_O = 'o';
        final char SIGN_EMPTY = '.';
        char[][] table;
        Random random;
        Scanner scanner;

        public static void main(String[] args) {
            new TicTacToe().game();
        }

        TicTacToe() {
            random = new Random();
            scanner = new Scanner(System.in);
            table = new char[3][3];
        }

        void game() {
            initTable();
            while (true) {
                turnHuman();
                if (checkWin(SIGN_X)) {
                    System.out.println("YOU WIN!");
                    break;
                }
                // if (isTableFull()) {
                //    System.out.println("Sorry, DRAW!");
                //   break;
                //}
                turnAI();
                printTable();
                if (checkWin(SIGN_O)) {
                    System.out.println("AI WIN!");
                    break;
                }
                //        if (isTableFull()) {
                //            System.out.println("Sorry, DRAW!");
                //            break;
                //        }
            }
            System.out.println("GAME OVER.");
            printTable();
        }

        void initTable() {
            for (int row = 0; row < 3; row++)
                for (int col = 0; col < 3; col++)
                    table[row][col] = SIGN_EMPTY;
        }

        void printTable() {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++)
                    System.out.print(table[row][col] + " ");
                System.out.println();
            }
        }
        void turnHuman() {
            int x, y;
            do {
                System.out.println("Enter X and Y (1..3):");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while (!isCellValid(x, y));
            table[y][x] = SIGN_X;
        }
        boolean isCellValid(int x, int y) {
            if (x < 0 || y < 0 || x >= 3|| y >= 3)
                return false;
            return table[y][x] == SIGN_EMPTY;
        }
        void turnAI() {
            int x, y;
            do {
                x = random.nextInt(3);
                y = random.nextInt(3);  //Число 3, передающееся как параметр, является ограничителем. Таким образом, генерируются случайные целые числа от 0 до 2
            } while (!isCellValid(x, y));   //если убрать инверсию и поменять значения местами, тогда мы будем делать ход за компьютер
            table[y][x] = SIGN_O;
        }
        boolean checkWin(char dot) {
            for (int i = 0; i < 3; i++)
                if ((table[i][0] == dot && table[i][1] == dot &&
                        table[i][2] == dot) ||
                        (table[0][i] == dot && table[1][i] == dot &&
                                table[2][i] == dot))
                    return true;
            if ((table[0][0] == dot && table[1][1] == dot &&
                    table[2][2] == dot) ||
                    (table[2][0] == dot && table[1][1] == dot &&
                            table[0][2] == dot))
                return true;
            return false;

            /*
                    boolean isTableFull() {
                        for (int row = 0; row < 3; row++)
                            for (int col = 0; col < 3; col++)
                                if (table[row][col] == SIGN_EMPTY)
                                    return false;
                        return true;
                   }

             */
        }
        /*
        *  {2, 3, 5, },
           {3, 2, 4, },
           {5, 4, 2, },*/
    }





}
