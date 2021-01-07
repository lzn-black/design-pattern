package com.lzn.pc.hp;

import com.lzn.pc.KeyBo;
import com.lzn.pc.Mouse;
import com.lzn.pc.PcFactory;
import com.lzn.pc.dell.DellKeyBo;
import com.lzn.pc.dell.DellMouse;

/**
 * DellFactory
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 12:58
 */
public class HpFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }
    
    @Override
    public KeyBo createKeyBo() {
        return new HpKeyBo();
    }
}
