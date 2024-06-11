package br.com.nicolas.yata_todo_app.repository;

import br.com.nicolas.yata_todo_app.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
