package massivi;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class TicTackToe {
    public class TicTack {
        public static void main(String[] args) {
            char[][] fiell = new char[3][3];

            for (int i = 0; i < fiell.length; i++) { //по столбцам
                for (int j = 0; j < fiell[i].length; j++) { //по строкам
                    fiell[i][j] = ' ';          //заполняем пустотой
                }
            }
            Scanner scanner = new Scanner(System.in);
            gameStart(fiell, scanner);
        }

        private static void gameStart(char[][] fiell, Scanner scanner) {
            int playerNumber; // 2 игрока будет
            char symbol;
            for (int i = 1; i < 9; i++) {  //макс кол.во шагов. Если будет меньше,тогда выйдем из цикла
                if (i % 2 == 1) { //первый игрок не четный //  i - номер хода
                    playerNumber = 1;
                    symbol = 'X';

                } else playerNumber = 2;
                symbol = 'O';

                playerMakeMove(fiell, playerNumber, playerNumber, scanner);
                int resGame = playerMakeMove(fiell, playerNumber, symbol, scanner);
            }

        }

        //Данный метод будет осуществлять ход
        private static int playerMakeMove(char[][] fiell, int number, int playerNumber, Scanner scanner) {

            drawFeld(fiell);
            System.out.println("Ход игрока номер: " + playerNumber);
            System.out.println("Bведи 100 если хочешь сдаться");
            System.out.println("Bведи для очередного хода номер столбца 0 - 2 ");
            int input = scanner.nextInt();
            if (input == 100)
                return 3;
            int x = input;

            System.out.println("Bведи для очередного хода номер столбца");
            //int y = scaner.nextInt();
            //if ()

            return input;
        }

        private static void drawFeld(char[][] fiell) {
        }
    }



    }
