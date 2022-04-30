package org.springcore.ci;

import java.util.List;

public class Person {
    //
    private String name;
    private int age;

    private Certificate certificate;

    private List<String> list;

   public Person(String name,int age,Certificate certificate,List<String> list){
       this.name=name;
       this.age=age;
       this.certificate=certificate;
       this.list=list;
   }

   @Override
   public String toString(){
       return this.name+" of "+this.age +" has completed "+this.certificate+" "+"course on Ugiveme"+'{'+this.list+'}';
   }

}
