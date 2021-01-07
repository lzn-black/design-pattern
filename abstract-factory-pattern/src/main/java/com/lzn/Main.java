package com.lzn;

import com.lzn.pc.FactoryProducer;
import com.lzn.pc.KeyBo;
import com.lzn.pc.Mouse;
import com.lzn.pc.PcFactory;

/**
 * Main
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 13:06
 */
public class Main {
    public static void main(String[] args) {
        PcFactory dellPcFactory = FactoryProducer.getFactory("dell");
        Mouse dellMouse = dellPcFactory.createMouse();
        dellMouse.sayHi();
        KeyBo dellKeyBo = dellPcFactory.createKeyBo();
        dellKeyBo.sayHi();
        
        PcFactory hpPcFactory = FactoryProducer.getFactory("hp");
        Mouse hpMouse = hpPcFactory.createMouse();
        hpMouse.sayHi();
        KeyBo hpKeyBo = hpPcFactory.createKeyBo();
        hpKeyBo.sayHi();
    }
}
