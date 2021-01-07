package com.lzn.pc;

/**
 * PcFactory
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 12:54
 */
public interface PcFactory {
    
    Mouse createMouse();
    
    KeyBo createKeyBo();
}
