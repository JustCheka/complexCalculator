package model;

import com.sun.tools.javac.Main;

import java.io.IOException;
import java.util.logging.*;

public class Logger {

    public void saveLogTxt(String userInput, String log) throws IOException {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.txt");

        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info(userInput + " = " + log + "\n");
    }

    public void recordLog(UserInput uInput, String answer){
        try {
            saveLogTxt(uInput.getInput(), answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
