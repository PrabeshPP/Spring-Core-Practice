package org.springcore.ci;

public class Person {
    private String name;
    private int age;

    private Certificate certificate;

   public Person(String name,int age,Certificate certificate){
       this.name=name;
       this.age=age;
       this.certificate=certificate;
   }

   public String toString(){
       return this.name+" of "+this.age +" has completed "+this.certificate+"course on Ugiveme";
   }

}
