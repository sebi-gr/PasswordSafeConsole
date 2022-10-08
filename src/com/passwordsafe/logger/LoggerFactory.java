package com.passwordsafe.logger;

public class LoggerFactory {

    public Logger getLogger (LoggerType loggerType) {
        if (loggerType == null) {
            return null;
        }

        switch (loggerType) {
            case DEBUG -> {
                return new DebugLogger();
            }
            case INFO -> {
                return new InfoLogger();
            }
            case ERROR -> {
                return new ErrorLogger();
            }
        }

        return null;
    }
}
