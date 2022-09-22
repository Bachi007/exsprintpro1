package com.studentms;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log=Logger.getLogger(App.class);
    public static void main( String[] args )throws GlobalException
    {
        
	student s1=new student();
	Scanner bs=new Scanner(System.in);
	log.info("Enter Student id");
	int id=bs.nextInt();
	log.info("Enter Student Name");
	String sname=bs.next();
	log.info("Enter Student Group");
	String grp=bs.next();
	s1.setStId(id);
	s1.setStName(sname);
	s1.setStGroup(grp);
	studentdao dao=new studentdao();
    	dao.saveStudent(s1);
    	log.info(s1);
//    	student s2=null;
//    	studentdao dao=new studentdao();
//    	s2=dao.retriveStudent(1);
//    	if(s2==null) {
//    		throw new GlobalException("student not found");
//    	}
//    	else {
//    		log.info(s2);
//    	}
//    	
    	
    }
}
