package com.lzn;

import com.lzn.log.constant.LoggerLevel;
import com.lzn.log.impl.ErrorLogger;
import com.lzn.log.impl.InfoLogger;
import com.lzn.log.impl.LoggerWrapper;
import com.lzn.log.impl.WarningLogger;

/**
 * Main
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/8 15:55
 */
public class Main {
    
    public static void main(String[] args) {
        LoggerWrapper loggerWrapper = new LoggerWrapper(LoggerLevel.CUSTOM_LEVEL);
        InfoLogger infoLogger = new InfoLogger(LoggerLevel.INFO_LEVEL);
        WarningLogger warningLogger = new WarningLogger(LoggerLevel.WARNING_LEVEL);
        ErrorLogger errorLogger = new ErrorLogger(LoggerLevel.ERROR_LEVEL);
        
        loggerWrapper.setNextLogger(infoLogger);
        infoLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);
    }
}
