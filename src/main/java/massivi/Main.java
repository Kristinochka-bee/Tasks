package massivi;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("TicTackToe"); //наше главное окно
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //добавляем кнопку Х, закрывающую окно
        window.setSize(400,400); //размер окна
        window.setLayout(new BorderLayout()); //макет границы/ менедж компоновки//Менеджер BorderLayout может располагать новые компоненты относительно сторон света (North(верх), West(слева), East(справа), South(низ)), Center (центр)). По умолчанию он располагает компоненты по центру.
        window.setLocationRelativeTo(null);//выставляем окно по центру экрана
        window.setVisible(true); //включаем видимость окна
        TicTackToe game = new TicTackToe(); //создаем объект нашего класса
        //window.add(game); //добавляем наш объект в окно
        System.out.println("End...");

      Set<Integer> newList = new TreeSet<>();

    }

}
