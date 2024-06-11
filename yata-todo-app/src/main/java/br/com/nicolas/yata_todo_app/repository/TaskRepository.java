package br.com.nicolas.yata_todo_app.repository;

import br.com.nicolas.yata_todo_app.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
