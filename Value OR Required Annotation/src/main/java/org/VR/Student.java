package org.VR;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    //if we write the annotation before the variable/dependencies then setter method will not require
    @Value("${student.name}")
    private String name;

    @Value("${student.intrestedCource}")
    private String intrestedCource;

    @Value("${student.hobby}")
    private String hobby;
//@Value("Harry")   // Instead of type the statically , write the dynamically
//    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
        System.out.println("setter name is called");
    }
//@Required
//@Value("Spring")
//    @Value("${student.intrestedCource}")
    public void setIntrestedCource(String intrestedCource) {
        this.intrestedCource = intrestedCource;
    }
//@Value("Basketball")
//    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("IntrestedCource: "+ intrestedCource);
        System.out.println("Hobby: "+ hobby);
    }
}
