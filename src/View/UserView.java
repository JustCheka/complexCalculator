package View;

import Controller.Controller;

public class UserView {

    Controller controller = new Controller();

    public void start(){
        while (true){
            controller.messageForUser();
            controller.setUserInput();
            if (!controller.checkInput()) break;
            controller.chooseAction();
        }
        System.out.println("Приложение удачно завершилось");
    }
}
