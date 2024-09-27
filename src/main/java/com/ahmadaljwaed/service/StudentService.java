package com.ahmadaljwaed.service;

import com.ahmadaljwaed.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




@Service
public class StudentService
{

    private static int studentnumber=4;
    private static List<Student> studentlist=new ArrayList<Student>();
 static {

     studentlist.add(new Student(1,"Ahmad Aljwaed","1-1-2024",true));
     studentlist.add(new Student(2,"Mohamad Aljwaed","1-1-2022",true));
     studentlist.add(new Student(3,"ali Aljwaed","1-1-2021",true));
     studentlist.add(new Student(4,"Omar Aljwaed","1-1-2023",true));
 }
 public List <Student> readStudents(){
     List<Student>students=new ArrayList<Student>();

     for(Student st:students){

             students.add(st);


     }
     return students;
 }


 public void addStudent(Student student){
     studentlist.add(student);
 }

public void deleteStudent(int id){
    Iterator<Student>iterator=studentlist.iterator();
    while(iterator.hasNext()){
        Student student=iterator.next();
        if(student.getId()==id){
            iterator.remove();
        }
    }
}
}
