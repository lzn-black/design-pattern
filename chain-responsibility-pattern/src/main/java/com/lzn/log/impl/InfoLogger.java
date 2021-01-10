package com.lzn.log.impl;

import com.lzn.log.CustomLogger;

/**
 * InfoLogger
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/8 15:57
 */
public class InfoLogger extends CustomLogger {
    
    public InfoLogger(int level) {
        super(level);
    }
    
    @Override
    public void writeLog(String message) {
        System.out.println("InfoLogger: " + message);
    }
}
