package Homework_4;

import java.util.Objects;
import java.util.Scanner;

public class CheckLogin {
    static Scanner in = new Scanner(System.in);
    public static void check(){
        try {
            String login = checkLogin("Введите логин");
            String password = checkPassword("Введите пароль");
            System.out.printf("Ваш логин %s, пароль %s", login, password);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private static String checkLogin(String message) throws WrongLoginException {
        System.out.println(message);
        String login = in.nextLine();
        if (login.length() <= 20) return login;
        else throw new WrongLoginException();
    }
    private static String checkPassword(String message) throws WrongPasswordException {
        System.out.println(message);
        String password = in.nextLine();
        if (password.length() <= 20) {
            System.out.println("Повторите пароль");
            String confirmPassword = in.nextLine();
            if (Objects.equals(confirmPassword, password)) return password;
            else throw new WrongPasswordException("Пароли не совпадают");
        }
        else throw new WrongPasswordException("Длина пароля неверная");
    }
}

class WrongLoginException extends Exception{
    public WrongLoginException() {
        System.out.println("Неверная длина логина");
    }
}
class WrongPasswordException extends Exception{
    public WrongPasswordException(String message) {
        super(message);
    }
}