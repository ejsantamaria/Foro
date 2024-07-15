package edu.alura.foro.service;

import edu.alura.foro.entity.Course;
import edu.alura.foro.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    public Course getCourse(long id){
        return courseRepository.getOne(id);
    }
    public Course addCourse(Course course){
        return courseRepository.save(course);
    }
    public Course updateCourse(Course course){
        return courseRepository.save(course);
    }
}
