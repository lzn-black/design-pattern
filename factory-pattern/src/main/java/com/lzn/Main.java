package com.lzn;

import com.lzn.mouse.Mouse;
import com.lzn.mouse.MouseFactory;
import com.lzn.mouse.impl.DellMouse;
import com.lzn.mouse.impl.HpMouse;

/**
 * Main
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 11:37
 */
public class Main {
    public static void main(String[] args) {
        Mouse dellMouse = (Mouse) MouseFactory.createMouse(DellMouse.class);
        dellMouse.sayHi();
        
        Mouse hpMouse = (Mouse) MouseFactory.createMouse(HpMouse.class);
        hpMouse.sayHi();
    }
}
