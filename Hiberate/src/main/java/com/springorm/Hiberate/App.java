package com.springorm.Hiberate;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.Hiberate.Dao.StudentDao;
import com.springorm.Hiberate.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
     	ApplicationContext contexts = new ClassPathXmlApplicationContext("config.xml");
     	StudentDao studentDao = contexts.getBean("studentDao1",StudentDao.class);
     	
     	Student student = new Student(1007,"first","Ngp");
     	int r = studentDao.insert(student);
     	System.out.println(r);
     	
    }
}
