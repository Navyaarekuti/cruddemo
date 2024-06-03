package com.learn2code.demo;

import com.learn2code.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    //define end point for students
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Navya","sree"));
        theStudents.add(new Student("jeevan","gopi"));
        theStudents.add(new Student("anvesh","avula"));
        theStudents.add(new Student("greeshma","atluri"));
return theStudents;

    }
}
