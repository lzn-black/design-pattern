package com.lzn.mouse.impl;

import com.lzn.mouse.Mouse;

/**
 * HpMouse
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 11:32
 */
public class HpMouse implements Mouse {
    
    @Override
    public void sayHi() {
        System.out.println("HP Mouse");
    }
}
