package edu.alura.foro.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Topic")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTopic")
    private Long id;
    private String title;
    private String message;
    private String date_creation;
    private String status;
    @ManyToOne
    @JoinColumn(name="idUser", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name="idCourse", nullable = false)
    private Course course;
}
