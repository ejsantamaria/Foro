package edu.alura.foro.repository;

import edu.alura.foro.entity.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResponseRepository extends JpaRepository<Response, Long> {
}
