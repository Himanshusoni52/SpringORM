package com.springorm.Hiberate;



import java.util.List;

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
     	
//  	SingleStudentData By ID
//    	Student i = studentDao.getStudennt(1077);
//    	System.out.println("StudentID:"+i.getStudentID()+" "+" StudentName:"+i.getStudentName()+" " +"StudentCity:"+i.getStudentCity());

   
//  	 AllStudentDisplay
//     	List<Student> rs= studentDao.getAllStudents();
//     	for(Student i : rs)
//     	{
//     		System.out.println("StudentID:"+i.getStudentID()+" "+" StudentName:"+i.getStudentName()+" " +"StudentCity:"+i.getStudentCity());
//     	}
 
     	
//		Deleting data
//     		studentDao.deleteStudent(1078);
//     		System.out.println("Student data Delete");
     	
     	//Data Updated
     	Student student = new Student();
       	student.setStudentID(1077);
     	student.setStudentName("Bholu");
     	student.setStudentCity("Parasia");
     	studentDao.updateStudent(student);
     	System.out.println("After");
    	Student i = studentDao.getStudennt(1077);
    	System.out.println("StudentID:"+i.getStudentID()+" "+" StudentName:"+i.getStudentName()+" " +"StudentCity:"+i.getStudentCity());

     	
     	
     	
    }
}
