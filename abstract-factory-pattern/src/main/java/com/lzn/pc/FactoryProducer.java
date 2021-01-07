package com.lzn.pc;

import com.lzn.pc.dell.DellFactory;
import com.lzn.pc.hp.HpFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * FactoryProducer
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 13:00
 */
public class FactoryProducer {
    
    private static Map<String, PcFactory> pcFactoryMap = new HashMap<>();
    
    static {
        pcFactoryMap.put("dell", new DellFactory());
        pcFactoryMap.put("hp", new HpFactory());
    }
    
    public static PcFactory getFactory(String factoryType) {
        return pcFactoryMap.get(factoryType);
    }
}
