package org.annotation;

import org.springframework.stereotype.Component;

//@Component("collegeBean")       // this anno. is used to create the bean
//the other way to define the bean using Bean Annotation
public class College
{
   public void test(){
       System.out.println("Test is done");
   }
}
