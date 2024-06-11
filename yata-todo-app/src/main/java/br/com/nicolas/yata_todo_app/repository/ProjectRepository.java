package br.com.nicolas.yata_todo_app.repository;

import br.com.nicolas.yata_todo_app.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
