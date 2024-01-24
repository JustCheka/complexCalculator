package model;

// Вычисляет i в степени и возвращает результат с числом, стоящим перед i
public class CalculateI {
    public static String calculate(double num, int power){
        if (power % 4 == 0) return String.valueOf(num);
        else if (power % 3 == 0) {
            num = num * -1;
            return num + "i";
        }
        else if (power % 2 == 0) {
            num *= -1;
            return String.valueOf(num);
        }
        else {
            return num + "i";
        }
    }

    public static String calculate(int num, int power){
        if (power % 4 == 0) return String.valueOf(num);
        else if (power % 3 == 0) {
            num = num * -1;
            return num + "i";
        }
        else if (power % 2 == 0) {
            num *= -1;
            return String.valueOf(num);
        }
        else {
            return num + "i";
        }
    }
}
