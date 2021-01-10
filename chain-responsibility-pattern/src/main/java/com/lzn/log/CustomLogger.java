package com.lzn.log;

/**
 * CustomLogger
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/8 15:42
 */
public abstract class CustomLogger {
    
    protected int level;
    
    protected CustomLogger nextLogger;
    
    public CustomLogger(int level) {
        this.level = level;
    }
    
    /**
     * 记录日志
     *
     * @param level   日志等级
     * @param message 日志信息
     */
    public void log(int level, String message) {
        if (this.level <= level) {
            writeLog(message);
        }
        nextLogger.log(level, message);
    }
    
    /**
     * 记录日志
     *
     * @param message 日志信息
     */
    public abstract void writeLog(String message);
    
    public void setNextLogger(CustomLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
