package com.goud.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource xmlResource= new FileSystemResource("src\\main\\java\\spring.xml");
    	BeanFactory factory = new XmlBeanFactory(xmlResource);
    	Shape tri=(Shape)factory.getBean("triangle");
    	tri.draw();
    	
    }
}
