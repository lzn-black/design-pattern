package com.lzn.mouse.impl;

import com.lzn.mouse.Mouse;

/**
 * DellMouse
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 11:31
 */
public class DellMouse implements Mouse {
    
    @Override
    public void sayHi() {
        System.out.println("Dell Mouse");
    }
}
