package model;

// Нужен для подсчета чисел без i
public class ClearNum {
    public static int getNum(String num){
        String newNum = "";


        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i)) || num.charAt(i) == '-'){
                newNum += num.charAt(i);
            }
            else {
                break;
            }
        }
        if (newNum == "") return 1;
        return Integer.parseInt(newNum);
    }
}
