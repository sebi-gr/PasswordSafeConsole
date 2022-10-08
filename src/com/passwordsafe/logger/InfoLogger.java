package com.passwordsafe.logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InfoLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "] - INFO: " + message);
    }
}
