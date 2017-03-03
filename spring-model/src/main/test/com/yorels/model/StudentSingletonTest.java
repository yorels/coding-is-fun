package com.yorels.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yoel.gallegos on 02/03/2017.
 */

public class StudentSingletonTest {

    String STUDENT_NAME = "YOEL";
    String ID = "123";
    StudentSingleton student1;
    StudentSingleton student2;

    @Before
    public void setUp(){
        student1 = StudentSingleton.getInstance();
        student1.setId("777");
        student1.setName("YOEL");
        student2 = StudentSingleton.getInstance();
        student2.setId(ID);
        student2.setName(STUDENT_NAME);
    }

    @Test
    public void isSameObjectTest(){
        System.out.println(student1);
        System.out.println(student2);
        Assert.assertEquals(student1, student2);
    }

    @Test
    public void readNameTest(){
        System.out.println(student2);
        Assert.assertEquals(student2.getName(), STUDENT_NAME);
    }

}
