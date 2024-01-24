package model;

// Считает степень у i
public class CountPower {
    public int count(String input){
        boolean iExist = false;
        String sum = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'i'){
                iExist = true;
            }
            if (input.charAt(i) == '^' ){
                i++;
                while (Character.isDigit(input.charAt(i))){
                    sum += String.valueOf(input.charAt(i));
                    i++;
                    if (i >= input.length()) break;
                }
            }
        }
        if (!iExist) return 0;
        if (sum == "") return 1;
        return Integer.parseInt(sum);
    }
}
