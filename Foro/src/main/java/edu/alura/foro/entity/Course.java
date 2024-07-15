package edu.alura.foro.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCourse")
    private Long id;
    private String name;
    private String category;
}
