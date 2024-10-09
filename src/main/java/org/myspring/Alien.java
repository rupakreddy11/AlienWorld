package org.myspring;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }



    public Alien(){
        System.out.println("I am Alien");
    }

//    @ConstructorProperties({"age","lap"})
//    public Alien(int age,Laptop lap) {
//        System.out.println("Para Constructor Called");
//        this.age = age;
//        this.lap = lap;
//    }

    public void code(){
        System.out.println("Alien is coding..");
        com.compile();
    }
}
