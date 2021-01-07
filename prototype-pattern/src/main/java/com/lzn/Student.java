package com.lzn;

import lombok.Data;

/**
 * Student
 *
 * @author lzn
 * @version 1.0
 * @since 2021/1/7 13:52
 */
@Data
public class Student implements Cloneable {
    
    private String name;
    
    @Override
    public Student clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return student;
    }
}
