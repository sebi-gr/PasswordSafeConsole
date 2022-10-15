package com.passwordsafe.logger;

public interface Logger {
    public void logInfo(String message);

    public void logDebug(String message);

    public void logError(String message);
}
