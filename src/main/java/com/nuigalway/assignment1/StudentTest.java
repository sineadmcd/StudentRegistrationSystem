package com.nuigalway.assignment1;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.nuigalway.assignment1.Student;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class StudentTest extends Student{
    
    /**
     *
     */
    @Test
        public void testGetUsername()
        {
            Student me = new Student("Sinead", "21", "25/02/1995", "4bp", "12337161");
            String concat = me.getUsername();
            assertEquals("Sinead21", concat);
            
        }
        
    
    
}
