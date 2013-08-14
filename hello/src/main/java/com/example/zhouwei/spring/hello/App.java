package com.example.zhouwei.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("/beans.xml");
    	System.out.println(ac);
        System.out.println( "Hello Spring!" );
    }
}
