package edu.alura.foro.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Response")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCourse")
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name="idUser", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name="idTopic", nullable = false)
    private Topic topic;
}
