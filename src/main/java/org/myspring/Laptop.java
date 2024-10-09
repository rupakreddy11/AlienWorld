package org.myspring;

public class Laptop implements Computer{

//    public Laptop(){
//        System.out.println("Alien can use Laptop");
//    }


    @Override
    public void compile(){
        System.out.println("Alien uses laptop to compile..");
    }
}
