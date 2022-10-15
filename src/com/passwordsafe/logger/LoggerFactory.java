package com.passwordsafe.logger;

public class LoggerFactory {

    private Logger logger = null;

    public Logger getLogger () {
        if (logger == null) {
            return new ConsoleLogger();
        }

        return logger;
    }
}
