/*
 * Assignment 1     Software Engineering    Sinead McDonagh 12337161
 * Student Reg System 
 * Course Program class
 */
package com.nuigalway.assignment1;


import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.joda.time.*;


/**
 *
 * @author Sinead McDonagh
 */
public class CourseProgramme {
    
    private String courseName;                  //initialise course program variables
    private List<Module> modList;
    private DateTime sDate = new DateTime();   // Joda time variables
    private DateTime eDate = new DateTime();
    
    public CourseProgramme(String name, List<Module> list, DateTime start, DateTime end)
    {
        this.courseName = name;                 // assign course variables
        this.modList=list;
        this.sDate = start;
        this.eDate= end;
   
    }
    
    // Accessor method for Course Program
    //returns all details of the Course
    public String getDetails()
    {     //title includes name of course and start and end dates
        String title = courseName + " Starts: " + sDate.toString() + "and Ends: " + eDate.toString() + "\n";  // first line of print includes name, start and end dates
        String prntlst = " ";
        for(Module module : modList) {          //iterate through list of modules
            prntlst = prntlst + "\t" + module.getDetails();   //module.getdetails() returns name of module and students in module  
        }
        return title + prntlst;                 //return title and list of modules
    }
    
}
