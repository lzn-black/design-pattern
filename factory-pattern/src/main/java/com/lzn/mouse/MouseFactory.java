package com.lzn.mouse;

/**
 * 利用反射机制实现简单工厂
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 11:32
 */
public class MouseFactory {
    
    public static Object createMouse(Class<? extends Mouse> tClass) {
        Object object = null;
        try {
            object = Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
