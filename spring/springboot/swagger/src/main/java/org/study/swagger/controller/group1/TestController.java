package org.study.swagger.controller.group1;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.study.swagger.bean.Person;
import org.study.swagger.bean.School;
import org.study.swagger.bean.Student;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "第一组")
@RestController
public class TestController {

    @ApiOperation("更新学生信息")
    @RequestMapping(value = "/setStudent",method = RequestMethod.POST)
    public Student setStudent(Person person){
        Student student = new Student();
        student.setStudentId(1001);
        student.setScore(100);
        student.setName(person.getName());
        student.setAddress(person.getAddress());
        return student;
    }

    @ApiOperation("获取学校信息及学生列表")
    @RequestMapping(value = "/getSchool",method = RequestMethod.GET)
    public School getSchool(){
        School school = new School();
        Student s1 = new Student();
        s1.setNumber(1001);
        s1.setScore(100);
        s1.setStudentId(1);
        Student s2 = new Student();
        s2.setNumber(1001);
        s2.setScore(100);
        s2.setStudentId(1);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        school.setStudentList(list);
        return school;
    }

    @RequestMapping("/api-docs")
    public String docs(){
        return null;
    }
}
