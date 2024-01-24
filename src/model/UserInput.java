package model;

import java.util.Scanner;

public class UserInput {

    private String input;
    private String[] processedInput;

    public String getInput(){
        return input;
    }
    public String getNum(int index){
        return processedInput[index];

    }

    public void setInput(){
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine().replaceAll(" ", "");

    }

    public void setProcessedInput(String sign){
        processedInput = input.split(sign);
    }
}
