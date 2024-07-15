package edu.alura.foro.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProfile")
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name="idUser", nullable = false)
    private User user;
}
