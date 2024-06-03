package com.learn2code.demo;

import com.learn2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    //instead of creating list for everyrequest, define a field load it once using @PostConstruct
    private List<Student>theStudents=new ArrayList<>();
    @PostConstruct
    public void loadData()
    {
       // theStudents = new ArrayList<>();
        //todo:in before example this was in getStudents
        //List<Student> theStudents = new ArrayList<>();
        theStudents.add(new Student("Navya","sree"));
        theStudents.add(new Student("jeevan","gopi"));
        theStudents.add(new Student("anvesh","avula"));
        theStudents.add(new Student("greeshma","atluri"));
    }
    //define end point for students
    @GetMapping("/students/")
    public List<Student> getStudents(){

return theStudents;

    }
    //define endpoint for "/student/{studentid}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId)
    {
    //just index into the list...just keeping it simple
        return theStudents.get(studentId);
    }
}
