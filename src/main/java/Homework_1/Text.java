package Homework_1;

import java.time.LocalDate;
public class Text {
    private String text;
    private LocalDate date;
    public Text(String text, LocalDate date){
        this.date = date;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }
}
