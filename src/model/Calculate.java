package model;

// Производится главное вычисление
public class Calculate {

    Logger ll = new Logger();

    CountPower countPower = new CountPower();
    public void multiply(UserInput uInput) {
        int power = countPower.count(uInput.getNum(0)) + countPower.count(uInput.getNum(1));
        int num = ClearNum.getNum(uInput.getNum(0)) * ClearNum.getNum(uInput.getNum(1));
        String answer = CalculateI.calculate(num, power);
        System.out.println(answer);
        ll.recordLog(uInput, answer);
    }

    public void plus(UserInput uInput){
        int power1 = countPower.count(uInput.getNum(0));
        int power2 = countPower.count(uInput.getNum(1));

        String action1 = CalculateI.calculate(ClearNum.getNum(uInput.getNum(0)), power1);
        String action2 = CalculateI.calculate(ClearNum.getNum(uInput.getNum(1)), power2);

        power1 = countPower.count(action1);
        power2 = countPower.count(action2);

        String answer;
        if (power1 == power2) {
            int num = ClearNum.getNum(action1) + ClearNum.getNum(action2);;
            answer = CalculateI.calculate(num, power1);
            System.out.println(answer);
        }
        else {
            answer = action1 + " + " + action2;
            System.out.println(answer);
        }

        ll.recordLog(uInput, answer);
    }

    public void divide(UserInput uInput){
        int power = countPower.count(uInput.getNum(0)) - countPower.count(uInput.getNum(1));
        double num = 1.0 * ClearNum.getNum(uInput.getNum(0))  / ClearNum.getNum(uInput.getNum(1)) ;
        String answer = CalculateI.calculate(num,power);
        System.out.println(answer);

        ll.recordLog(uInput, answer);
    }
}
