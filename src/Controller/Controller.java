package Controller;

import model.Calculate;
import model.CheckSign;
import model.UserInput;

import java.util.Objects;

import static model.CheckSign.*;

public class Controller {
    Calculate calculate = new Calculate();
    UserInput uInput = new UserInput();

    public void setUserInput(){
        uInput.setInput();
    }
    public boolean checkInput(){
        if (Objects.equals(uInput.getInput(), "-1")) {
            return false;
        }
        return true;
    }
    public void messageForUser(){
        System.out.println("Введите выражение которое нужно посчитать (пример: i^2 * i^3) , для выхода напишите: -1 ");
    }
    public void chooseAction(){
        String sign = CheckSign.getSign(uInput.getInput());
        switch (sign){
            case "*":
                uInput.setProcessedInput("\\*");
                calculate.multiply(uInput);
                break;
            case "/":
                uInput.setProcessedInput("\\/");
                calculate.divide(uInput);
                break;
            case "+":
                uInput.setProcessedInput("\\+");
                calculate.plus(uInput);
                break;
            default:
                System.out.println(sign);
                break;
        }
    }
}
