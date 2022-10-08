package com.passwordsafe.logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ErrorLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "] - ERROR: " + message);
    }
}
