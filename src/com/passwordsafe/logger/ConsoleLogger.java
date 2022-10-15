package com.passwordsafe.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger implements Logger{
    @Override
    public void logInfo(String message) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "] - INFO: " + message);
    }

    @Override
    public void logDebug(String message) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "] - DEBUG: " + message);
    }

    @Override
    public void logError(String message) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "] - ERROR: " + message);
    }
}
