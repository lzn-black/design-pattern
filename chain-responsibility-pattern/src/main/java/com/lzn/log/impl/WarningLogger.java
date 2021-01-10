package com.lzn.log.impl;

import com.lzn.log.CustomLogger;

/**
 * WarningLogger
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/8 15:56
 */
public class WarningLogger extends CustomLogger {
    
    public WarningLogger(int level) {
        super(level);
    }
    
    @Override
    public void writeLog(String message) {
        System.out.println("WarningLogger: " + message);
    }
}
