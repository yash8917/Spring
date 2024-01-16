package org.DI;
// we can inject the dependency by using Setter injection or Constructor Injection
public class Student {
    private int id;
   private String studentName;

//   for Setter Injection we need to define the Setter Method
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }

    public void displayName(){
        System.out.println("Id of the student is: "+id+ " and Student name is : "+studentName);
    }
}
