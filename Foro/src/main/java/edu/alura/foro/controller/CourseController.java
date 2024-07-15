package edu.alura.foro.controller;

import edu.alura.foro.entity.Course;
import edu.alura.foro.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("courses")
    public @ResponseBody List<Course> getCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("course/{id}")
    public @ResponseBody Course getCourse(@PathVariable long id) {
        return courseService.getCourse(id);
    }

    @PostMapping("course")
    public @ResponseBody Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("course")
    public @ResponseBody Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }
}
