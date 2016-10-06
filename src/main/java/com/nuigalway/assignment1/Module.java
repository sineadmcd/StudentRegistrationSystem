/*
 * Assignment 1     Software Engineering    Sinead McDonagh 12337161
 * Student Reg System 
 * Module class
 */
package com.nuigalway.assignment1;

import java.util.List;

/**
 *
 * @author Sinead McDonagh
 */
public class Module {
    
    private String modName;         //initilize Module variables
    private String modID;
    private List<Student> studList;
    
    /**
     *
     * @param name
     * @param id
     * @param list
     */
    public Module(String name, String id, List<Student> list)
    {                               //Module Constructor
        this.modName= name;         //assign Module variables
        this.modID = id;
        this.studList = list;
    }
    
    //Accessor method for Module returns details of Module
    //including: Module name and list of student usernames enrolled in given module.
    public String getDetails()
    {
         String title =  modName + "\n Assigned students:" ;    //title : module name
         String prntlst = "\n";                                 // list the assigned students
         for( Student student : studList)                       // iterate through list
         {
             prntlst = prntlst + student.getUsername() + "\n";
         }
         return title + prntlst;                                // return module name and list

    }
}
