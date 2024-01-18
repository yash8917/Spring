package org.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
     private Heart heart;
@Autowired
@Qualifier("humanHeart")        // we use qualifier Annotation coz in XML file we have the two type of human
//with the same type (in terms of byType) and (in terms of byName we don't have the same dependency name
// in xml file so clarify the injection we use Qualifier Annotation
    public void setHeart(Heart heart) {
        this.heart = heart;
    }
// we can set the @Autowire both in Constructor or Setter method also
//    @Autowired
//    public Human(Heart heart) {
//        this.heart = heart;
//    }

    public void pump(){
        System.out.println("Animal name is: "+heart.getNameOfAnimal()+ " , No of heart is: "+heart.getNoOfHeart());
        heart.pumping();
    }
}
