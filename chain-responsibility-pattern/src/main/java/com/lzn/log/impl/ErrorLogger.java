package com.lzn.log.impl;

import com.lzn.log.CustomLogger;

/**
 * ErrorLogger
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/8 15:55
 */
public class ErrorLogger extends CustomLogger {
    
    public ErrorLogger(int level) {
        super(level);
    }
    
    @Override
    public void writeLog(String message) {
        System.out.println("ErrorLogger: " + message);
    }
}
