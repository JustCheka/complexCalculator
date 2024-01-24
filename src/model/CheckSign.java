package model;

// Проверка на знак операции
public class CheckSign {
    public static String getSign(String input){
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+') return "+";
            if (input.charAt(i) == '*') return "*";
            if (input.charAt(i) == '/') return "/";
        }
        return "Ошибка ввода";
    }
}
