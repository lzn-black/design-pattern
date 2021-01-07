package com.lzn.pc.hp;

import com.lzn.pc.KeyBo;

/**
 * DellKeyBo
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 12:57
 */
public class HpKeyBo implements KeyBo {
    
    @Override
    public void sayHi() {
        System.out.println("HP KeyBo");
    }
}
