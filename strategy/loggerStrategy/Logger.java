package loggerStrategy;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Console Log: " + message);
    }

}

class FileLogger implements Logger{
    private String fileName;

    public FileLogger(String filename) {
        this.fileName = filename;
    }

    @Override
    public void log(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("File Log: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }

}


class LoggerContext {
    private Logger logger;

    public void setLogger(Logger logger){
        this.logger = logger;
    }
    public void logMessage(String message){
        if (logger != null) {
            logger.log(message);
        }
    }
}