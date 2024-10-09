package org.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates a container
        Alien obj = (Alien) context.getBean("alien");
        System.out.println("Alien age is " + obj.getAge());
          obj.code();

    }
}
