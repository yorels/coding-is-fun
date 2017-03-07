package com.yorels.model;

/**
 * Created by yoel.gallegos on 02/03/2017.
 */
public class StudentSingleton {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //makes it thread safe
    private static StudentSingleton student = new StudentSingleton();

    //Making private the default constructor
    private StudentSingleton() {

    }

    public static StudentSingleton getInstance(){
        return student;
    }

}
