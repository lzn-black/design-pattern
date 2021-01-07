package com.lzn.pc.dell;

import com.lzn.pc.KeyBo;
import com.lzn.pc.Mouse;
import com.lzn.pc.PcFactory;

/**
 * DellFactory
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 12:58
 */
public class DellFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
    
    @Override
    public KeyBo createKeyBo() {
        return new DellKeyBo();
    }
}
