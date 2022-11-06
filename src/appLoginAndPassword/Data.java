package appLoginAndPassword;

import java.lang.invoke.WrongMethodTypeException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data {

    public static boolean valid(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
                return false;
        }
        return true;
    }


    private static void check(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException{
        if (!correctDate(login)) {
            throw new WrongLoginException("ошибка!, логин должен иметь цифры и буквы латинского алфавита от 1 до 20");
        }
        if (!correctDate(password)) {
            throw new WrongPasswordException("ошибка!, пароль должен иметь цифры и буквы латинского алфавита от 1 до 20");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("упс, пароли должены совпадать");
        }
    }

    private  static boolean correctDate (String value) {
        Pattern pattern = Pattern.compile("([0-9A-Za-z-]{1,20})");
        Matcher matcher = pattern.matcher(value);
        if (!matcher.matches()) {
            return false;
            }
        return true;
    }
}
