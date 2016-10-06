/*
 * Assignment 1     Software Engineering    Sinead McDonagh 12337161
 * Student Reg System 
 * Student class
 */
package com.nuigalway.assignment1;

import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author Sinead McDonagh
 */
public class Student {
    
    private String name = null;         //initalise Student variables
    private  String age = null;
    private  String dob = null;
    private  String courseCode=null;
    private  String ID=null;
    
    public Student(String name, String age, String dob, String courseCode, String id)
    {
                                     //student contructor
        this.name = name;           //assign student variables
        this.age = age;
        this.dob = dob;
        this.courseCode = courseCode;
        this.ID = id;
        
    }
    public Student()
    {
                                    //default student contructor
    }
    
    /**
     * Student Accessor method returns student name and age concattenated
     * @return
     */
    public String getUsername()
    {
        return this.name + this.age;
    }
            
}
