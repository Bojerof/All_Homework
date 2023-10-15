package Homework_1;

import Homework_1.FileWork;
import Homework_1.Text;

import java.time.LocalDate;
import java.util.Scanner;

public class TextWork {
    public static FileWork fileWork = new FileWork("FileDoc.csv");
    private static Scanner in = new Scanner(System.in);
    public static void save(){
        Text text = creatText();
        fileWork.saveDoc("Запись " + text.getText() + " дата " + text.getDate());

    }
    public static Text creatText(){
        System.out.println("Введите запись");
        String text = in.nextLine();
        LocalDate date = LocalDate.now();
        return new Text(text, date);
    }
}
