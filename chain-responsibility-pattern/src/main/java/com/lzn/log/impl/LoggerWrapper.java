package com.lzn.log.impl;

import com.lzn.log.CustomLogger;

/**
 * LoggerWrapper
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/8 16:09
 */
public class LoggerWrapper extends CustomLogger {
    
    public LoggerWrapper(int level) {
        super(level);
    }
    
    @Override
    public void log(int level, String message) {
        this.nextLogger.log(level, message);
    }
    
    @Override
    public void writeLog(String message) {
        System.out.println("LoggerWrapper");
    }
}
