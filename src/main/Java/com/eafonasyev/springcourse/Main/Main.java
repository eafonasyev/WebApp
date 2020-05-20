package com.eafonasyev.springcourse.Main;

import com.eafonasyev.springcourse.object.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Main  {

    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            Student student = mapper.readValue(new File("data/json1.json"),Student.class);
            System.out.println("Начало обработки");
            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());
            System.out.println(student.getAddress());
            for(String land : student.getLanguage()){
                System.out.println(land);
            }
            System.out.println("Конец обработки");

        }
        catch (Exception ex){
            System.out.println("error "+ex.toString());
        }
    }
}
